package sorting;

public class InsertionSort {
	public static void main(String[] args) {

		int a[] = { 5, 2, 1, 3, 2 };
//	 4, 5 , 1 ,3 ,2
//	1 ,4,5 , 3,2  	

		int n = a.length;

		for (int i = 1; i < n; i++) {
			int min = a[i];
			for (int j = i-1; j >=0; j--) {
				if (a[j] > min) {
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}

	}

}
