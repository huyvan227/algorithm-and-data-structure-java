

import java.util.Stack;

//Sinh vien khong chinh sua bat ky dong lenh nao ben tren dong comment "Phan bai lam cua sinh vien", duoc phep them thu vien khi can thiet

public class InfixToPostfixSolve implements Requirement1_OutputGetter {
	private String inputString;
	private String outputString;
	
	public InfixToPostfixSolve(){ //Phuong thuc khong duoc chinh sua
		this.inputString = "";
		this.outputString = "";
	}
	
	public InfixToPostfixSolve(String inputString){ //Phuong thuc khong duoc chinh sua
		this.inputString = inputString;
		this.outputString = "";
	}
		
	public void setInputString(String inputString){ //Phuong thuc khong duoc chinh sua
		this.inputString = inputString;
	}
	
	public String getOutputString() { //Phuong thuc khong duoc chinh sua
		this.outputString = infixToPostfix();
		return outputString;
	}	
	
	// Phan bai lam cua sinh vien
	private boolean operator(String s) {
	    return "+".equals(s) || "-".equals(s) || "*".equals(s) || "/".equals(s) || "^".equals(s);
	}
	private String infixToPostfix() {
		String postfix = "";
      // code here
		String[] Reinp = stringTokenizer(this.inputString);	
		Stack<String> stack = new Stack<>();		
		for (String ch : Reinp) {  
			if(ch.length() == 2) {
				postfix = postfix + ch + " ";
			}
			if(isNum(ch)) {
				postfix = postfix + ch + " ";
			} 
			if (" ".equals(ch)) {
				stack.push(ch);
			}
			if ("(".equals(ch)) {
				stack.push(ch);	
			}
			if (")".equals(ch)) {
				while ( !stack.peek().equals("(") && !stack.empty()) {    
					postfix = postfix + stack.pop() + " ";
				}
				if (!stack.empty()) {
					stack.pop();	
				}
			}
			if (operator(ch)) {
				while ( !stack.empty() && stack.peek() != "(" &&              
						priorityOfOperator(ch) <= priorityOfOperator(stack.peek()) ) {     
					postfix = postfix + stack.pop() + " ";    
				}
				stack.push(ch);		
			}
		} 
	
		while  (!stack.empty()) {
			postfix = postfix + stack.pop() + " "; 
		}
		return postfix;
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
	
	private int priorityOfOperator(String op){
      // code here
		switch (op) 
		{
		case "+":
        case "-": 
            return 1; 
            
        case "*": 
        case "/": 
            return 2; 
       
        case "^": 
            return 3; 
        } 
        return 0;
	}   
}
