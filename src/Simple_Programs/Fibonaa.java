package Simple_Programs;

public class Fibonaa {
	public static void main(String[] args) {

		// 0 1 1 2 3
		
		  for (int i = 0; i < 10; i++) { System.out.print(" " + fibo(i)); }
		  
		  // OR

		int f0 = 0, f1 = 1;
		System.out.println(f0);
		System.out.println(f1);

		for (int j = 0; j < 5; j++) {
			int fib = f0 + f1;
			f0 = f1;
			f1 = fib;
			System.out.println(f1);
		}
	}

	public static int fibo(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		return fibo(n - 1) + fibo(n - 2);
	}
}
