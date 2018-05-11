package abcd;

public class PrintNumber {

	public static void main(String[] args) {

		PrintNumber printNumber = new PrintNumber();
		printNumber.print(5);
	}

	public void print(int n) {
		if (n == 0) {
			System.out.println(n);
			return;
		}
		
		print(n - 1);
		System.out.println(n);
	}

}
