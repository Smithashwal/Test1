package abcd;

public class BinarySearch {

	public int binarySearch(int[] arr, int start, int end, int key) {

		if (start < end) {
			int mid = (start + end) / 2;

			if (arr[mid] == key) {
				return mid;
			}

			else if (key < arr[mid]) {
				return binarySearch(arr, 0, mid - 1, key);

			} else {
				return binarySearch(arr, mid+1, arr.length-1, key);
			}

		}
		return -1;

	}

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13,14, 15 };
		int key = 14;

		BinarySearch binarySearch = new BinarySearch();
		int result = binarySearch.binarySearch(arr, 0, arr.length-1, key);

		if (result!=-1) {
			System.out.println("Key Found at : "+result );

		} else {
			System.out.println("Key Not Found");
		}
	}

}
