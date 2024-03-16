package array;

public class Q9_RemoveDuplicatesInplace {
	public static void main(String[] args) {
		int a[] = { 1, 1, 1, 2, 2, 2, 3, 3 };
		int n = a.length;
		int temp = Integer.MIN_VALUE;
		int j = 1;
		int i = 0;

		while (i < n) {

			while (a[i] == a[j]) {
				j++;

			}
			i++;
			a[i] = a[j];
			j = i + 1;

		}

	}
}
