package array;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter {
	public static void main(String[] args) {
		String words[] = { "leet", "code" };
		char x = 'e';
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0;i< words.length ;i++)
		{
			if(words[i].contains(x+""))
			{
				list.add(i);
			}
		}
	}
}
