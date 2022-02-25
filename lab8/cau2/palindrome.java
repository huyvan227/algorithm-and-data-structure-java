public class palindrome extends MyStack<Character>{
	public static String checkPalindrome(String str){
		if(str.isEmpty()){
			return "String is palindrome";
		}
		String tmp = str;
		MyStack<Character> stack = new MyStack<>();
		int x = str.length();
		for(int i =0; i<x;i++){
			char currchar = str.charAt(i);
			stack.push(currchar);
		}
		String output ="";
		for(int n = 0; n<x;n++){
			char charr = stack.pop();
			output = output + charr;
		}
		if(output.equals(tmp)){
			return "String is palindrome";
		}
		else{
			return "String is not palindrome";
		}
	}
	public static void main(String[] args){
		String input = "1001";
		String result = checkPalindrome("1001");
		System.out.println(input);
		System.out.println(result);
	}
}