import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Graph implements Serializable,Cloneable {
	
	int id;
	String Name;
	public Graph(int i, String string) {
		// TODO Auto-generated constructor stub
		this.id=i;
		this.Name=string;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
	public static void main(String[] args) throws IOException, ClassNotFoundException, CloneNotSupportedException {
		Graph gr = new Graph(10,"Puja");
		Graph gr1 = null;
		gr1 = (Graph)gr.clone();
		gr1.id=8;
		System.out.println(gr.id+" "+gr.Name);
		System.out.println(gr1.id+" "+gr1.Name);
		FileOutputStream file = new FileOutputStream("puja.txt");
		ObjectOutputStream out = new ObjectOutputStream(file);
		out.writeObject(gr);
		
		FileInputStream f = new FileInputStream("puja.txt");
		ObjectInputStream in = new ObjectInputStream(f);
		Graph grp =(Graph)in.readObject();
		
	}

}
