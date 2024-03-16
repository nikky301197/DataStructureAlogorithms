package array;

import java.util.ArrayList;

//Problem Statement: Given an array, print all the elements which are leaders.
//A Leader is an element that is greater than all of the elements on its right side in the array.

//brutte force - two loop which is nested 
// Time Complexity - 0(n)2
//optimal solution - two pointer - solve through single loop 
//time complexity - 0(n)

public class Q15_LeaderInArray {
	public static void main(String[] args) {

		int a[] = { 1,2,2,1 };
		int n = a.length;

		int i = 0;
		int j = a.length - 1;
		ArrayList<Integer> leaders = new ArrayList<>();
		while (i < n) {

			if (a[i] > a[j]) {
				j--;
			}
			else if (i == j && a[i] == a[j]) {
				leaders.add(a[i]);
				i++;
				j = a.length - 1;
			}
			else {
				i++;
				j = a.length - 1;

			}
		}

		System.out.println(leaders);
	}
}
