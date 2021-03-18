

 class SynchonizationJava1 extends Thread{
	
	public int a;
	public int b;
	
	public synchronized void run()
	{
		System.out.println("Thread:"+Thread.currentThread().getName());
		System.out.println(a++);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
 }
 
 public class SynchonizationJava
 {
	 
	 public void m1()
	 {
		synchronized (SynchonizationJava.class)
		 {
			 System.out.println("static block");
		 }
	 }
	
	public static void main(String[] args) throws InterruptedException {
		SynchonizationJava1 obj = new SynchonizationJava1();
		SynchonizationJava1 obj1 = new SynchonizationJava1();
		obj.start();
		obj1.start();
		System.out.println("Thread:"+Thread.currentThread().getName());
	}

}
