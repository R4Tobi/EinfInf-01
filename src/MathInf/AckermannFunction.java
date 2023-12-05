package MathInf;

import java.math.BigInteger;

/**
 * Klasse, die die Ackermann-Funktion in Java integriert. (mithilfe von BigInteger)
 */
public class AckermannFunction {
    /**
     * Definition der Ackermann funktion als Rekursive Methode
     * @param x Zahl x
     * @param y Zahl Y
     * @return Funktionswert der Ackermann Funktion
     */
    public static BigInteger ackermann(BigInteger x, BigInteger y){
        //Basisfall, y = 0
        if (y.equals(BigInteger.ZERO)) {
            return BigInteger.ZERO;
        //Wenn x= 0 ist, wird 2*y zurückgegeben
        } else if (x.equals(BigInteger.ZERO)) {
            return y.add(y);
        //Wenn y 1 ist, gebe 2 zurück (1+1)
        } else if (y.equals(BigInteger.ONE)) {
            return BigInteger.ONE.add(BigInteger.ONE);
        //rekursiver Fall
        } else {
            return(ackermann(x.subtract(BigInteger.ONE),ackermann( x, y.subtract(BigInteger.ONE))));
        }
    }

    /**
     * Testrahmen der Ackermann-Funktion
     * @param args werden ignoriert
     */
    public static void main(String[] args) {
        // Beispielaufruf der Ackermann-Funktion
        BigInteger result = ackermann(BigInteger.valueOf(3), BigInteger.valueOf(3));
        //1,10=1024
        //2,4=65536
        //3,3= 65536
        System.out.println("Ergebnis der Ackermann-Funktion: " + result);

        // 3.
        // Ackermann-Funktion wurde speziell dafür entwickelt sehr schnell sehr groß zu werden um die Leistung von Computern zu testen
    }
}
