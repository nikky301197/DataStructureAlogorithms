package recursion;

public class PowerofThree {

	static boolean isPowerOfThree(int n )
	{
		if (n ==1)
		{
			return true ;
		}
		if (n%2== 0 )
		{
			return false ;
		
		}
	    if((double)n/3!=n/3)
	    {
	    	return false ;
	    }
		
		return isPowerOfThree(n/3);
	}
	public static void main(String[] args) {
		System.out.println( isPowerOfThree(45));
	}
}
