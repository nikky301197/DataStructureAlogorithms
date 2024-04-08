package arrayList;

public class PairSum2UsingBruteForce {
	public static void main(String[] args) {
		int a[] = { 11, 12, 15, 6, 7, 8, 9, 10 };
		int breakPoint = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > a[i + 1]) {
				breakPoint = i;
				break;
			}
		}
		int lp = breakPoint + 1;
		int rp = breakPoint;
		int sum = 22;
		boolean foundPair = false;
		int n = a.length;
		while (lp != rp) {
			if (a[lp] + a[rp] == sum) {
				foundPair = true;
				break;
			} else if (a[lp] + a[rp] < sum) {
				lp = (lp + 1) % n;
			} else {
				rp = (rp - 1 + n) % n;
			}
		}
		System.out.println(foundPair);
	}
}
