
public class ConstructorOverloading {
	
	public ConstructorOverloading()
	{
		this(10);
		System.out.println("No-Argument constructor");
	}
	
	public ConstructorOverloading(int i)
	{
		this(10.5f);
		System.out.println("int constructor");
	}

	public ConstructorOverloading(float f) {
		System.out.println("float constructor");
	}
	
	public static void main(String[] args) {
		System.out.println("main method");
		ConstructorOverloading constructorOverloading = new ConstructorOverloading();
	}

}
