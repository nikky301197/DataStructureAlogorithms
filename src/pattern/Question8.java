package pattern;

public class Question8 {
	public static void main(String[] args) {
		
		for(int i = 4 ; i >=0 ; i --)
		{
			
			for(int j = i ;j > 0 ; j--)
			{
				System.out.print(" ");
			}
			for(int k = 1 ; k <=9 ; k ++)
			{
				if(k%2!=0)
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
