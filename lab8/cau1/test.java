public class test {
    public static void main(String[] args)
    {
        MyQueue<Fraction> list = new MyQueue<>();
        list.enQueue(new Fraction(1, 2));
        list.enQueue(new Fraction(3, 4));
        list.enQueue(new Fraction(9, 4));
        
        list.print();
        System.out.println(list.size());
		list.deQueue();
        list.print();
        System.out.println(list.size());
        System.out.println(list.getHead());
    }
}