package stack;

import java.util.Stack;

public class PushIntoBottom {

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
		pushAtBottom(s, 5);

		while (!s.isEmpty()) {
			System.out.println(s.pop());
		}

	}
}
