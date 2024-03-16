package array;

import java.util.ArrayList;
import java.util.List;

public class Q16_SpiralMatrix {
	public static void main(String[] args) {
		int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		int m = matrix.length;
		int n = matrix[0].length ;
		List<Integer> spinalMatrix = new ArrayList<>();
		for (int i = 0; i < m; i++) {
			if (i%2==0)
			{
				for(int j= 0 ; j <n ;j ++)
				{
					spinalMatrix.add(matrix[i][j]);	
				}
			}
			else
			{
				for(int j= n-1 ; j >=0 ;j--)
				{
					spinalMatrix.add(matrix[i][j]);	
				}
				
			}
		}
		
		System.out.println(spinalMatrix);
	}
}
