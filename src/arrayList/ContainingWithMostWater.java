package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContainingWithMostWater {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(1, 8, 6, 2, 5, 4, 8, 3, 7));
		int n = list.size();
		int maxwater = Integer.MIN_VALUE;

		for (int i = 0; i < n - 1; i++) {
			int area = 0;

			for (int j = i + 1; j < n; j++) {
				int w = j - i;
				int h = Integer.min(list.get(i), list.get(j));
				area = w * h;
				maxwater = Integer.max(area, maxwater);
			}
		}
		System.out.println(maxwater);
	}
}
