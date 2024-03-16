package array;

import java.util.Arrays;

public class Q18_FindDuplicateNo {
public static void main(String[] args) {
	int  nums[]= {3,3,3};
	Arrays.sort(nums);
	int n = nums.length;
	int duplicateNum = Integer.MIN_VALUE;
//	1 2 2 3 4 
	for(int i =0 ; i <n ; i ++)
	{
		if (i == 0 && nums[i]==nums[i+1])
		{
//			System.out.println("duplicate number : "+ nums[i]);
			duplicateNum = nums[i];
			break;
		}
		else if (i== n-1 && nums[i-1]==nums[i])
		{
//			System.out.println("duplicate number : "+ nums[i]);
			duplicateNum = nums[i];
			break;
		}
		else if (i !=0 && (nums[i]== nums[i+1] || nums[i-1]== nums[i]))
		{
//			System.out.println("duplicate number : "+ nums[i]);
			duplicateNum = nums[i];
			break;
		}
	}
	
}
}
