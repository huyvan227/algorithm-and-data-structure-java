public class Balance extends MyStack<Character>{
	public static String checkBalanced(String str){
		if(str.isEmpty()){
			return "Balanced";
		}
		MyStack<Character> stack = new MyStack<>();
		
		for(int i = 0;i<str.length();i++){
			char currchar = str.charAt(i);
			if(currchar == '(' || currchar == '[' || currchar == '{'){
				stack.push(currchar);
			}
			if(currchar == ')' || currchar == ']' || currchar == '}'){
				if(stack.isEmpty()){
					return "Not Balanced";
				}
				Node<Character> tmp = stack.getHead();
				char last = tmp.getData();
				if(currchar == ')'  && last == '(' || currchar == ']'  && last == '[' || currchar == '}'  && last == '{'){
					stack.pop();
				}
				else{
					return "Not Balanced";
				}
			}
		}
		return stack.isEmpty()?"Balanced":"Not Balanced";
		}

	public static void main(String[] args){
		String checkBalancedExpr1=checkBalanced("({} W*W [A+S[C*S[A+B]]]	()");
		System.out.println("({} W*W [A+S[C*S[A+B]]]	() : "+checkBalancedExpr1);
		String checkBalancedExpr2=checkBalanced("({A+A}[B+S]A/S[C*D])");
		System.out.println("({A+A}[B+S]A/S[C*D]) : "+checkBalancedExpr2);
	}
}
	

