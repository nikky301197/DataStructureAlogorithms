package recursion;

public class Q1_Factorial {
	
	public static int factorial (int n )
	{
		if(n ==1)
		{
			return 1 ;
		}
		return n*factorial(--n);
		
	}
public static void main(String[] args) {
	
	int n = 4 ;
	int result = factorial(n);
	System.out.println(result);
}
}
