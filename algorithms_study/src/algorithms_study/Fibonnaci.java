package algorithms_study;

public class Fibonnaci {

	public static void main(String[] args) {
		int number = 4;
		System.out.println(fibonacciRec(number));
	}

	private static int fibonacciRec(int number) {
		// F = fn-1 + fn-2
		if (number == 1 || number == 2) {
			return 1;
		}

		return fibonacciRec(number - 1) + fibonacciRec(number - 2);
	}

//	private static long calcFibonacci(int number) {
//
//		int f1 = 1, f2 = 1, fibonacci = 1;
//		System.out.println(f1);
//		System.out.println(f2);
//		for (int i = 3; i <= number; i++) {
//			fibonacci = f1 + f2;
//			f1 = f2;
//			f2 = fibonacci;
//			System.out.println(fibonacci);
//		}
//		return fibonacci;
//	}

}
