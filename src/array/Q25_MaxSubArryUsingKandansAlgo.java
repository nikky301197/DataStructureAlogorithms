package array;

public class Q25_MaxSubArryUsingKandansAlgo {

	public static void main(String[] args) {

		int nums[] = { -2,-1};
		int max = Integer.MIN_VALUE; // maximum sum
		int n = nums.length;
		int sum = 0;
		boolean flag = true;
		int min = nums[0];
		
		for (int i = 0; i < n; i++) {
			if (nums[i] < 0 && flag) {
				min = Math.max(min, nums[i]);
			} else {
				flag = false;
				break;
			}
		}
		if (flag == false) {
			for (int i = 0; i < n; i++) {
				sum = nums[i] + sum;
				if (sum < 0) {
					sum = 0;
				}
				max = Math.max(max, sum);

			}
		} else {
			max = min;
		}
		
		System.out.println(max);
	}
}
