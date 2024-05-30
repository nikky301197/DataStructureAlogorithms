package string;

public class LargestOddNumberString {
public static void main(String[] args) {
	String num = "2043321819";;
	
	for(int j = num.length()-1 ; j >=0 ; j--)
	{
		Double i = Double.parseDouble(num.substring(0,j+1));
		if (i%2.0!=0.0)
		{
			String largestOdd = i+"";
			largestOdd.substring(0 , largestOdd.indexOf("."));
			System.out.println(i);
			break;
		}
	}
			
	
}
}
