package array;

public class NumberofGoodPairs {
	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 1, 1, 3 };
		int pairs = 0;

		for (int i = 0; i < nums.length-1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					pairs++;
				}
			}
		}
	}
}
