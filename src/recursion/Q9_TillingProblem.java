package recursion;

//Given a “2 x n” board and tiles of size “2 x 1”, 
//count the number of ways to tile the given board using the 2 x 1 tiles.
//A tile can either be placed horizontally i.e.,
//as a 1 x 2 tile or vertically i.e., as 2 x 1 tile.

public class Q9_TillingProblem {

	static int tilling(int n) {
		if (n == 1 || n == 0) {
			return 1;
		}

		int fn_1 = tilling(n - 1);
		int fn_2 = tilling(n - 2);
		return fn_1 + fn_2;

	}

	public static void main(String[] args) {

		int result = tilling(4);
		System.out.println(result);
	}
}
