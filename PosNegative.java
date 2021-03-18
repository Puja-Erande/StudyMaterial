
public class PosNegative {
	
	public static void main(String[] args) {
		int arr[] = {-12,11,23,-23,34,-12,34,23,-34,67};
		/*
		 * for(int i=0;i<arr.length;i++) { int j=i; if((arr[i] ^ Math.abs(arr[i]))==0) {
		 * while(i<arr.length-1 && (arr[i] ^ Math.abs(arr[i]))==0){ i++; } int temp =
		 * arr[j]; arr[j] = arr[i]; arr[i] = temp;
		 * 
		 * i=j; } }
		 */
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0){
			    int temp = arr[i];
			    arr[i] = arr[j];
			    arr[j] = temp;
			    j++;
			}
		}
	
	for(Integer in:arr) {
		System.out.println(in);
	}
	}

}
