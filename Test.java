
public class Test extends Thread {
	
	@Override
	public void run()
	{
		for(int i=0;i<5;i++)
		{
		System.out.println("Child Thead");
		
		}
	}

	public static void main(String[] args) {
		System.out.println("Processor: "+Runtime.getRuntime().availableProcessors());
		
		Test t1 = new Test();
		//Thread t2 = new Thread(t1);
		t1.setPriority(6);
		t1.start();
		//System.out.println(t2.getName());
		for(int i=0;i<5;i++)
		{
			System.out.println("Parent Thead");
		}

	}

}
