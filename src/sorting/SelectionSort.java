package sorting;

public class SelectionSort {
	public static void main(String[] args) {
		int a[] = { 5, 4, 3, 2, 1 };
		int min = Integer.MAX_VALUE;
		int n = a.length;
		int index = 0;
		for (int i = 0; i < n-1 ; i++) {
			min =i ;
			for (int j = i + 1; j < n; j++) {
				System.out.print(a[j]+" ");
				if (a[min] > a[j]) {
					 min = j ;
				}
			}
            System.out.println(" ");   
			int temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}

		for (int b : a) {
			System.out.print(b + " ");
		}
	}
}
