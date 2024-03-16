package array;

// second largest number in array 

public class Q3_SecondLargestNumInAry {

	public static void main(String[] args) {
		int a[] = { 100, 2, 40, 7, 700, 1500 };
		int n = a.length;
		int max = a[0];
		int sl = Integer.MIN_VALUE;
		for (int i = 1; i < n; i++) {
			if (a[i] > max) {
				sl = max;
				max = a[i];
			} else if (a[i] > sl && max > a[i]) {
				sl = a[i];
			}
		}
		System.out.println("second largest " + sl);
	}
}
