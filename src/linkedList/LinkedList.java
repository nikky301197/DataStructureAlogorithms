package linkedList;

public class LinkedList {
	class Node {
		Integer data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}

	}

	public Node head = null;
	public Node tail = null;

	void addFirst(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
			tail = node;
			return;
		}
		node.next = head;
		head = node;

	}

	void addLast(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
			tail = node;
			return;
		}
		tail.next = node;
		tail = node;

	}

	void printLinkedList() {
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

	void addMiddle(int key, int data) {
		Node temp = head;

		while (temp.data != key) {
			temp = temp.next;
		}

		Node newnode = new Node(data);
		newnode.next = temp.next;
		temp.next = newnode;

	}

	Integer size() {
		int count = 0;
		Node temp = head;
		if (temp == null) {
			return count;
		}
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addFirst(10);
		list.addFirst(20);
		list.addLast(30);
		list.printLinkedList();
		list.addMiddle(10, 15);
		list.addLast(50);
		list.printLinkedList();
        Integer size = list.size();
        System.out.println("size of linked list : "+ size);
	}
	
}
