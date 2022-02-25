public class Test {
    public static void main(String[] args)
    {
        MyStack<Fraction> list = new MyStack<>();
        list.push(new Fraction(1, 2));
        list.push(new Fraction(3, 4));
        list.push(new Fraction(9, 4));
        
        list.print();
        System.out.println(list.size());
		list.pop();
        list.print();
        System.out.println(list.size());
        System.out.println(list.getHead());
    }
}