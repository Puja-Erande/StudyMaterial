import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;


class Chil extends Parent {
	Chil() throws Exception
	{
		
	}
	
	public final void Test()
	{
		
	}
	
}
 
 public class Child
 {
	
	 public static void m1() throws Exception 
	 {
		try(Connection con = DriverManager.getConnection(""))
		{
			m2();
			System.gc();
		}
		catch(IOException | ArithmeticException | NullPointerException io)
		{
			System.out.println("finally");
			throw new Exception();
		}
		 
	 }
	private static void m2() throws IOException{
	 FileInputStream fs =new FileInputStream(new File("abc.txt"));
	 fs.read();	
	}
	
	public static void main(String[] args) throws Exception  {
		Child.m1();
	}
	
 }


