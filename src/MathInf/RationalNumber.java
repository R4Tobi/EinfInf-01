package MathInf;

public class RationalNumber implements Comparable<RationalNumber>{
    //---------------------------------------------------------------------------//
    private int num = 0;
    private int denom = 1;

    //---------------------------------------------------------------------------//
    public RationalNumber(int n, int d) {
        if(d == 0){
            System.err.println("Can't divide be Zero.");
        }else{
            this.num = n;
            this.denom = d;
        }
        normalize();
    }

    //---------------------------------------------------------------------------//
    public int getNum() {
        return this.num;
    }

    //---------------------------------------------------------------------------//
    public int getDenom() {
        return this.denom;
    }

    //---------------------------------------------------------------------------//
    public void normalize() {
        //shorten
        int gcd = gcdRecursive(this.getNum(), this.getDenom());
        this.num /= gcd;
        this.denom /= gcd;

        //deal with pre
        if (this.getNum() > 0 && this.getDenom() < 0) {
            this.num = -this.getNum();
            this.denom = -this.getDenom();
        }
    }

    public int gcdRecursive(int a, int b){
        if (b == 0) {
            return a; // Der GCD ist a, wenn b gleich 0 ist
        } else {
            return gcdRecursive(b, a % b); // Andernfalls rufen Sie die Methode rekursiv mit (b, a % b) auf
        }
    }

    //---------------------------------------------------------------------------//
    @Override
    public int compareTo(RationalNumber n){
        return Double.compare((double) num / denom, (double) n.num / n.denom);
    }

    //---------------------------------------------------------------------------//
    public RationalNumber add(RationalNumber r) {
        return new RationalNumber(this.getDenom() * r.getNum() + this.getNum() * r.getDenom(), this.getDenom() * r.getDenom());
    }

    //---------------------------------------------------------------------------//
    public RationalNumber div(RationalNumber r) {
        return new RationalNumber(this.getNum() * r.getDenom(), this.getDenom() * r.getNum());
    }

    //---------------------------------------------------------------------------//
    public String toString() {
        return this.getNum() + "/" + this.getDenom();
    }

    //---------------------------------------------------------------------------//
    public static void main(String[] args) {
        RationalNumber test1 = new RationalNumber(3,4).add(new RationalNumber(2, 3));
        System.out.println(test1);
        RationalNumber test2 = new RationalNumber(32,3).div(new RationalNumber(1,2));
        System.out.println(test2);
        RationalNumber test3 = new RationalNumber(21, -14);
        System.out.println(test3);
    }
}
