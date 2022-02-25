public class Fraction{
    private int numer;
    private int denom;
    
    public Fraction(){
        this.numer = 0;
        this.denom = 1;
    }
    
    public Fraction(int x, int y){
        this.numer = x;
        this.denom = y;
    }
    
    public Fraction(Fraction another){
        this.numer = another.numer;
        this.denom = another.denom;
    }
    
    public String toString(){
        return this.numer + "/" + this.denom;
    }
    
    public void setNumer(int numer){
        this.numer = numer;
    }
    
    public void setDenom(int denom){
        this.denom = denom;
    }
    
    private int gcd(int a, int b){
        while(a != b){
            if(a > b)
                a = a - b;
            else
                b = b - a;
        }
        return a;
    }
    
    private void simplify(){
        int ucln = gcd(numer,denom);
        setNumer(numer/ucln);
        setDenom(denom/ucln);
    }
    
    public boolean equals(Object f){
        if(f instanceof Fraction){
            Fraction temp = (Fraction) f;
            this.simplify();
            temp.simplify();
            return (this.numer == temp.numer && this.denom == temp.denom);
        }
        return false;
    }
    
}