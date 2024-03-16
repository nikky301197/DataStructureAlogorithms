package array;

public class Q5_RotateAryBy1 {
	public static void main(String[] args) {

//		time complexity - 0(n)
//		space complexity - 0(1)
		
		int a[] = { 1, 2, 3, 4, 5 };
		int temp = a[0];
		int n = a.length;
		for (int i = 1; i < n; i++) {
          a[i-1] =a[i];
          if (i== n-1)
          {
        	  a[i] = temp;
          }
		}
		for(int b : a)
		{
			System.out.print(b+" ");
		}
	}

}
