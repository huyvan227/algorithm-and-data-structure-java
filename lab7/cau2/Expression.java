public class Expression extends MyStack<Character> {
	public static double P(int n){
		MyStack<Double> stack = new MyStack<>();
		int m = n;
		while (n!=1){
			stack.push((Math.pow(2,n)+Math.pow(n,2)));
			n -= 1;
		}
		double result = 3;
		while (m!=n){
			double r = stack.pop();
			result = result + r;
			m -= 1;
		}
		return result;		
	}
	public static void main(String[] args){
		System.out.println("result: " +P(4));
	}
}