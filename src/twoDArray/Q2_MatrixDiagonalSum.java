package twoDArray;

public class Q2_MatrixDiagonalSum {
	public static void main(String[] args) {
		
		int mat[][]= {{5}
	        };
		
		
		int n = mat.length;
		int sum = 0;
		
			int mid = (n-1)/2;
			for(int i = 0 ; i < n ; i++)
			{
				for(int j = 0 ; j < n ; j ++)
				{
					if (i== j  )
					{
//						System.out.println(mat[i][j]);
						sum = sum + mat[i][j];
					}
					else if (i+j== n-1)
					{
//						System.out.println(mat[i][j]);
						sum = sum +mat[i][j];
					}
				}
			}
			
		System.out.println(sum);
	}
}