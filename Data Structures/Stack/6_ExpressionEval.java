import java.util.*;
public class ExpressionEval{
	static int prec(char c){
    switch(c){
      case '^':
        return 3;
      case '*':
        return 2;
      case '\\':
        return 2;
      case '+':
        return 1;
      case '-':
        return 1;
    }
    return -1;
  }
	static int evaluate(String s) {
		Stack<Integer> val = new Stack<>();
		Stack<Character> op = new Stack<>();
		for(int i = 0; i < s.length(); i++){
			if(Character.isDigit(s.charAt(i))){
				val.push(Integer.parseInt("" + s.charAt(i)));
			}
			else if(s.charAt(i) == '('){
				op.push(s.charAt(i));
			}
			else if(s.charAt(i) == ')'){
				while(op.isEmpty() || op.peek() != '('){
					int val2 = val.pop();
					int val1 = val.pop();
					switch(op.pop()){
						case '+':
							val.push(val1 + val2);
							break;
						case '-':
							val.push(val1 - val2);
							break;
						case '*':
							val.push(val1 * val2);
							break;
						case '/':
							val.push(val1 / val2);
							break;
					}
				}
				op.pop();
			}
			else{
				while(!op.isEmpty() && prec(op.peek()) >= prec(s.charAt(i)) && op.peek() != '('){
					int val2 = val.pop();
					int val1 = val.pop();
					switch(op.pop()){
						case '+':
							val.push(val1 + val2);
							break;
						case '-':
							val.push(val1 - val2);
							break;
						case '*':
							val.push(val1 * val2);
							break;
						case '/':
							val.push(val1 / val2);
							break;
					}
				}
				op.push(s.charAt(i));
			}
			//System.out.println(val.toString());
			//System.out.println(op.toString());
		}
		while(!op.isEmpty()){
			int val2 = val.pop();
			int val1 = val.pop();
			switch(op.pop()){
				case '+':
					val.push(val1 + val2);
					break;
				case '-':
					val.push(val1 - val2);
					break;
				case '*':
					val.push(val1 * val2);
					break;
				case '/':
					val.push(val1 / val2);
					break;
			}
		}
		return val.pop();
	}

	public static void main(String[] args) {
		String s = "(1+2-3+(4*2))+4";
		System.out.println(evaluate(s));
	}
}
