package array;

public class RichestCustomerWealth {
public static void main(String[] args) {
	int accounts [][]= {{1,2,3},{3,2,1}};
	int row = accounts.length;
	int coloumn = accounts[0].length;
	int max = Integer.MIN_VALUE;
	int sum =0;
	for(int i = 0 ;i<row;i++ )
	{
		for(int j = 0; j < coloumn ; j ++)
		{
			sum = sum+ accounts[i][j];
		}
		max = Math.max(sum , max);
		sum =0;
	}
}
}
