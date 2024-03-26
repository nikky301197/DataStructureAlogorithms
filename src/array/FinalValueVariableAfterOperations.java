package array;

public class FinalValueVariableAfterOperations {
	public static void main(String[] args) {

		String operations[] = { "++X","++X","X++"};
		int x = 0;
		for (int i = 0; i < operations.length; i++) {
			if (operations[i].contains("+")) {
				++x;
			} else {
				--x;
			}

		}
		System.out.println(x);
	}
}
