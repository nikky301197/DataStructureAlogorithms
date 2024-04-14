package linkedList;

public class LinkedList {
	public Node head = null;
	public Node tail = null;

	class Node {
		Integer data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}

	}

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

	void addMiddle(int key, int data) {
		Node temp = head;

		while (temp.data != key) {
			temp = temp.next;
		}

		Node newnode = new Node(data);
		newnode.next = temp.next;
		temp.next = newnode;

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

	Integer recursiveSearch(Node temp, Integer key, Integer indx) {
		if (temp == null) {
			return -1;
		}
		if (temp.data == key) {
			return indx;
		}
		return recursiveSearch(temp.next, key, ++indx);

	}

	Integer removeFirst() {
		Node temp = head;

		if (head == null) {
			System.out.println("Linked list is empty");
			return null;
		} else if (head == tail) {
			head = tail = null;
			return temp.data;
		}

		head = head.next;
		temp.next = null;
		return temp.data;
	}

	Integer removeLast() {
		Node temp = head;
		LinkedList list = new LinkedList();
		Integer size = list.size();
		if (size == 0) {
			System.out.println("Linked List is empty");
		} else if (size == 1) {
			head = tail = null;
			return temp.data;
		}

		int data = -1;
		while (temp != null) {
			if (temp.next == tail) {
				data = tail.data;
				tail = temp;
				temp.next = null;

			}
		}
		return data;
	}

	void reverse() {
		Node current = null;
		Node prev = null;
		Node next = null;
		tail = prev = head;
		current = head.next;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;

		}
		head = prev;
		tail.next = null;

	}

	void removeNodeFromEnd(int nthNodePosFromEnd) {
		Integer size = this.size();
		Integer nthNodePosFromStart = (size - nthNodePosFromEnd + 1);
		Node temp = head;
		Node prev = null;
		if (size == 1) {
			head = tail = null;
			System.out.println("linked list empty");
			return;
		}
		for (int i = 1; i <= size; i++) {
			if (i == nthNodePosFromStart - 1) {
				prev = temp;
				Node removedNode = prev.next;
				prev.next = removedNode.next;
				removedNode = null;
				return;
			}
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
//		list.printLinkedList();
//		list.addMiddle(10, 15);
//		list.addLast(50);
//		list.printLinkedList();
//		Integer size = list.size();
//		System.out.println("size of linked list : " + size);
//		Integer foundIndex = list.recursiveSearch(list.head, 100, 0);
//		System.out.println(foundIndex);
//		list.printLinkedList();
//		list.removeFirst();
//		list.printLinkedList();
//		list.removeFirst();
//		list.printLinkedList();
//		list.removeFirst();
//		list.printLinkedList();
//		list.printLinkedList();
//		list.reverse();
//		list.printLinkedList();
		list.printLinkedList();
		list.removeNodeFromEnd(1);
		list.printLinkedList();
		list.removeNodeFromEnd(1);
		list.printLinkedList();
		list.removeNodeFromEnd(1);
		list.printLinkedList();
	}

}
