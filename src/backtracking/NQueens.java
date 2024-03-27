 package backtracking;

public class NQueens {
	public static void main(String[] args) {
		int n = 2;
		char board[][] = new char[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = '_';
			}
		}
		nQueens(board, 0);
//		printArray(board, n);
	}

	private static void nQueens(char[][] board, int row) {
		// TODO Auto-generated method stub
		if (row == board.length) {
			printArray(board, board.length);
			return;
		}

		for (int j = 0; j < board.length; j++) {
			board[row][j] = 'Q';
			nQueens(board, row + 1);
			board[row][j] = '_';

		}

	}

	private static void printArray(char[][] board, int n) {
		// TODO Auto-generated method stub
//		
		System.out.println("----------------chese board------------");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}

	}
}
