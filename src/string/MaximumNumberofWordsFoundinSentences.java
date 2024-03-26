package string;

import java.util.StringTokenizer;

public class MaximumNumberofWordsFoundinSentences {
	public static void main(String[] args) {
		String sentences[] = 
			
			{ "alice and bob love leetcode", "i think so too", "this is great thanks very much" };
		int n = sentences.length;
		int max= Integer.MIN_VALUE;
		for(int i = 0 ; i < n ; i++)
		{
		 StringTokenizer str   = 	 new StringTokenizer(sentences[i], " ");
	     int count =  str.countTokens();  
		  max = Math.max(count, max);
		}
		System.out.println(max);

	}
}
