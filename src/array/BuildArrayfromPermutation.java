package array;

public class BuildArrayfromPermutation {
public static void main(String[] args) {
	int  nums []= {5,0,1,2,3,4};
	int n = nums.length;
	int temp[] = new int[n];
	for(int i = 0 ; i<n ; i++)
	{
		temp[i]= nums[nums[i]];
	}
	for(int b : temp)
	{
		System.out.println(b);
	}
}
}
