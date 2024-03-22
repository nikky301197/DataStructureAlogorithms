package recursion;

public class Q5_CheckSortedAry {

	static boolean checkSorted(int a[], int i) {
		if (i == a.length - 1)
			return true;

		if (a[i] > a[i + 1]) {
			return false;
		}

		return checkSorted(a, i + 1);
	}

	public static void main(String[] args) {

		int a[] = { 1, 10, 22, 44, 55, 3 };
		int n = a.length;
		boolean flag = checkSorted(a, 0);
		System.out.println(flag);
//		boolean flag = false;
//		
//		for (int i = 0; i < n - 1; i++) {
//			if (a[i] > a[i + 1]) {
//				flag = true;
//				break;
//			}
//		}
//
//		System.out.println(flag);
	}
}
