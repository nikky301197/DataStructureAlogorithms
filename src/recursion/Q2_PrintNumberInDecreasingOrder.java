package recursion;

public class Q2_PrintNumberInDecreasingOrder {
	static void print(int n )
	{
		System.out.println(n);
		if (n == 1)
			return ;
		print(n-1);
	}
public static void main(String[] args) {
	
	int n = 10 ;
	print(n);
}
}
