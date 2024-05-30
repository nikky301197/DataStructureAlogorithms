package string;

public class ReversePrefixofWord {

	public static void main(String[] args) {
		String word = "abcdef";
		Character ch = 'c';
		String newword = "";
		System.out.println(word.lastIndexOf('f'));
		if (word.contains(ch + "")) {

			int index = word.indexOf(ch);

			for (int i = index; i >= 0; i--) {
				newword = newword + word.charAt(i);
			}
			if (index < word.length() - 1) {
				String substring = word.substring(index + 1);
				newword = newword + substring;
			}

		}

		System.out.println(newword);
	}
}
