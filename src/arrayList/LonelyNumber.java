package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LonelyNumber {
	public static void main(String[] args) {
		int a[] = { 10, 6, 5, 8 };
		List<Integer> l = new ArrayList<>();
		int n = a.length;
		for (int i = 0; i < n; i++) {
			int f = Collections.frequency(l, l.get(i));
			if (f < 1) {
				if (i == 0) { 

				} 
				else if (a.length - 1 == i) {

				} 
				else {

				}

			}

		}
	}
}
