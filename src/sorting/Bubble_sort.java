package sorting;

public class Bubble_sort {
public static void main(String[] args) {
	
	int a[]= {3,1,5,7,2,4};
	int n = a.length;
	for(int i = 0 ; i < n ; i ++)
	{
		for(int j = 0 ; j < n-1 ; j ++)
		{
			if (a[j]>a[j+1])
			{
				int temp = a[j];
				a[j]=a[j+1];
				a[j+1]= temp ;
			}
		}
		
	}
	
	for(int b : a)
	{  
		System.out.println(b);
	}
}
}
