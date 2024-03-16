package array;

import java.util.TreeSet;

//Given an array that contains only 1 and 0 return the count
//of maximum consecutive ones in the array.

public class Q6_MaxConsecutive1InAry {
	public static void main(String[] args) {
//	timecomplexity - 0(n)
//	spacecomplexity - 0(1)
		
		int a[] = { 1, 0, 1, 0, 1, 0 };

		int max = 0;
		int count = 0;
		int n = a.length;
		for (int i = 0; i < n; i++) {
			if(a[i] ==1)
			{
				count++;
			}
			else
			{
				count =0;
			}
			max = Math.max(max, count);
		}
		System.out.println(max);
	}

}
