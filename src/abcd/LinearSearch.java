package abcd;

public class LinearSearch {

	public static void main(String[] args) {
 
		
		int[] arr =  new int[] {10,14,2,6,7,1,9,45,68,3,55,99,41};
		int key = 55;
		
		for (int i=0; i<arr.length; i++) {
			
			
			if (arr[i]==key) {
				System.out.println("The key is found");
				break;
			}
		}
	}

}
