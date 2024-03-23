package recursion;

public class Q7_LastOccurenceNum {
	static int lastSearch(int a[], int i, int n) {
		if (a[i] == n) {
			return i;
		}
		if (i == 0) {
			return -1;
		}
		return lastSearch(a, i - 1, n);
	}

	public static void main(String[] args) {
		int a[] = { 10, 10 , 20 , 10  };
		int searchNum = 10;
		int result = lastSearch(a, a.length - 1, searchNum);
		System.out.println(result);

	}
}
