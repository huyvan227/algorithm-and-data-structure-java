class Book {
	
	//Khai bao cac thuoc tinh
	private static int quantity;
	private String name;
    private String type;
    private int pages;
    private double price;
	private boolean bookcare;
	
	//Sinh vien cai dat cac phuong thuc constructor tai day
	public Book() {
		name = null;
		type = "TN";
		pages = 0;
		price = 10;
		bookcare = false;
		quantity++;
	}
	
	public Book(String name, String type, int pages, double price, boolean bookcare) {
		this.name = name;
		this.type = type;
		this.pages = pages;
		this.price = price;
		this.bookcare = bookcare;
		quantity++;
	}
	
	//Sinh vien cai dat cac phuong thuc get/set tai day
	public String getName(){
		return this.name;
	}
	public String getType(){
		//SV viet code tai day
		return this.type;
	}
	public int getPages(){
		//SV viet code tai day
		return this.pages;
	}
	public double getPrice(){
		//SV viet code tai day
		return this.price;
	}
    public boolean getBookcare(){
		//SV viet code tai day
		return this.bookcare;
	}
	public static int getQuantity(){
		//SV viet code tai day
		return quantity;
	}
	public void setName(String name){
		//SV viet code tai day
		this.name = name;
	}
	public void setType(String type){
		//SV viet code tai day
		this.type = type;
	}
	public void setPages(int pages){
		//SV viet code tai day
		this.pages = pages;
	}
	public void setPrice(double price){
		//SV viet code tai day
		this.price = price;
	}
    public void setBookcare(boolean bookcare){
        //SV viet code tai day
		this.bookcare = bookcare;
    }
	
	//Sinh vien cai dat cac phuong thuc cau 2 tai day
	public double getThickness(){
		double thick = (pages/2)*0.12;
		return thick;
	}
	public String classification(){
		double a = this.getThickness();
		if(a<=3){
			return "loai C";
		}
		else if( 3<a && a<=6){
			return "loai B";
		}
		else{
			return "loai B";
		}
		
	}
	
    public double discountPrice(){
		double discount;
		String b = this.getType();
		if(b.equals("VH")){
			if(this.getBookcare()){
				return discount = this.getPrice() - (0.2*this.getPrice()) + 10;
			}
			else{
				return discount = this.getPrice() - (0.2*this.getPrice());
			}
		}
		if(b.equals("TT")){
			if(this.getBookcare()){
				return discount = this.getPrice() - (0.1*this.getPrice()) + 10;
			}
			else{
				return discount = this.getPrice() - (0.1*this.getPrice());
			}
		}
		if(b.equals("TN")){
			if(this.getBookcare()){
				return discount = this.getPrice() - (0.3*this.getPrice()) + 10;
			}
			else{
				return discount = this.getPrice() - (0.3*this.getPrice());
			}
		}
		else{
			return 0;
		}
			
	}
	
	//Sinh vien cai dat phuong thuc xet su bang nhau cua hai cuon sach tai day
	public boolean equals(Object obj) {
		if(obj instanceof Book){
			Book a = (Book)obj;
			if(this.getType()==null || a.getType()==null ){
				return false;
			}
			else if(this.getType().equals(a.getType()) && ((this.getPrice()-a.getPrice())<2)){
				return true;
			}
			else{
				return false;
			}
		}
		else{
		return false;
		}
	}
    
    //Sinh vien cai dat phuong thuc toString tai day
    public String toString() {
		//SV viet code tai day
		return "Book name= " +this.getName()+" Type = "+this.getType()+" Pages= " +this.getPages()+" Price= " +this.getPrice()+ " Bookcare= " +this.getBookcare() ;
	}    
}
