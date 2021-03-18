// Java program to illustrate yield() method 
// in Java 

// MyThread extending Thread 
class MyThread extends Thread 
{ 
	public void run() 
	{ 
		for (int i=0; i<5 ; i++) {
			System.out.println(Thread.currentThread().getThreadGroup());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() 
								+ " in control");
		}
	} 
} 

// Driver Class 
public class YieldDemo 
{ 
	public static void main(String[]args) throws InterruptedException 
	{ 
		MyThread t = new MyThread(); 
		t.setDaemon(true);
		t.start(); 
		System.out.println("main thread");
	} 
} 
