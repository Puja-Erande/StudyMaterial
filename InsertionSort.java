import java.util.Stack;

public class InsertionSort
{
	public static void main(String[] args) {
		Stack st = new Stack();
		int arr[] = {1,2,3,4,5,6};
		int top = -1;
		top++;
		for(int i=0;i<arr.length;i++)
		{
			st.push(arr[i]);
			//top++;
			
		}
		
		for(int i=0;i<arr.length;i++)
		{
		System.out.println(st.pop());
		}
		
	}
}