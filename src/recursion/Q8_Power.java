package recursion;

public class Q8_Power {

	static int power(int n, int p) {
		if (p == 0) {
			return 1;
		}

		return n * power(n, p - 1);
	}

	public static void main(String[] args) {

		int result = power(3, 3);
		System.out.println(result);
	}

}
