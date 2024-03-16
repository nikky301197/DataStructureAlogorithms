package array;

public class Q21_BuySellStock {
	public static void main(String[] args) {
		int p[] = { 7, 1, 5, 3, 6, 4 };
		int n = p.length;
		int max = 0;
		int profit = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j =i+1; j < n; j++) {
				if (p[j] > p[i]) {
					max = p[j] - p[i];
					if (max > profit) {
						profit = max;

					}
				}
			}
		}
		System.out.println(profit);
	}
}
