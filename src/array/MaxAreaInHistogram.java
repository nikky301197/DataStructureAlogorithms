package array;

public class MaxAreaInHistogram {
	public static void main(String[] args) {

		int heights[] = { 2, 1, 5, 6, 2, 3 };

		int maxArea = Integer.MIN_VALUE;
		
		for (int i = 0; i < heights.length; i++) {
			int minHeight = Integer.MAX_VALUE;
			int area = 0;
			int width = 0 ;
			for (int j = i; j < heights.length; j++) {
				minHeight = Math.min(minHeight, heights[j]);
				width = j-i+1;
				area =   (minHeight * width);
				maxArea = Math.max(area, maxArea);

			}
		}

		System.out.println(maxArea);
	}
}
