package MathInf;

/********************************************************
 Hier bitte Antwort zu Teil (1) als Kommentar einfuegen
 x=2, n=13
 2^13=2*2^(13-1)
 2^13=2^(12/2)*2^(12/2)
 2^13=2^(6/2)*2^(6/2)  *2*2
 2^13=2^(3-1)*2^(3-1)  *2*2*2*2*2
 2^13=2^(2/2)*2^(2/2)  *2*2*2*2*2*2*2*2
 2^13=2^(1-1)*2^(1-1)  *2*2*2*2*2*2*2*2*2*2*2
 2^13=1*1*2*2*2*2*2*2*2*2*2*2*2*2*2
 ********************************************************/
public class FastExponentiation {
    static int counterRec = 0;
    static int counterIter= 0;
    public static double fastPotRek(double x, int n){
        counterRec++;
        // Basisfall: x^0 = 1
        if (n == 0) {
            return 1;
        }
        if (n % 2 == 0) {
            // Wenn n gerade ist
            double temp = fastPotRek(x, n / 2);
            return temp * temp;
        } else {
            // Wenn n ungerade ist
            double temp = fastPotRek(x, (n - 1) / 2);
            return x * temp * temp;
        }
    }

    public static double fastPotIter(double x, int n){
        double result = 1.0;

        while (n > 0) {
            counterIter++;
            if (n % 2 == 1) {
                result *= x;
                n--;
            } else {
                x *= x;
                n /= 2;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(fastPotRek(2,25));
        System.out.println(fastPotIter(2, 25));
        System.out.println("Iterativ: " + counterIter);
        System.out.println("Rekursiv: " + counterRec);
    }
}