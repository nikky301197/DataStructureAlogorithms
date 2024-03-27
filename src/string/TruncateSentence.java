package string;

import java.util.StringTokenizer;

public class TruncateSentence {

	public static void main(String[] args) {
		String  s = "Hello how are you Contestant";
		int k = 4;
		StringTokenizer s1 = new StringTokenizer(s, " ");
		int count= 0;
		StringBuilder truncatestring= new StringBuilder();
		while(s1.hasMoreTokens())
		{
			truncatestring.append(s1.nextToken()+" ");
			count++;
		    if (count == k )
		    {
		    
		    	break ;
		    }
		}
		System.out.println(truncatestring);
	}
}
