package divideConquer;
// time complexity 
// worst case nlogn
// average case nlogn
public class Q1_MergeSort {

	static void mergeSort(int a[], int si, int ei) {
		if (si >= ei) {
//		base case	
			return;
		}
		int mid = si + ((ei - si) / 2);

		mergeSort(a, si, mid);
		mergeSort(a, mid + 1, ei);

		mergeArray(a, si, mid, ei);

	}

	private static void mergeArray(int[] a, int si, int mid, int ei) {
		// TODO Auto-generated method stub
		int i = si;
		int j = mid + 1;
		int k = 0;
		int temp[] = new int[ei - si + 1];

		while (i <= mid && j <= ei) {
			if (a[i] > a[j]) {
				temp[k] = a[j];
				j++;

			} else {
				temp[k] = a[i];
				i++;

			}
			k++;
		}

		while (i <= mid) {
			temp[k] = a[i];
			k++;
			i++;
		}
		while (j <= ei) {
			temp[k] = a[j];
			k++;
			j++;
		}

		for (k = 0, i = si; k < temp.length; k++, i++) {

			a[i] = temp[k];
		}
	}

	public static void main(String[] args) {

		int a[] = { 6, 3, 9, 5, 2, 8 };
		int endindex = a.length - 1;
		int startindex = 0;
		mergeSort(a, startindex, endindex);

		for (int b : a) {
			System.out.print(b+" ");
		}

	}
}
