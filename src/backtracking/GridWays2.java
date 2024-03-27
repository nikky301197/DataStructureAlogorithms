package backtracking;

public class GridWays2 {
	public static void main(String[] args) {
		int m = 10;
		int n = 10;
//		int  v1 = fact((m - 1) + (n - 1));
//		System.out.println(v1);
//		int  v2 = fact(m - 1);
//		System.out.println(v2);
//		int  v3 = fact(n - 1);
//		System.out.println(v3);
//		long  result = v1 / (v2 * v3);
		System.out.println( fact((m - 1) + (n - 1))/ (fact(m - 1)*fact(n - 1)));
		
//System.out.println(result);
int aa = 48620;
System.out.println(aa);
	}

	static long  fact(int v) {
		long  f = 1l;
		for (int i = v; i >= 1; i--) {
			f = f * i;
		}

		return f;
	}

}
