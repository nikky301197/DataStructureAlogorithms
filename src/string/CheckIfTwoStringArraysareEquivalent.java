package string;

public class CheckIfTwoStringArraysareEquivalent {
	public static void main(String[] args) {

		String word1[] = { "ab", "c" };
		String word2[] = { "a", "bc" };
		StringBuilder sum1 = new StringBuilder();
		StringBuilder sum2 = new StringBuilder();
		
		for(int i = 0 ;i< word1.length ;i++)
		{
		sum1.append(word1[i]);	
		}
		for(int i = 0 ;i< word2.length ;i++)
		{
		sum2.append(word2[i]);	
		}
		
		System.out.println(sum1);
		System.out.println(sum2);
		boolean equivalent = (sum1+"").equals(sum2+"");
		System.out.println(equivalent);
		
	}
}
