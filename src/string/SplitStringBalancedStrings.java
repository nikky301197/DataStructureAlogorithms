package string;

public class SplitStringBalancedStrings {
	public static void main(String[] args) {

		String s = "LLLLRRRR";
		int balancedString = 0;
		int count = 0;
		
		for (int i = 0; i < s.length(); i++) {
			if (i != 0 && count == 0) {
				balancedString++;
				count = 0;
			}

			if (s.charAt(i) == 'R') {
				count++;
			} else if (s.charAt(i) == 'L') {
				count--;
			}
			if (i == s.length()-1 && count == 0) {
				balancedString++;
				count = 0;
			}

		}
		System.out.println(balancedString);
	}
}
