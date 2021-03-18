public class LinkedListImpl {
	
	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		System.out.println(rt.freeMemory());
		int[] arr = new int[100000];
		for(int i=0;i<100000;i++)
		{
			arr[i]=i;
		}
		System.out.println(rt.freeMemory());
		arr=null;
		rt.gc();
		System.out.println(rt.freeMemory());
		
	}
	
}
