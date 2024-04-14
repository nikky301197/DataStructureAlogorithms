package linkedList;

import linkedList.LinkedList.Node;

public class DetectCycleInLinkedList {
	public static Node head = null;
	public static Node tail = null;

	public static class Node {
		Integer data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	static boolean detectCycleInLinkedList() {
		Node fast = head;
		Node slow = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				return true;

			}
		}
		return false;
	}

	public static void main(String[] args) {
		head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);

		System.out.println(detectCycleInLinkedList());

	}
}
