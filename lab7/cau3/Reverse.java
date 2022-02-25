public class Reverse extends MyStack<Character>{
	public static String reverse(String str){
		int n = str.length();
		MyStack<Character> stack = new MyStack<>();
		for(int i = 0;i<n;i++){
			stack.push(str.charAt(i));
		}
		String revstr ="";
		
		for(int i = 0;i<n;i++){
			char ch = stack.pop();
			revstr = revstr + ch;
		}
		return revstr;
		
	}
	public static void main(String[] args){
		String str = new String("hello world");
		String output = reverse(str);
		System.out.println(output);
	}
}