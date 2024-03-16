package array;

import java.util.Arrays;

// Check if a pair with given sum exists in Array
public class Q13_TwoSum {

	public static void main(String[] args) {
		int a[] = { 2, 6, 5, 8, 11 };
		int target = 19;
		int n = a.length;
		int j = a.length - 1;
		int i = 0;
		boolean found = false;
		int k1 = -1, k2 = -1;
		Arrays.sort(a);
		while (i < j) {
			if (a[i] + a[j] == target) {
				k1 = a[i];
				k2 = a[j];
				found = true;
				break;
			} else if (a[i] + a[j] > target) {
				j--;
			} else {
				i++;
			}
		}
		if (found) {
			System.out.println("found pairs :: " + k1 + " " + k2);
		} else {
			System.out.println("not found pairs");
		}

	}
}
