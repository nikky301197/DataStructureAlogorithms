package recursion;

public class Q4_FibonacciSeries {
	static int i = 0;
	static int j = 1;
	static int next = i + j;

	static int print(int n) {

		if (n == 1 || n == 0) {
			return n;
		}

		int f1 = print(n - 1);
		int f2 = print(n - 2);
		return f1 + f2;
	}

	public static void main(String[] args) {

		int n = 5;
		print(n);
//		int f = 0;
//		int l = 1;
//		int next = f + l;
//		0 1 1 2 3 5 8
//		for (int i = 1; i <= n; i++) {
//			if (i == 1) {
//				System.out.print(l + " ");
//				continue;
//			}
//			next = f + l; // next = 2 f = 1 l = 2
//			System.out.print(next + " ");
//			f = l;
//			l = next;
//
//		}

	}

}
