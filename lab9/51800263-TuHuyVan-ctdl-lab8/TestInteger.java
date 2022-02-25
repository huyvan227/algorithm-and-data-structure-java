public class TestInteger{
    public static void main(String[] args){
        IntegerLinkedList list = new IntegerLinkedList();
        list.addFirst(10);
        list.addLast(11);
        list.addAfter(list.getHead(),9);
        list.addLast(2);
        list.print();
		list.sortAscen();
        list.setHead(list.addSortedList(list.getHead(),5));
		list.print();
		System.out.print("reverse list: ");
		list.printReverse(list.getHead());
		System.out.println("\ncount odd: "+list.countOdd(list.getHead()));
		System.out.println("count even: " +list.countEven(list.getHead()));
		System.out.println("sum of list: "+list.sum(list.getHead()));
		System.out.println("find 5: "+list.findNum(list.getHead(),5));
		System.out.println("find 3: "+list.findNum(list.getHead(),3));
    }
}