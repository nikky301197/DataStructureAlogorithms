package linkedList;

public class PalindromeLinkedList {
	static Node head = null;
	static Node tail = null;

	class Node {
		Integer data;
		Node next;

		public Node(int data) {
			// TODO Auto-generated constructor stub
			this.data = data;
			this.next = null;
		}

	}

	public void addLast(int data) {
		Node node = new Node(data);

		if (head == null) {
			head = tail = node;
			return;
		}
		tail.next = node;
		tail = node;
	}

	public void printLinkedList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println("null");
	}

	static Node findMiddleNode() {
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	static Node reverseHalfLinkedList(Node midnode) {
		Node prev = null;
		Node current = midnode;
		Node next;

		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}

		return prev;
	}

	static boolean checkPalindromeOrNot() {
		Node midNode = findMiddleNode();
		Node righthead = reverseHalfLinkedList(midNode);
		Node lefthead = head;

		while (lefthead != null && righthead != null) {
			if (lefthead.data != righthead.data) {

				return false;
			}
			lefthead = lefthead.next;
			righthead = righthead.next;
		}
		return true;
	}

	public static void main(String[] args) {
		PalindromeLinkedList l = new PalindromeLinkedList();
		l.addLast(1);
		l.addLast(2);
		l.addLast(2);
		l.addLast(1);
//		l.addLast();
		l.printLinkedList();
		boolean flag = checkPalindromeOrNot();
		System.out.println(flag);

	}
}
