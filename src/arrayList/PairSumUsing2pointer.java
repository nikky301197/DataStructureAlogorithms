package arrayList;

public class PairSumUsing2pointer {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6 };
		int sum = 20;

		int lp = 0;
		int rp = a.length - 1;
		boolean foundpair = false;
		while (lp < rp) {
			if (a[lp] + a[rp] == sum) {
				foundpair = true;
				break;
			} else if (a[lp] + a[rp] < sum) {
				lp++;
			} else {
				rp--;
			}
		}
		System.out.println(foundpair);
	}
}
