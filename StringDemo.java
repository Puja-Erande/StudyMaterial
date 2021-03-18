
public class StringDemo {

	public static void main(String[] args) {
		byte[] b = {100,101,103,102};
		String s = new String(b);
		System.out.println(s);
		
		Object obj = new Object();
		Object obj1 = new Object();
		System.out.println("Comparison "+obj.equals(obj1));

	}

}
