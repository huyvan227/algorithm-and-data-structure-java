import java.util.Stack;
import java.lang.Math;
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
	private double calculatePostfix(){
		String str = this.inputString;
        Stack<Double> stack = new Stack<>();
		String[] token = stringTokenizer(str);
		for(int i = 0; i<token.length; i++){
			if(token[i].equals("+") || token[i].equals("-") || token[i].equals("/") || token[i].equals("*") || token[i].equals("^") ){
				double num2 = stack.pop();
				double num1 = stack.pop();
				if(token[i].equals("*") ){
					stack.push(num1 * num2);
				}
				if(token[i].equals("/") ){
					if(num2 == 0 ){
						stack.push(0.0);
					}
					else{	
						stack.push(num1 / num2);
					}
				}
				if(token[i].equals("+") ){
					stack.push(num1 + num2);
				}
				if(token[i].equals("-") ){
					stack.push(num1 - num2);
				}
				if(token[i].equals("^") ){
					stack.push(Math.pow(num1,num2));
				}
			}
			if(isNum(token[i])){
				double result = Double.parseDouble(token[i]);
				stack.push(result);
			}
		}
		return stack.pop();
	}	
	
	private String[] stringTokenizer(String str){
		String[] tokens = str.split(" ");
		return tokens;
	}
	
	private boolean isNum(String c) {
		try{
			double d = Double.parseDouble(c);
		}
		catch(NumberFormatException e){
			return false;
		}
		return true;
    }
}
