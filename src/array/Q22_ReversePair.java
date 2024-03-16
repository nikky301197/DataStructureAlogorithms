package array;

public class Q22_ReversePair {

	public static void main(String[] args) {
		int nums []= {2147483647,2147483647,2147483647,2147483647,2147483647,2147483647};
		int n = nums.length;
		int count = 0 ;
		System.out.println((long)2147483647*2);
		for(int i = 0 ; i < n-1 ; i++)
		{
			for(int j = i+1 ; j < n ; j ++)
			{
				if (nums[i]>=nums[j] && nums[i]>((long)2*nums[j]))
				{
					count ++;
				}
			}
		}
		System.out.println(count);
	}
}
