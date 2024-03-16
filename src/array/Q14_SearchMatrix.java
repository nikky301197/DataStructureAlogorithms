package array;

public class Q14_SearchMatrix {
	public static void main(String[] args) {

		int matrix[][] = { { 1 } };
		int target = 1;
		int r = matrix.length;
		int c = matrix[0].length - 1;
		int rowFound = -1;
		boolean flag = false;

		for (int i = 0; i < r; i++) {
			if (matrix[i][0] <= target && target <= matrix[i][c]) {
				rowFound = i;
				break;
			}
		}
		if (rowFound != -1) {
			for (int i = 0; i <= c; i++) {
				if (matrix[rowFound][i] == target) {
					flag = true;
					break;
				}
			}
		}

		System.out.println(flag);
	}

}
