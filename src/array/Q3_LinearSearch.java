package array;

public class Q3_LinearSearch {
public static void main(String[] args) {
	int arr[]= {1, 2, 3 ,4, 5};
	int num = 4;
	int index = -1;
	for (int i = 0 ; i < arr.length ; i ++)
	{
		if (num == arr[i])
		{
			index = i;
		}
	}
	System.out.println("index:"+index);
}
}
