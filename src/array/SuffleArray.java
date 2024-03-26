package array;

public class SuffleArray {
	public static void main(String[] args) {
		int nums[] = { 1,2,3,4,4,3,2,1 };
		int n = 4;
		int j = 0;
		int k = n;
		int temp[] = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			if (i % 2 == 0) {
				temp[i] = nums[j];
				j++;
			} else {
				temp[i] = nums[k];
				k++;
			}

		}
		for(int b :temp)
		{
			System.out.println(b);
		}
	}
}
