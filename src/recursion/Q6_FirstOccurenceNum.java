package recursion;

public class Q6_FirstOccurenceNum {

	static int search(int a[], int i, int n) {
		if (a[i] == n) {
			return i;
		}
		if (i == a.length - 1) {
			return -1;
		}

		return search(a, i + 1, n);
	}

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7 };
		int n = 10;
		int result = search(a, 0, n);
		System.out.println(result);
	}
}
