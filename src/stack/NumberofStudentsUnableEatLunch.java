package stack;

import java.util.Stack;

public class NumberofStudentsUnableEatLunch {
	
public static void main(String[] args) {
	
	int  students []= {1,1,0,0};
	int sandwiches []= {0,1,0,1};
	
	Stack <Integer> st = new Stack<>();
	Stack <Integer> sa = new Stack<>();
	for(int i = students.length -1 ; i >= 0; i--)
	{
		st.push(students[i]);
		sa.push(sandwiches[i]);
	}
	
}
}
