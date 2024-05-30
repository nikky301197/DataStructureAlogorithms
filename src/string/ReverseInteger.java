package string;

import java.util.Arrays;

public class ReverseInteger {
public static void main(String[] args) {
	int x = -123;
	
	String ss = x+"";
	int n = ss.length();
	char[] c=  ss.toCharArray();
	int j = n-1;
	for(int i = 0 ; i < n/2 ; i++)
	{
		
		char temp = c[i];
		c[i] = c[j];
		c[j] = temp ;
		j--;
	}
	  
System.out.println(Arrays.toString(c));
}
}
