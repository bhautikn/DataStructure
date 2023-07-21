import java.util.Stack;
public class EvaluatePostfix{
	public static void main(String[] args) {
		System.out.println(eval("5, 4, 6, +, *, 4, 9, 3, /, +, *"));
	}
	static int eval(String expression){
		Stack<Integer> s = new Stack<>();
		for (int i=0;i<expression.length();i++) {
			char tempValue = expression.charAt(i);
			if (tempValue ==',' || tempValue == ' ')
				continue;
			else if (tempValue >= '0' && tempValue <= '9') {
				s.push(tempValue-48);
			}
			else {
				int temp = s.pop();
				s.push(opration(s.pop(), temp, tempValue));
			}
		}
		return s.pop();
	}
	static int opration(int a, int b, char oprator){
		if (oprator == '+') return a+b;
		if (oprator == '-') return a-b;
		if (oprator == '*') return a*b;
		if (oprator == '/') return a/b;
		if (oprator == '^' || oprator == '$') 
			return (int)Math.pow(a,b);
		return 0;
	}
}