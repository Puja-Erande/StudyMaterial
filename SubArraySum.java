import java.util.ArrayList;
import java.util.Collections;

public class SubArraySum {

	public static void main(String[] args) {
		int arr[] = {1, 10, 5, 2, 7};
		SubArraySum subArraySum = new SubArraySum();
		subArraySum.findSubArray(arr);

	}

	private void findSubArray(int[] arr) {
		ArrayList arrayList = new ArrayList();
		for(int i=0;i<arr.length;i++)
		{
			int sum =0;
			for(int j=i;j<arr.length;j++)
			{
				
				if(i==j)
				{
					sum = arr[j];
				}
				else
				{
				
				sum = sum+arr[j];
				}
				if(sum > 9)
				{
					arrayList.add(j-i+1);
				}
			}
		}
		
		Collections.sort(arrayList);
		System.out.println(arrayList.get(0));
		
		
	}

}
