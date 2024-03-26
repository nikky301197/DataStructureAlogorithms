package searching;
//linear search is applicable for sorted and unsorted array 
// time complexity - 0(n)

public class LinearSearch {
public static void main(String[] args) {
	int a[] = {7,9,10,2,4,6,5};
	int target = 100 ;
	int index = -1;
	for(int i = 0 ; i < a.length ; i ++)
	{
		if (target == a[i])
		{
			index = i ;
			break ;
		}
	}
	System.out.println(index);
}
}
