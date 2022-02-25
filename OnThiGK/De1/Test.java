public class Test {	

	public static void print(Book t){
		System.out.println("Name: " + t.getName());
		System.out.println("Type:" + t.getType());
        System.out.println("Pages:" + t.getPages());
        System.out.println("Price:" + t.getPrice());
        System.out.println("Bookcare:" + t.getBookcare());
	}
	
	//Testcase Câu 1
	public static void testcase1(){
		Book t = new Book();		
		print(t);
	}
	
	public static void testcase2(){
		Book t = new Book("Programming", "TT", 100, 25, true);		
		print(t);
	}
	
	public static void testcase3(){
		Book t = new Book("Language", "TN", 200, 5.5, false);		
		print(t);
	}
	
	public static void testcase4(){
		Book t = new Book(null, null, 200, 5, true);		
		print(t);
	}
	
	public static void testcase5(){
		Book t = new Book("How to programming", null, 200, 8.6, true);			
		print(t);
	}
	
	public static void testcase6(){
		Book t = new Book("", "", 200, 12.0, false);
		print(t);
	}
	
	public static void testcase7(){
		Book t1 = new Book();		
		Book t2 = new Book();
		
		System.out.print("Number of Books: " + Book.getQuantity());
	}
	
	public static void testcase8(){
		System.out.print("Number of Books: " + Book.getQuantity());
	}
	
	public static void testcase9(){
		Book t = new Book();
		t.setName("Programming");
		t.setType("VH");
		System.out.println("Name: " + t.getName());
		System.out.println("Type:" + t.getType());
	}
	
	public static void testcase10(){
		Book t = new Book();
		t.setName("");
		t.setType(null);
        t.setPages(150);
		System.out.println("Name: " + t.getName());
		System.out.println("Type:" + t.getType());
        System.out.println("Pages:" + t.getPages());
        System.out.println("Price:" + t.getPrice());
        System.out.println("Bookcare:" + t.getBookcare());
	}
	
	public static void testcase11(){
		Book t = new Book();
		t.setPages(200);
		t.setPrice(52.9);
		t.setBookcare(true);
		System.out.println("Pages:" + t.getPages());
        System.out.println("Price:" + t.getPrice());
        System.out.println("Bookcare:" + t.getBookcare());
	}
	
	public static void testcase12(){
		Book t = new Book();
		t.setName("Structures");
		t.setType("TT");
        t.setPages(200);
		t.setPrice(60.0);
		t.setBookcare(true);
		System.out.println("Name: " + t.getName());
		System.out.println("Type:" + t.getType());
        System.out.println("Pages:" + t.getPages());
        System.out.println("Price:" + t.getPrice());
        System.out.println("Bookcare:" + t.getBookcare());
	}
	
	
	//Testcase Câu 2
	public static void testcase13(){
		Book t = new Book("Data", "TT", 100, 25, true);
		System.out.printf("Thickness: %.2f", t.getThickness());
	}
	
	public static void testcase14(){
		Book t = new Book("Data", "TT", 100, 25, true);
		t.setPages(300);
		System.out.printf("Thickness: %.2f", t.getThickness());
	}
    
    public static void testcase15(){
		Book t = new Book("Data", "TT", 50, 25, true);
		System.out.println("Class:" + t.classification());
	}
	
	public static void testcase16(){
		Book t = new Book("Data", "TT", 50, 25, true);
		t.setPages(300);
		System.out.println("Class:" + t.classification());
	}
	
	public static void testcase17(){
		Book t = new Book("Data", "TT", 200, 25, true);
		System.out.printf("Price: %.2f", t.discountPrice());
	}
    
    public static void testcase18(){
		Book t = new Book("Data", "TT", 200, 25, true);
        t.setType("VH");
		System.out.printf("Price: %.2f", t.discountPrice());
	}
	
	public static void testcase19(){
		Book t = new Book("Data", "TT", 200, 25, true);
        t.setType("TN");
        t.setBookcare(false);
		System.out.printf("Price: %.2f", t.discountPrice());
	}
	
	
	//Testcase Câu 3
	public static void testcase20(){
		Book t1 = new Book("Data", "TT", 200, 25, true);
		Book t2 = new Book("Structures", "TT", 200, 27, true);		
		if(t1.equals(t2))
			System.out.print("True");
	}
	
	public static void testcase21(){
		Book t1 = new Book("Data", "TT", 200, 25, true);
		Book t2 = new Book("Data", "NT", 200, 25, true);
		
		if(!t1.equals(t2))
			System.out.print("False");
	}
	
	public static void testcase22(){
		Book t1 = new Book("Data", "TT", 200, 25, true);
		Book t2 = new Book("Data", "NT", 200, 50, true);
		t2.setType(t1.getType());
		t2.setPrice(t1.getPrice());
		
		if(t1.equals(t2))
			System.out.print("True");
	}
	
	public static void testcase23(){
		Book t1 = new Book();
		Book t2 = new Book();
		t1.setType(null);
		
		if(!t1.equals(t2))
			System.out.print("False");
	}
    
    public static void testcase24(){
		Book t = new Book("Pinocchio", "TT", 200, 25, true);
		
		System.out.println(t);
	}
    
    public static void testcase25(){
		Book t = new Book();
        t.setName("Pinocchio");
        t.setType("VH");
		t.setPages(200);
		t.setPrice(52.9);
		t.setBookcare(false);
        System.out.println(t);
	}
	
	public static void main(String[] args){
			testcase1(); 
			 testcase2();
			 testcase3();
			 testcase4();
			 testcase5();
			testcase6();
			
			testcase7();
			 testcase8();
			 testcase9();
			testcase10();
			 testcase11();
			 testcase12();
			 testcase13();
			 testcase14();
			 testcase15();
			 testcase16();
			 testcase17();
			 testcase18();
			 testcase19();
			 testcase20();
			 testcase21();
			testcase22();
			testcase23();
			testcase24();
			testcase25();

			}
	
}
