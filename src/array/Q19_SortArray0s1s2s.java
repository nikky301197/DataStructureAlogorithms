package array;

//dutch nation flag problem 
//only applicable for 3 type of number sorting 
/*
If array [mid] =0, then swap array [mid] with array [low] and increment both pointers once.
If array [mid] = 1, then no swapping is required. Increment mid pointer once.
If array [mid] = 2, then we swap array [mid] with array [high] and decrement the high pointer once.
 */
public class Q19_SortArray0s1s2s {
	public static void main(String[] args) {

		int a[] = { 2, 0, 2, 1, 1, 0 };
		int n = a.length;
		int low = 0;
		int mid = 0;
		int high = n - 1;
		int temp = 0;
		while (mid <= high) {
			if (a[mid] == 0) {
				temp = a[mid];
				a[mid] = a[low];
				a[low] = temp;
				low++;
				mid++;
			} else if (a[mid] == 1) {
				mid++;
			} else if (a[mid] == 2) {
				temp = a[mid];
				a[mid] = a[high];
				a[high] = temp;
				high--;

			}

		}

		for(int c : a)
		{
			System.out.print(c+" ");
		}
	}
	

}
