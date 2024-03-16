package array;
//largest number in array 
public class Q1_LargestNumInAry {
public static void main(String[] args) {
	
	int a[] = {20,5,1,300,0,10};
	int max = a[0];
	int n = a.length;
//	brute force - sort number in ascending order and fetch last element 
//	sorting buble sort - 0(n)2
//	time complexity - depend on which sorting alogrithm we are using 
	
//	optimize solution 
//	time complexity = 0(n)
	for(int i = 1 ; i < n ; i ++)
	{
		if (a[i]>max)
		{
			max = a[i];
		}
	}
	System.out.println(max);
	


	
	
}
}
