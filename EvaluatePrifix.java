import java.util.Stack;

public class EvaluatePrifix{
	public static void main(String[] args) {
		String str = "+, -, *, 2, 2, 1, 16, 8, 5";
		System.out.print(eval(str));
	}
	static int eval(String tempExpression){
		String expression[] = tempExpression.split(",");
		
		for (int i=0;i<expression.length/2;i++) {
			String temp = expression[expression.length-i-1];
			expression[expression.length-i-1] = expression[i];
			expression[i] = temp;
		}

		Stack<Integer> s = new Stack<>();
		for (int i=0;i<expression.length;i++) {
			String tempValue = expression[i].trim();
			try{
				s.push(Integer.parseInt(tempValue));
			}
			catch(NumberFormatException e){
				int temp = s.pop();
				s.push(opration(s.pop(), temp, tempValue.charAt(0)));
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