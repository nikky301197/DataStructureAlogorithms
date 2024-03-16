package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// pascal triangle 

public class Q20_PascalTriangle {
	public static void main(String[] args) {

		int n = 5 ;
		List<List<Integer>> l = new ArrayList<>();
		
		for(int i = 0 ;i < n ; i++)
		{
			if (i ==0)
			{
				l.add(Arrays.asList(1));
			}
			else if (i ==1)
			{
				l.add(Arrays.asList(1,1));
			}
			else
			{
				List<Integer> l1 = new ArrayList<>();
				l1.add(1);
				List<Integer>l2 =  l.get(i-1);
				for(int j = 0 ;j < l2 .size() ; j++)
				{
					
				}
			}
		}
	}

}
