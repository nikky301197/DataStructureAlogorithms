package array;

public class Q17_RearrangeAryBySign {
	public static void main(String[] args) {
		
		int nums[] = {3,1,2,-5,-2,-4};
		int b[] = new int[nums.length];
		int n = nums.length;
		int evenCounter = 0;
		int oddCounter = 1;
//		for(int i = 0 ; i<n ; i++)
//		{
//			if (nums[i]>=0)
//			{
//				b[evenCounter] = nums[i];
//				evenCounter = evenCounter+2;
//			}
//			else
//			{
//				b[oddCounter] = nums[i];
//				oddCounter = oddCounter+2;
//			}
//		}
		for(int i = 0 ;i<n ; i ++)
		{
			if (nums[i]>=0)
			{
				
			}
		}
		
		for(int c : b)
		{
			System.out.print(c+" ");
		}
	}  

}
