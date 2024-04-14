package linkedList;

public class ConvertBinaryIntegerInLinkedList {

public static void main(String[] args) {
	
	 Integer a[] = {1,0,0,1,0,0,1,1,1,0,0,0,0,0,0};
	 double   dec = 0;
	 int j =0;
	 for(int i = a.length-1 ; i >=0 ; i--)
	 {
		
		 dec = dec+ (Math.pow(2, j)) * a[i];
		 j++;
	 }
	 System.out.println((int)dec);
	 
}
}
