package recursion;

public class Q3_PrintNumInAscending {
	int sum = 0;

	static int print(int n) {
		if (n == 1) {
			return 1;
		}
		return n + print(n - 1);
	}

	public static void main(String[] args) {
		int result = print(10);
		System.out.println(result);
	}

}

//1 , 1, 2 ,3 ,5, 8  , 12, 20 , 
