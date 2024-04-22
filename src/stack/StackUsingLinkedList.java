package stack;

public class StackUsingLinkedList {

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	static class Stack {
		static Node head = null;
		static Node tail = null;

		static boolean isEmpty() {
			return head == null;
		}

		static void push(int data) {

			Node temp = new Node(data);

			if (head == null) {
				head = temp;
				tail = temp;
				return;
			}
			tail.next = temp;
			tail = temp;

		}

		static int peek() {
			if (isEmpty()) {
				return -1;
			}
			return tail.data;
		}

		static int pop() {
			Node temp = head;
			Node top = null;
			if (isEmpty()) {
				return -1;
			}
			if (head == tail) {
				top = tail;
				tail = null;
				head = null;
				return top.data;
			}

			while (temp != null) {
				if (temp.next == tail) {
					top = tail;
					tail = null;
					temp.next = null;
					tail = temp;
					break;

				}
				temp = temp.next;
			}
			return top.data;
		}
	}

	public static void main(String[] args) {
//		Stack s = new Stack();
		Stack.push(1);
//		System.out.println(Stack.peek());
		Stack.push(2);
//		System.out.println(Stack.peek());
		Stack.push(3);
//		System.out.println(Stack.peek());
		while (!Stack.isEmpty()) {
			System.out.println(Stack.pop());
		}

	}
}
