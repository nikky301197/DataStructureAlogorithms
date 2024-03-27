package string;

import java.util.Arrays;

public class ShuffleString {
public static void main(String[] args) {
	String  s = "codeleet"; 
	int indices[] = {4,5,6,7,0,2,1,3};
	char c[]= new char[s.length()];
	for(int i = 0 ;i< s.length() ;i++)
	{
		c[indices[i]] = s.charAt(i);
	}
	String sufflestr = new String (c);
	
}
}
