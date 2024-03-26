 package searching;

public class BinarySearch {

	static int binarySearch(int a[], int si, int ei, int target) {
		int mid = (si + ei) / 2;
		if (si > ei) {
			return -1; // base case
		}

		if (a[mid] == target) {
			return mid;
		} else if (a[mid] < target) {
			return binarySearch(a, mid + 1, ei, target);
		} else {
			return binarySearch(a, si, mid - 1, target);
		}
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7 };

		int result = binarySearch(a, 0, a.length - 1, 511);
		System.out.println(result);
	}
}
