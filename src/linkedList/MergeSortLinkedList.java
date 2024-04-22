package linkedList;


public class MergeSortLinkedList {
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

	public static ListNode findMidNode(ListNode head) {
		ListNode slow = head;
		ListNode fast = head.next;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	public static ListNode mergeSort(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode midNode = findMidNode(head);
		ListNode leftHead = head;
		ListNode rightHead = midNode.next;
		midNode.next = null;
		ListNode newLeft = mergeSort(leftHead);
		ListNode newRight = mergeSort(rightHead);
		ListNode ListNode  =  mergeLinkedList(newLeft, newRight);
		
		return ListNode;
	}

	private static ListNode mergeLinkedList(ListNode head1, ListNode head2) {
		ListNode mergedLinkedList = new ListNode(-1);
		ListNode temp = mergedLinkedList;
//		System.out.println(head1.val+" "+head2.val);
		while (head1 != null && head2 != null) {
			if (head1.val <= head2.val) {
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
		ListNode ListNode = new ListNode(40);
		head = ListNode;
		ListNode.next = new ListNode(30);
		ListNode.next.next = new ListNode(20);
		ListNode.next.next.next = new ListNode(10);
		printLinkedList();
		head  = mergeSort(head);
		
		printLinkedList();
	}
}
