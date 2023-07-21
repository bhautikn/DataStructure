import Stack.Stack;
public class InfixToPrefix{
	public static void main(String[] args) {
		String expression = "A+B+C";
		System.out.println(InfixToPrefix(expression));
	}
	static String InfixToPrefix(String str){
		char[] temp = str.toCharArray();
		for (int i=0;i<str.length();i++) {
			if (temp[i] == '(' )
				temp[i] =')';
			else if (temp[i] == ')' )
				temp[i] ='(';
		}
		String tempStr = InfixToPostfix(new StringBuffer(temp.toString()).reverse().toString());
		return new StringBuffer(tempStr).reverse().toString();
	}
	static String InfixToPostfix(String expression){
		Stack s = new Stack();
		String reversePolish = "";
		s.push('(');
		expression += ")";
		for (int i=0;i<expression.length();i++) {
			while(stackPrecident((char)s.peek()) > inputPrecident(expression.charAt(i)) ){
				reversePolish += (char)s.pop();
			}
			if (stackPrecident((char)s.peek()) != inputPrecident(expression.charAt(i)) ) {
				s.push(expression.charAt(i));
			}
			else{
				s.pop();
			}
		}
		return reversePolish;
	}
	static int inputPrecident(char ch){
		if (ch == '+' || ch == '-') return 1;
		if (ch == '*' || ch == '/') return 3;
		if (ch == '^' || ch == '$') return 6;
		if (Character.isLetter(ch) || (ch >= '0' && ch <= '9'))
			return 7;
		if (ch == '(') return 9;
		return 0;
	}
	static int stackPrecident(char ch){
		if (ch == '+' || ch == '-') return 2;
		if (ch == '*' || ch == '/') return 4;
		if (ch == '^' || ch == '$') return 5;
		if (Character.isLetter(ch) || (ch >= '0' && ch <= '9'))
			return 8;
		if (ch == '(') return 0;
		return 0;
 	}
}