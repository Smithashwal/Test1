package abcd;

public class Array {
	

    
	
	static int getMissingNo(int a[], int n) {
		
	int i, total;
	
	total= ((n+1)*n)/2;
	for(i=0; i<n-1;i++) {
		total= total-a[i];
	}
	return total;

	}
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,7,8,9,10};
     int missing = getMissingNo(a,a.length);
     System.out.println(missing);
	}

}
