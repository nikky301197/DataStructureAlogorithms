package linkedList;

import linkedList.DetectCycleInLinkedList.Node;

public class RemoveCycleInLinkedList {
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

	public static void removeCycle() {
		Node fast = head;
		Node slow = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				break;
			}

		}

		slow = head;
		Node prev = null;

		while (slow != fast) {
			prev = fast;
			slow = slow.next;
			fast = fast.next;
		}
		prev.next = null;
		tail = prev;

	}

	static void printLinkedList() {
		Node temp = head;
		if (head == null) {
			System.out.println("linked list is empty");
			return;
		}
		System.out.println("singly linked list ");
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = head.next;
        removeCycle();
		printLinkedList();
	}
}
