package arrayList;

public class ContainingMostWaterUsing2Pointer {
	public static void main(String[] args) {
		int height[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7, 2 };
		int lp = 0;
		int rp = height.length - 1;
		int maxWater = Integer.MIN_VALUE;
		while (lp < rp) {
			int h = Math.min(height[lp], height[rp]);
			int w = rp - lp;
			int currentWater = h * w;
			maxWater = Math.max(currentWater, maxWater);
			if (height[lp] < height[rp]) {
				lp++;
			} else {
				rp--;
			}
		}

		System.out.println(maxWater);
	}
}
