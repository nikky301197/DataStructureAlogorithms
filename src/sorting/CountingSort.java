package sorting;

public class CountingSort {
public static void main(String[] args) {
	int a[]= {5,4,2,1,7,7};
	int max = Integer.MIN_VALUE;
	int n = a.length;
	for(int i = 0 ; i < n ; i ++)
	{
		max = Math.max(max, a[i]);
	}
	System.out.println(max);
	int b [] = new int[max+1]; // index from 0 to 7 
	
	for(int i = 0 ; i < n ; i ++)
	{
		int temp = a[i];
		b[temp]++;
	}
	
	for(int t : b )
	{
		System.out.print(t +" ");
	}
	int j = 0;
	for(int i = 0 ; i < b.length ; i ++)
	{
		while(b[i]>0)
		{
			a[j] = i ;
			j++;
			b[i]--;
		}
	}
	System.out.println();
	for(int t : a )
	{
		System.out.print(t +" ");
	}
	
}
}
