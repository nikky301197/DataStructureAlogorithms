package array;

import java.util.Arrays;

public class LargestPositiveIntegerThatExistsWithNegative {

	public static void main(String[] args) {
		 int nums[] = {-1,10,6,7,-7,1};
		
		 Arrays.sort(nums);
		 int i=0 ;
		 int j = nums.length -1;
		 while(i<j)
		 {
			 if ((-nums[i]) == nums[j])
			 {
				 System.out.println(nums[j]);
				 break;
			 }
			 else if ((-nums[i]) < (nums[j]))
			 {
				 j--;
			 }
			 else if ((-nums[i]) > nums[j])
			 {
				 i++;
			 }
		 }
		 
//		 System.out.println("-1");
	}
}
