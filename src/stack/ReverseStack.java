package stack;

import java.util.Stack;

public class ReverseStack {

	static void reverseStack(Stack<Integer> s) {
		if (s.isEmpty()) {
			return;
		}
		int data = s.pop();
		reverseStack(s);
		pushAtBottom(s, data);

	}

	static void pushAtBottom(Stack<Integer> s, int data) {
		if (s.isEmpty()) {
			s.push(data);
			return;
		}
		int val = s.pop();
		pushAtBottom(s, data);
		s.push(val);
	}

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		
		reverseStack(s);
		while (!s.isEmpty()) {
			System.out.println(s.pop());
		}
	}
}
