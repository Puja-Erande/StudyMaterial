class A
{
	public synchronized void m1(B b)
	{
		System.out.println("Inside A's m1() method");
		try
		{
			Thread.sleep(1000);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		b.last();
	}
	
	public synchronized void last()
	{
		System.out.println("Inside A's last() method");
	}
	
}

class B
{
	public synchronized void m1(A a)
	{
		System.out.println("Inside B's m1() method");
		try
		{
			Thread.sleep(1000);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		a.last();
	}
	
	public synchronized void last()
	{
		System.out.println("Inside B's last() method");
	}
	
}

public class Deadlock extends Thread
{
	A a = new A();
	B b = new B();
	
	public void m1()
	{
		this.start();
		b.m1(a);
	}
	
	public void run()
	{
		a.m1(b);
	}
	public static void main(String[] args)
	{
		Deadlock deadlock = new Deadlock();
		deadlock.m1();
		
	}
		
}
