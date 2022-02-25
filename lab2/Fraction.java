public class Fraction{
	private int ts;
	private int ms;
	
	public Fraction(){
		this.ts = 2;
		this.ms = 3;
	}
	public Fraction(int ts, int ms){
		this.ts = ts;
		this.ms = ms;
	}
	public Fraction(Fraction a){
		this.ts = a.ts;
		this.ms = a.ms;
	}
	public Fraction add(Fraction b){
		int ts1 = this.ts*b.ms + b.ts*this.ms;
		int ms1 = this.ms*b.ms;
		return new Fraction(ts1,ms1);
	}
	public Fraction subtract(Fraction b){
		int ts1 = this.ts*b.ms - b.ts*this.ms;
		int ms1 = this.ms*b.ms;
		return new Fraction(ts1,ms1);
	}
	public Fraction multiple(Fraction b){
		int ts1 = this.ts*b.ts;
		int ms1 = this.ms*b.ms;
		return new Fraction(ts1,ms1);
	}
	public Fraction divide(Fraction b){
		int ts1 = this.ts*b.ms;
		int ms1 = this.ms*b.ts;
		return new Fraction(ts1,ms1);
	}
	public Fraction reducer(){
		 int ts1 = this.ts;
		 int ms1 = this.ms;
		 int temp1 = ts1;
		 int temp2 = ms1;
		 while(ts1 != ms1){
			 if(ts1>ms1){
				 ts1 = ts1 - ms1;
			 }
			 else{
				 ms1 = ms1 - ts1;
			 }
				 
		 }
		 int ts2 = temp1/ts1;
		 int ms2 = temp2/ts1;
		 return new Fraction(ts2,ms2);
		 
	}
	@Override
	public String toString(){
		return  "tu so: "+this.ts+" mau so: "+this.ms;
	}
}