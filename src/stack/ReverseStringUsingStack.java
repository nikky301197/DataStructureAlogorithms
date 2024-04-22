package stack;

import java.util.Stack;

public class ReverseStringUsingStack {

	public static void main(String[] args) {
		Stack<Character>  s = new Stack<>();
		String name = "nikita";
		for(int i = 0 ; i < name.length() ; i ++)
		{
			s.push(name.charAt(i));
		}
		
		while(!s.isEmpty())
		{
			System.out.println(s.pop());
		}
		
	}
}
