
public class StaticFlow {

	int i = 10;
	{
		m1();
		System.out.println("1st instance block");
	}
	
	public StaticFlow() {
		System.out.println("Constructore called");
	}
	
	public static void main(String[] args) {
		StaticFlow t = new StaticFlow();
		System.out.println("Inside main");
		StaticFlow t1 = new StaticFlow();

	}

	private void m1() {
		System.out.println(j);

	}

	int j = 20;

}
