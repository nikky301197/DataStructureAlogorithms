package string;

public class Jewels {
public static void main(String[] args) {
	 String jewels = "aA";
			 
	 String stones = "aAAbbbb";
//	 CharSequence
	 int count = 0;
	 for(int i = 0 ; i < jewels.length() ; i ++)
	 {
		 if( stones.contains(jewels.charAt(i)+"")) {
		 for(int j = 0 ; j < stones.length() ; j++)
		 {
			if(jewels.charAt(i)== stones.charAt(j)) 
			{
				count++;
			}
		 }
		 }
	 }
	 System.out.println(count);
}
}
