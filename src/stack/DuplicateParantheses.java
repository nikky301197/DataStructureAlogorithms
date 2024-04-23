package stack;

import java.util.Stack;

public class DuplicateParantheses {

	public static void main(String[] args) {
//		String s = "((a+b)+c(c+d))";
		String s = "((a+b))";
		boolean duplicateCheck = false;
		;
		Stack<Character> s1 = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ')') {
				int count = 0;
				while (s1.peek() != '(') {
					s1.pop();
					count++;
				}
				if (count < 1) {
					duplicateCheck = true;
					break;
				} else {
					s1.pop();
				}
			}
			else
			{
				s1.push(s.charAt(i));
			}
		}
		
		System.out.println(duplicateCheck);
	}
}
