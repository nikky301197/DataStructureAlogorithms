package recursion;

public class Pow_x_n {

	static double myPow(double x , double n )
	{
		if (n == 1)
		{
			return x ;
		}
		return x * myPow(x,n-1);
	}
	public static void main(String[] args) {
		System.out.println( myPow(2.00000,10));
	}
}
