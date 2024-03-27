package backtracking;

public class GridWays {
//	static int targetrow = 2;
//	static int targetcolumn = 6;
	static int ways = 0;

	public static void main(String[] args) {
		
		int m = 19 ;
		int n = 13;
		
		findGridWays(m,n,0,0);
		System.out.println(ways);
	}

//	private static void findGridWays(int[][] a, int r, int c) {
//		// TODO Auto-generated method stub
//
//		if (targetrow == r && targetcolumn == c) {
//			ways++;
//			return;
//		}
////		r cannot be increase more than max row lenth same for coloumn 
//		if (r == a.length || c == a[0].length) {
//			return;
//		}
////	to move rigth 
//		findGridWays(a, r, c + 1);
////	 to move down 
//		findGridWays(a, r + 1, c);
//		return;
//	}


	public static  void findGridWays(int m, int n, int r, int c) {
		// TODO Auto-generated method stub

		if (m - 1 == r && n - 1 == c) {
			ways++;
			return;
		}
//			r cannot be increase more than max row lenth same for coloumn 
		if (r == m || c == n) {
			return;
		}
//		to move rigth 
		if (r < m) {
			findGridWays(m, n, r, c + 1);
		}
//		 to move down 
		if (c < n) {
			findGridWays(m, n, r + 1, c);
		}
		return;
	}
}
