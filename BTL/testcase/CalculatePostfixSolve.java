
import java.util.Stack;

//Sinh vien khong chinh sua bat ky dong lenh nao ben tren dong comment "Phan bai lam cua sinh vien", duoc phep them thu vien khi can thiet

public class CalculatePostfixSolve implements Requirement2_OutputGetter{
	private String inputString;
	private double resultOfExpression;
	
	public CalculatePostfixSolve(){ //Phuong thuc khong duoc chinh sua
		this.inputString = "";
		this.resultOfExpression = 0;
	}
	
	public CalculatePostfixSolve(String inputString){ //Phuong thuc khong duoc chinh sua
		this.inputString = inputString;
		this.resultOfExpression = 0;
	}
	
	public void setInputString(String inputString){ //Phuong thuc khong duoc chinh sua
		this.inputString = inputString;
	}	
	
	public double getResultOfExpression(){ //Phuong thuc khong duoc chinh sua
		this.resultOfExpression = calculatePostfix();
		return this.resultOfExpression;
	}	
	
	// Phan bai lam cua sinh vien
	private boolean operator(String s) {
	    return "+".equals(s) || "-".equals(s) || "*".equals(s) || "/".equals(s) || "^".equals(s);
	}
	private double calculatePostfix(){
      // code here
		double number1;
		double number2;
		String[] Reinp = stringTokenizer(this.inputString);	
		Stack<Double> stack = new Stack<>();
		double result = 0;
		for (String ch : Reinp) {
			if(ch.length() == 2) {
				stack.push(Double.parseDouble(ch));
			}
			if(isNum(ch)) {
				stack.push(Double.parseDouble(ch));
			}
			if (operator(ch)) {
				if (!stack.empty() ) {     					
					number2 = stack.pop();
					number1 = stack.pop();
					if ("/".equals(ch)){
						if (number1 == 0 && number2 == 0) {
							result = 0;
							break;
						} else {
							result = number1 / number2;
						}
					}
	                if("*".equals(ch)){
	                    result = number1 * number2;
	                }
	                if("+".equals(ch)){
	                    result = number1 + number2;
	                }
	                if("-".equals(ch)){
	                    result = number1 - number2;
	                }
	                if("^".equals(ch)){
	                    result = Math.pow(number1, number2);
	                }
	                stack.push(result);
				}		
			}
		}
		return result;
	}
	
	private String[] stringTokenizer(String str){
      // code here
		String[] tokens = null;
		tokens = str.split(" ");
		return tokens;
	}
	
	private boolean isNum(String c) {
		return c.matches("0|([1-9][0-9]*)");
  }
}

