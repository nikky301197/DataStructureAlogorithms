package backtracking;

public class ChangeArray {
	public static void main(String[] args) {

		int a[] = new int[5];
		int i = 0;
		changeArray(a, i);
		for (int c : a) {
			System.out.println(c);
		}

	}

	public static void changeArray(int[] a, int i) {
		if (i == a.length - 1) {
			a[i] = a.length;
			a[i] = a[i] - 2;
			return;
		}
		a[i] = i + 1;
		changeArray(a, i + 1); // function call step
		a[i] = a[i] - 2; // backtracking step

	}
}
