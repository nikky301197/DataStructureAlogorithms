 package array;

public class Q23_MaxSubArray {
	public static void main(String[] args) {
		int nums[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		 int maxi = Integer.MIN_VALUE; // maximum sum
		 int n = nums.length;
         
	        for (int i = 0; i < n; i++) {
	            int sum = 0;
	            for (int j = i; j < n; j++) {
	                // current subarray = nums[i.....j]

	                //add the current element nums[j]
	                // to the sum i.e. sum of nums[i...j-1]
	                sum += nums[j];

	                maxi = Math.max(maxi, sum); // getting the maximum
	            }
	        }
		
		
		
	        System.out.println(maxi);
	}
}
