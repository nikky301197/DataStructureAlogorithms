package stack;

import java.util.Stack;

public class MaxAreaInHistrogram {

	public static void main(String[] args) {
		int heights[] = { 2, 1, 5, 6, 2, 3 };
		int n = heights.length;
		int nsl[] = new int[n];
		int nsr[] = new int[n];
		Stack<Integer> s = new Stack<>();
//	next smaller right ;
		for (int i = n - 1; i >= 0; i--) {
			while (!s.isEmpty() && heights[i] <= heights[s.peek()]) {
				s.pop();
			}
			if (s.isEmpty()) {
				nsr[i] = n;
			} else {
				nsr[i] = s.peek();
			}
			s.push(i);
		}

//		next smaller left ;
		s = new Stack<>();
		for (int i = 0; i < n; i++) {
			while (!s.isEmpty() && heights[i] <= heights[s.peek()]) {
				s.pop();
			}
			if (s.isEmpty()) {
				nsl[i] = -1;
			} else {
				nsl[i] = s.peek();
			}
			s.push(i);
		}
		
		int maxArea = Integer.MIN_VALUE;
		int area = 0;
		for(int i = 0 ; i<n ; i ++)
		{
			int height = heights[i];
			int width = nsr[i] - nsl[i] -1;
			
			area =  height * width ;
			
			maxArea= Math.max(area, maxArea);
		}
		System.out.println(maxArea);
	}
}
