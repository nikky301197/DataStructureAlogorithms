package array;

// task is to move all the zeros in the array to the end of the array
//and move non-negative integers to the front by maintaining their order.
public class Q7_MoveAllZeroToEnd {
	public static void main(String[] args) {
//Time complexity - 0(n)
//Space complexity -0(n)
		
		
		int a[] = { 1, 0, 2, 3, 0, 4, 0, 1, 0, 0, 0, 0, 0 };
		int n = a.length;
		int b[] = new int[a.length];
		int i = 0;
		int j = n - 1;
		int k = 0;
		while (k < n) {
			if (a[k] != 0) {
				b[i] = a[k];
				i++;
			} else {
				b[j] = 0;
				j--;
			}
			k++;
		}

		for (int c : b) {
			System.out.print(c + " ");
		}
	}

}
