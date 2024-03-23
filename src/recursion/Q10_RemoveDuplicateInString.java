package recursion;

public class Q10_RemoveDuplicateInString {

	static String newstr = "";

	static String removeDuplicate(String str, int i) {
		if (i == str.length() - 1) {
			return newstr;
		}
//		boolean check = newstr.contains(str.charAt(i) + "");
//		if (!check) {
//			newstr = newstr + str.charAt(i);
//		}
		newstr = newstr.contains(str.charAt(i) + "") ? newstr : newstr + str.charAt(i);
		return removeDuplicate(str, i + 1);
	}

	public static void main(String[] args) {

		String s = "apnnacollege";
		String nonDuplicateString = removeDuplicate(s, 0);
		System.out.println(nonDuplicateString);
	}
}
