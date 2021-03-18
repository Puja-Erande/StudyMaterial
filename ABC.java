
public class ABC implements AB  {

	@Override
	public void getName() {
		// TODO Auto-generated method stub
		
	}
	
	public int m2(int x)
	{
		return x;
		
	}
	
	public static int m2(float x)
	{
		System.out.println("m2");
		return 0;
		
	}
	
	public void m1(int x,float f) throws Exception
	{
		System.out.println("inside int-float");
	}
	
	public void m1(float f,int x)
	{
		System.out.println("inside float-int");
	}
	
	public void m1(int x)
	{
		System.out.println("inside int");
	}
	
	public void m1(int... x)
	{
		System.out.println("inside var -arg");
	}
	
	public static void main(String[] args) throws Exception {
		
		ABC abc = new ABC();
		abc.m1(10,10.5f);
		//abc.m1(10,10);
		abc.m1();
		
	}
	

}
