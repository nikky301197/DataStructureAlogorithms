package arrayList;

public class PairSumUsingBruteForce {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6 };
		int sum = 20;
		boolean foundpair = false;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] + a[j] == sum) {
					foundpair = true;
					break;
				}
			}
		}
System.out.println(foundpair);
	}
}
