/*package whatever //do not write package name here */

import java.util.Scanner;

class ArrayRotation {
    
    public static void rotateArray(int[] arr,int N,int D){
    	int rotation = 0;
    	while(rotation < D) {
        int temp = arr[0];
        int j = 0;
        for(j=0;j<N-1;j++) {
           arr[j] = arr[j+1]; 
        }
        arr[j] = temp;
        rotation++;
    	}
    }
	public static void main (String[] args) {
		//code
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- > 0){
		int N = sc.nextInt();
		int D = sc.nextInt();
		int arr[] = new int[N];
		for(int i=0;i<N;i++){
		   arr[i] = sc.nextInt(); 
		}
		//while(rotation < D){
		rotateArray(arr,N,D);
	
		//}
	    
	    for(Integer a:arr){
	        System.out.print(a+" ");
	    }
	    System.out.println(" ");
		}
	}
}