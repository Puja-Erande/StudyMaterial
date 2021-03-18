
public class ArraySmallestElement {
	
	/*
	 * this method finds the kth smallest element from the given array
	 */
	
	public static int kthSmallest(int[] arr, int l, int r, int k) 
	{ 
	    for(int i=0;i<k;i++){
	        int min = arr[i]; 
	        int index = i;
	        for(int j=i+1;j<arr.length;j++){
	            if(arr[j]<min){
	                min = arr[j]; 
	                index = j;   
	            }
	        }
	        
	        int temp = arr[i];
	        arr[i] = min;
	        arr[index] = temp;
	    }
	    
	    return arr[k-1];
	}
	public static void main(String[] args) {
		
		int[] arr= {12,5,787,1,23};
		int element = kthSmallest(arr,0,4,2);
		System.out.println("2 smallest element is "+ element);
		
	}

}
