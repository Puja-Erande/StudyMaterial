import java.util.HashMap;
import java.util.WeakHashMap;

class Main {
	public static void main(String[] args) {
		Temp t1 = new Temp();
		java.util.Map<Temp,String> map = new WeakHashMap<Temp, String>();
		map.put(t1,"Abcd");
		System.out.println(map);
		t1=null;
		System.gc();
		System.out.println(map);

	}
}

class Temp
{
	public String toString()
	{
		return "Inside toSTring";
	}
	
	public void finalize()
	{
		System.out.println("Inside finalize method");
	}
}