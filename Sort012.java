 

class countzot { 

	// Sort the input array, the array is assumed to 
	// have values in {0, 1, 2} 
	static void sort012(int a[], int n) 
	{ 
		int low,mid;
	    low=mid=0;
	    int high = n-1;
	    int temp = 0;
	    
	    while(mid<=high){
	        switch(a[mid]){
	            case 0:{
	            temp = a[low];
	            a[low] = a[mid];
	            a[mid] = temp;
	            low++;
	            mid++;
	            break;
	            }
	                    
	            case 1:
	            mid++;
	            break;
	            
	                    
	            case 2:{
	            temp = a[mid];
	            a[mid] = a[high];
	            a[high] = temp;
	            high--;
	            break;
	            }
	        }
	    } 
	} 

	/* Utility function to print array arr[] */
	static void printArray(int arr[], int n) 
	{ 
		int i; 
		for (i = 0; i < n; i++) 
			System.out.print(arr[i] + " "); 
		System.out.println(""); 
	} 

	/*Driver function to check for above functions*/
	public static void main(String[] args) 
	{ 
		int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 }; 
		int n = arr.length; 
		sort012(arr, n); 
		System.out.println("Array after seggregation "); 
		printArray(arr, n); 
	} 
} 
/*This code is contributed by Devesh Agrawal*/
