package stack;

import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) {
		int a[] = { 6, 8, 0, 1, 3 };

		findNexGreater(a);
	}

	static void findNexGreater(int[] a) {
		int b[] = new int[a.length];
		Stack<Integer> s = new Stack<>();
		int j = a.length - 1;
		for (int i = a.length - 1; i >= 0; i--) {

			while (!s.isEmpty() && s.peek() <= a[i]) {
				s.pop();
			}

			if (s.isEmpty()) {
				b[j] = -1;
			} else {
				b[j] = s.peek();
			}
			s.push(a[i]);
			j--;
		}

		for(int k : b )
		{
			System.out.println(k);
		}
	}
}
