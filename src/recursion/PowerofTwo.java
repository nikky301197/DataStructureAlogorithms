package recursion;

public class PowerofTwo {

	static boolean isPowerOfTwo(int n) {
		if (n == 1) {
			return true;
		}
          
		if (n % 2 != 0) {
			return false;
		}
		return isPowerOfTwo(n / 2);
	}

	public static void main(String[] args) {

		int n = 6;
		boolean result = isPowerOfTwo(n);
		System.out.println(result);
		System.out.println(Math.log(15)); 
		System.out.println(Math.log(2)); 
		double r = Math.log(536870912)/Math.log(2);
		System.out.println(Math.floor(r));
		System.out.println(Math.ceil(r));
//		System.out.println(Math.log(8)/Math.log(2));
		System.out.println(Math.pow(2, 30));
		
	}
}
