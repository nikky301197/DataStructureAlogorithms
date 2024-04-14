package linkedList;

public class LinkedListPalindrome {
	Node head = null;
	Node tail = null;

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

	Node findMiddleNode() {
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	Node reverseHalfLinkedList(Node midnode) {
		Node prev = midnode;
		Node current = midnode.next;
		Node next;
		Node newmidNode = tail;
		tail = midnode;

		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		tail = prev;
		return newmidNode;
	}

	boolean checkPalindromeOrNot() {
		Node midNode = this.findMiddleNode();
		Node afterReverseMidNode = reverseHalfLinkedList(midNode);
		Node temp1 = head;
		Node temp2 = afterReverseMidNode;
		while (temp1 != afterReverseMidNode) {
			if (temp1.data != temp2.data) {
				return false;
			}
			temp1 = temp1.next;
			temp2 = temp2.next;

		}

		return true;
	}

	public static void main(String[] args) {
		LinkedListPalindrome l = new LinkedListPalindrome();
		l.addLast(1);
		l.addLast(2);
		l.addLast(3);
		l.addLast(2);
		l.addLast(1);
		l.printLinkedList();
		Node mid = l.findMiddleNode();
		System.out.println(mid.data);
		l.reverseHalfLinkedList(mid);
		l.printLinkedList();

	}
}
