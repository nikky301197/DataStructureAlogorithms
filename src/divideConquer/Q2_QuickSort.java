package divideConquer;

//time complexity 
//average case - (n)2
//worst case - 0(nlogn)
public class Q2_QuickSort {
	static void quickSort(int[] a, int si, int ei) {
		if (si >= ei) {
			return;
		}

		int pivotIndex = parition(a, si, ei);

		quickSort(a, si, pivotIndex - 1);
		quickSort(a, pivotIndex + 1, ei);
	}

	private static int parition(int[] a, int si, int ei) {
		int pivot = a[ei];
		int i = 0;
		for (int j = 0; j < ei; j++) {

			if (a[j] <= pivot) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;

			}

		}
		int temp = a[ei];
		a[ei] = a[i];
		a[i] = temp;

		int pivotIndex = i;
		return pivotIndex;

	}

	public static void main(String[] args) {

		int a[] = { 9, 8, 7, 6, 5, -2, -1, 0 };
		int si = 0;
		int ei = a.length - 1;
		quickSort(a, si, ei);

		for (int b : a) {
			System.out.print(b + " ");
		}
	}

}
