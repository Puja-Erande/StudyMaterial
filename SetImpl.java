import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;


public class SetImpl {

	public static void main(String[] args) throws IOException {
		Properties p = new Properties();
		p.setProperty("db1", "postgresq");
		p.setProperty("db2", "oracle");
		
		Enumeration itr = p.elements();
		while(itr.hasMoreElements())
		{
			System.out.println(itr.nextElement());
		}
		
		FileInputStream fs =  new FileInputStream("/BinarySearch/src/db.properties");
		Properties p2 = new Properties();
		p2.load(fs);
		System.out.println(p2);

      
	}
}
