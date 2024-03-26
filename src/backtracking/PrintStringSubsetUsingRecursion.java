package backtracking;

public class PrintStringSubsetUsingRecursion {

	public static void main(String[] args) {
		String str = "abc";

		findSubset(str, "", 0);
	}

	private static void findSubset(String s, String ans, int i) {
		// TODO Auto-generated method stub
		if (i == s.length()) {
			System.out.print(ans+" ");
			return;
		}

//	if choice is yes 
		findSubset(s,  ans+s.charAt(i), i + 1);
//	if choice is no 
		findSubset(s, ans, i + 1);
	}
}
