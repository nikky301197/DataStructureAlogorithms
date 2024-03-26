package array;

public class SumOfEncrptedInteger {
	public static void main(String[] args) {
		int nums[] = { 1, 2, 3 };

//	int num = 2983012;
//	String s = num+"";
//	while(num>0)
//	{
//	 int q= num/10;
//	 int r = num %10;
//	 System.out.println("current number :"+num);
//	 System.out.println("last digit "+r);
//	 num = q;
//	}

		for (int i = 0; i < nums.length; i++) {
			int max = Integer.MIN_VALUE;
			int count = 0;
			String s1 = "";
			while (nums[i] > 0) {
				int q = nums[i] / 10;
				int lastdigit = nums[i] % 10;
//				System.out.println("current number :" + nums[i]);
//				System.out.println("last digit " + lastdigit);
				nums[i] = q;
				max = Math.max(max, lastdigit);
				count++;
			}
			while (count > 0) {
				s1 = s1.concat(max + "");
				count--;
			}
			nums[i] = Integer.parseInt(s1);
//			System.out.println(nums[i]);
		}
		
		int sum = 0;
		for(int b:nums)
		{
			sum = sum+b;
		}
		
	}
}
