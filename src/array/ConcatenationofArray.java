package array;

public class ConcatenationofArray {

	public static void main(String[] args) {
		int nums[] = { 1, 2, 1 };
		int n = nums.length;
		int k = 2 * n;
		int temp[] = new int[k];
		int j = 0;
		int m = n;
		for (int i = 0; i < n; i++) {
			temp[j] = nums[i];
			temp[m] = nums[i];
			j++;
			m++;
		}
		
		
		for(int b :temp)
		{
			System.out.print(b+" ");
		}

	}

}
