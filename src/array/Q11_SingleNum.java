package array;

import java.util.HashSet;

//Find the number that appears once, and the other numbers twice
public class Q11_SingleNum {

	public static void main(String[] args) {
		int a[]= {1,2,1,2,4,3,3};
	   int n = a.length;
	   
	    int xorr = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("value of xor"+xorr+" value of a[i]"+a[i]);
        	xorr = xorr ^ a[i];
            
        }
        System.out.println("result"+xorr);
	}
}

//important condition if we are using xor 
// 1^1 = 0 2^2 = 0 4^0 = 4
//but other number must be present only 2 times.
