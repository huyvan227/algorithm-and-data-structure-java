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
	private String infixToPostfix(){
		String str = this.inputString;;
		String postfix = "";
        Stack<String> stack = new Stack<>();
		String[] token = stringTokenizer(str);
		for(int i = 0; i<token.length; i++){
			if(isNum(token[i])){
				postfix = postfix +" "+token[i];
			}
			

			if(token[i].equals("+") || token[i].equals("-") || token[i].equals("/") || token[i].equals("*") || token[i].equals("^") ){
			while(!stack.empty() && priorityOfOperator(token[i]) <= priorityOfOperator(stack.peek())  && (!stack.peek().equals("(")))  {
					String ch = stack.pop();
					postfix = postfix +" "+ ch;
				}
				stack.push(token[i]);
			}
			if(token[i].equals("(")){
				stack.push(token[i]);
			}
			
			if(token[i].equals(")")){
				while(!stack.peek().equals("(")){
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
	
	private int priorityOfOperator(String op){
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
}
