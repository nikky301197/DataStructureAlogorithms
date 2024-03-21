package twoDArray;

import java.util.ArrayList;
import java.util.List;

public class Q1_SpiralArray {
	public static void main(String[] args) {
		int matrix[][] = { {1,2,3,4},{5,6,7,8},{9,10,11,12}};
		int sr = 0;
		int er = matrix.length - 1;
		int sc = 0;
		int ec = matrix[0].length - 1;;
		List<Integer> spiral =new ArrayList<>();
		while(sr<=er && sc<=ec)
		{
			for(int j = sc ; j <= ec ; j ++)
			{
				System.out.print(matrix[sr][j]+" ");
				  spiral.add(matrix[sr][j]);
				  
			}
			for(int i = sr+1 ; i<= er ; i++)
			{
				System.out.print(matrix[i][ec]+" ");
				spiral.add(matrix[i][ec]);
			}
			for(int j = ec-1 ; j >= sc ; j--)
			{
				if(sr==er)
				{
					break;
				}
				System.out.print(matrix[er][j]+" ");
				spiral.add(matrix[er][j]);
			}
			for(int i  = er-1 ; i > sr ; i--)
			{
				if(sc==ec)
				{
					break;
				}
				System.out.print(matrix[i][sc]+" ");
				spiral.add(matrix[i][sc]);
			}
			
			sr++;
			sc++;
			er--;
			ec--;
		}
	}
}
