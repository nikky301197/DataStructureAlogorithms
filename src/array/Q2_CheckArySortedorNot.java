package array;

//check array is sorted or not 

public class Q2_CheckArySortedorNot {
	public static void main(String[] args) {
		int a[] = { 1,2,3,4,5 };
		int n = a.length;
		boolean ascendingOrder = false;
		boolean descendingOrder = false;

//		optimize solution 
//		time complexity = 0(n)
		for (int i = 0; i < n - 1; i++) {
			if (a[i] < a[i + 1]) {

				ascendingOrder = true;

			} else {
				ascendingOrder = false;
				break;
			}

		}
		if (!ascendingOrder) {
			for (int i = 0; i < n - 1; i++) {
				if (a[i] > a[i + 1]) {

					descendingOrder = true;

				} else {
					descendingOrder = false;
					break;
				}

			}
		}
		if (ascendingOrder || descendingOrder) {
			System.out.println("array is sorted ");
		} else {
			System.out.println("array is  not sorted in ascending order");
		}
	}
}
