import java.util.StringTokenizer;
import java.util.Stack;
public class test{
	private static String infixToPostfix(String str){
		String postfix = "";
        Stack<String> stack = new Stack<>();
		String[] token = stringTokenizer(str);
		for(int i = 0; i<token.length; i++){
			if(isNum(token[i])){
				postfix = postfix +" "+token[i];
			}
			if(token[i].equals("+") || token[i].equals("-") || token[i].equals("/") || token[i].equals("*") || token[i].equals("^") ){
				while(!stack.empty() && priorityOfOperator(token[i]) <= priorityOfOperator(stack.peek()) && !(stack.peek().equals("(")))  {
					String ch = stack.pop();
					postfix = postfix +" "+ ch;
				}
				stack.push(token[i]);
			}
			if(token[i].equals("(")){
				stack.push(token[i]);
			}
			if(token[i].equals(")")){
				while(stack.peek().equals("(")){
					String ch2 = stack.pop();
					postfix = postfix +" "+ ch2;
				}
				if (stack.peek().equals("(")){
					stack.pop();
				}
			}
		}
		while (!stack.empty()){
				String ch3 = stack.pop();
				postfix = postfix +" "+ ch3;
			}
		
		return postfix;
	}
	private static int priorityOfOperator(String op){
        switch(op){
			case "+":
				return 1;
			case "-":
				return 1;
			case "*":
				return 2;
			case "/":
				return 2;
			case "^":
				return 3;
		}
    	return 0;
    }
	private static String[] stringTokenizer(String str){
		String[] tokens = str.split(" ");
		return tokens;
	}
	    
	private static boolean isNum(String c) {
		try{
			double d = Double.parseDouble(c);
		}
		catch(NumberFormatException e){
			return false;
		}
		return true;
    }
	public static void main(String[] args){
		String str = "( ( 10 * 3 - 8 ) ^ ( 16 - 20 / 2 ) ) + ( 112 + 18 * 213 - 199 ) * 6";
		String str3 = "123 + +  3456";
		String[] token = stringTokenizer(str3);
		for(int i = 0;i<token.length;i++){
			if(token[i] == "+"){
				System.out.println("true");
			}
			System.out.println(token[i]);
		}
		System.out.println(token[0]);
		
		String str2 = infixToPostfix(str);
		System.out.println(str2);
		
	}
}