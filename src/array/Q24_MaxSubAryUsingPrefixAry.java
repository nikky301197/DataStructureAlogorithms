package array;

public class Q24_MaxSubAryUsingPrefixAry {
	public static void main(String[] args) {
		int nums[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int max = Integer.MIN_VALUE; // maximum sum
		int prefix[] = new int[nums.length];
		int n = nums.length;
		prefix[0] = nums[0];
		max = prefix[0];
		for (int i = 1; i < n; i++) {
			prefix[i] = nums[i] + prefix[i - 1];
			max = Math.max(max, prefix[i]);

		}
		
		System.out.println(max);
		
	}
}
