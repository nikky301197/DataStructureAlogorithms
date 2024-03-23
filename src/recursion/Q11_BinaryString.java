package recursion;

// print a binary string  which does not have consecutive ones;
public class Q11_BinaryString {

	static Boolean checkBinaryString(String str, int i) {
		if (i == str.length() - 1) // base case
		{
			System.out.println(str);
			return true;
		}
		if (str.charAt(i) == '1' && str.charAt(i + 1) == '1') {
			return false;
		}

		return checkBinaryString(str, i + 1);
	}

	public static void main(String[] args) {

		checkBinaryString("1010101", 0);
	}

}
