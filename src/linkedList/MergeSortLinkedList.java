package linkedList;

import linkedList.RemoveCycleInLinkedList.Node;

public class MergeSortLinkedList {
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

	public static Node findMidNode(Node head) {
		Node slow = head;
		Node fast = head.next;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	public static Node mergeSort(Node head) {
		if (head == null || head.next == null) {
			return head;
		}
		Node midNode = findMidNode(head);
		Node leftHead = head;
		Node rightHead = midNode.next;
		midNode.next = null;
		Node newLeft = mergeSort(leftHead);
		Node newRight = mergeSort(rightHead);
		Node node  =  mergeLinkedList(newLeft, newRight);
		
		return node;
	}

	private static Node mergeLinkedList(Node head1, Node head2) {
		Node mergedLinkedList = new Node(-1);
		Node temp = mergedLinkedList;
//		System.out.println(head1.data+" "+head2.data);
		while (head1 != null && head2 != null) {
			if (head1.data <= head2.data) {
				temp.next = head1;
				head1 = head1.next;
				temp = temp.next;

			} else {
				temp.next = head2;
				head2 = head2.next;
				temp = temp.next;

			}

		}

		while (head1 != null) {
			temp.next = head1;
			head1 = head1.next;
			temp = temp.next;
		}
		while (head2 != null) {
			temp.next = head2;
			head2 = head2.next;
			temp = temp.next;
		}

		return mergedLinkedList.next;
	}

	/////////////////////////
	public static void main(String[] args) {
		Node node = new Node(40);
		head = node;
		node.next = new Node(30);
		node.next.next = new Node(20);
		node.next.next.next = new Node(10);
		printLinkedList();
		head  = mergeSort(head);
		
		printLinkedList();
	}
}
