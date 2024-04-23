package stack;

import java.util.Stack;

import backtracking.GridWays1;

public class ValidParentheses {
	public static void main(String[] args) {
		String s = "({[]}{)";
		Stack<Character> s2 = new Stack<>();
		Boolean validCheck = true;
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
				s2.push(s.charAt(i));
				validCheck = false;
			} else {
				if (s2.peek() == '[' && s.charAt(i) == ']')
				{
					s2.pop();
					validCheck = true;
				}
					
				else if (s2.peek() == '{' && s.charAt(i) == '}')
				{
					s2.pop();
					validCheck = true;
				}
					
				else if (s2.peek() == '(' && s.charAt(i) == ')')
				{
					s2.pop();
					validCheck = true;
				}
					
				else {
					validCheck = false;
					break;
				}
			}

		}

		System.out.println(validCheck);
	}
}
