package string;

public class GoalParserInterpretation {
	public static void main(String[] args) {
		String command = "G()()()()(al)";
		StringBuilder s = new StringBuilder(); 
		int i = 0;
		while(i < command.length() ){
			if (command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
				s.append("o");
				i= i+2;
			}
			else if  (command.charAt(i) == '(' && command.charAt(i + 1) == 'a') {
				s.append("al");
				i= i+4;
			}
			else {
			s.append(command.charAt(i) + "");
			i++;
			}
		}
		
		System.out.println(s);
	}
}
