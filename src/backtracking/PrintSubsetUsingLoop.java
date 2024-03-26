package backtracking;

public class PrintSubsetUsingLoop {
public static void main(String[] args) {
	String s = "abc";
//	a b c ab bc ac abc
	
	for(int i= 0 ; i < s.length(); i ++)
	{
//		System.out.print(s.charAt(i)+" ");
		for(int j = i ; j < s.length()  ; j++)
		{
			System.out.println(s.substring(i, j+1));
		}
	}
}
}
