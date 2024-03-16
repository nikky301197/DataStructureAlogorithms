package array;

import java.util.Arrays;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Q12_UnionSortedTwoArray {
public static void main(String[] args) {
	int a1[] = {1,2,3,4,5}  ;
	int a2[] = {2,3,4,4,5,6};
	
	TreeSet<Integer> t = new TreeSet<>();
	Arrays.stream(a1).boxed().map(a-> t.add(a)).collect(Collectors.toList());
	Arrays.stream(a2).boxed().map(a-> t.add(a)).collect(Collectors.toList());
	System.out.println(t);
	
	
}
}
