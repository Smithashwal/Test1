package abcd;

public class Fibonacci {

	public static void main(String[] args) {

		int fib0 = 0;
		int fib1 = 1;
		int fib2 = fib0 + fib1;

		System.out.println("value is : " + fib2);
		int n = 10;

		/*for (int i = 0; i < n; i++) {
			fib0 = fib1;
			fib1 = fib2;
			fib2 = fib0 + fib1;
			System.out.println("value is : " + fib2);

		}
*/
		
	   Fibonacci fibonacci=	new Fibonacci();
	   int result = fibonacci.fibonacci(6);
	   System.out.println(result);
	}

	public int fibonacci(int n) {

		if (n == 1)
			return 1;
		if (n == 0)
			return 0;

		return fibonacci(n - 2) + fibonacci(n - 1);

	}
}
