package array;

public class Q8_RotateAryByK {

	public static void main(String[] args) {

		int nums[] = { 1, 2, 3, 4, 5, 6, 7 };
		int n = nums.length;
		int k = 7;
		int b[] = new int[k];
		int temp = k;
		int j = 0;
		for (int i = 0; i < k; i++) {
			b[i] = nums[i];
		}
		for (int i = 0; i < n; i++) {
			if (i < n - k) {
				nums[i] = nums[temp];
				temp++;
			} else {
				nums[i] = b[j];
				j++;
			}

		}

		for (int c : nums) {
			System.out.println(c);
		}
	}
}
