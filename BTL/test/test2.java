import java.util.Stack;
import java.lang.Math;
public class test2{
	private static double calculatePostfix(String str){
        Stack<Double> stack = new Stack<>();
		String[] token = stringTokenizer(str);
		for(int i = 0; i<token.length; i++){
			if(isNum(token[i])){
				double result = Double.parseDouble(token[i]);
				stack.push(result);
			}
			if(token[i].equals("+") || token[i].equals("-") || token[i].equals("/") || token[i].equals("*") || token[i].equals("^") ){
				double num2 = stack.pop();
				double num1 = stack.pop();
				if(token[i].equals("+") ){
					stack.push(num1 + num2);
				}
				if(token[i].equals("-") ){
					stack.push(num1 - num2);
				}
				if(token[i].equals("*") ){
					stack.push(num1 * num2);
				}
				if(token[i].equals("/") ){
					stack.push(num1 / num2);
				}
				if(token[i].equals("^") ){
					stack.push(Math.pow(num1,num2));
				}
			}
		}
		return stack.pop();
	}	
	private static String[] stringTokenizer(String str){
		String[] tokens = str.split(" ");
		return tokens;
	}
	    
	private static boolean isNum(String c){
		try{
			double d = Double.parseDouble(c);
		}
		catch(NumberFormatException e){
			return false;
		}
		return true;
    }
    
	public static void main(String[] args){
		String str = "1 2 3 ^ + ";

		double str2 = calculatePostfix(str);
		System.out.println(str2);
		
	}

}