package backtracking;

public class GridWays1 {
public static void main(String[] args) {
	int m = 3 ;
	int n = 2;
	findGridWays(m, n , 0, 0);
}

public  static int findGridWays(int m, int n, int i, int j) {
	// TODO Auto-generated method stub
	if (i== m-1 &&  j == n-1)
	{
		return 1;
	}
	else if (i== m || i ==n)
	{
		return 0;
	}
	int w1 = findGridWays(m, n, i, j+1);
	int w2 = findGridWays(m, n, i+1, j);
	return w1+w2;
}
}
