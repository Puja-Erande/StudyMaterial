
public class BinarySearchDemo {

	public static void main(String[] args) {
		int arr[] = {1,3,5,7,8,9,21};
		BinarySearchDemo binarySearchDemo = new BinarySearchDemo();
		binarySearchDemo.binarySearchForElement(arr,1,0,arr.length-1);
		

	}

	private void binarySearchForElement(int[] arr, int i, int left, int right) {
		
		int result =binarySearch(arr,i,left,right);
		System.out.println("result:"+result);
	}

	private int binarySearch(int[] arr,int searchKey, int left2, int right2) {
		int left=left2;
		int right=right2;
		while(left <=right)
		{
			int mid = (left+right)/2;
			if(arr[mid]==searchKey)
			{
				return 1;
			}
			else if(arr[mid]<searchKey)
			{
				return binarySearch(arr,searchKey,mid+1,right);
			}
			else
			{
				return binarySearch(arr,searchKey,0,mid-1);
			}
		}
		return -1;
		
	}

}
