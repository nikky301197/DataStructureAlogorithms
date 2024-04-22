package linkedList;

public class ZigZagLinkedList {
	public static ListNode head = null;
	public static ListNode tail = null;

	public static class ListNode {
		Integer val;
		ListNode next;

		public ListNode(int val) {
			this.val = val;
			this.next = null;
		}
	}

	static void printLinkedList() {
		ListNode temp = head;
		if (head == null) {
			System.out.println("linked list is empty");
			return;
		}
		System.out.println("singly linked list ");
		while (temp != null) {
			System.out.print(temp.val + "->");
			temp = temp.next;
		}
		System.out.println("null");
	}

	static ListNode getMidNode() {
		ListNode slow = head;
		ListNode fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	static ListNode reverseHalfLinkedList(ListNode midNode) {
		ListNode prev = null;
		ListNode current = midNode;
		ListNode next = null;

		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}

		return prev;

	}

	static ListNode zigZag() {
//		find mid node 
		ListNode mid = getMidNode();
//		reverse second half 
		ListNode righhead = reverseHalfLinkedList(mid);
		ListNode lefthead = head;
//		create new zig zag linked list
		ListNode first = new ListNode(-1);
		ListNode temp = first;

		while (lefthead != mid && righhead != null) {

			ListNode node1 = new ListNode(lefthead.val);
			temp.next = node1;
			temp = node1;
			ListNode node2 = new ListNode(righhead.val);
			temp.next = node2;
			temp = node2;
			lefthead = lefthead.next;
			righhead = righhead.next;

		}

		ListNode lastNode = new ListNode(righhead.val);
		temp.next = lastNode;
		tail = lastNode;

		return first.next;
	}

	public static void main(String[] args) {

		ListNode node = new ListNode(10);
		node.next = new ListNode(20);
		node.next.next = new ListNode(30);
		node.next.next.next = new ListNode(40);
		node.next.next.next.next = new ListNode(50);
		head = node;
		printLinkedList();
		head = zigZag();
		printLinkedList();

	}
}
