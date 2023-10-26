package MathInf;

import java.util.Date;

public class Heron {
    public static double heronSquareRoot(double radikand, double genauigkeit){
        if(radikand <= 0 || genauigkeit < 0){
            throw new IllegalArgumentException("Argumente dürfen nicht negativ sein.");
        }
        double x = 1;
        while (Math.abs(x*x - radikand) > genauigkeit) {
            x = (x + radikand / x) / 2;
        }
        return x;
    }

    public static double heronCubicRoot(double radikand, double genauigkeit){
        if(radikand <= 0 || genauigkeit < 0){
            throw new IllegalArgumentException("Argumente dürfen nicht negativ sein.");
        }
        double x = 1;
        while (Math.abs(x*x*x - radikand) > genauigkeit){
            x = (2.0 * x + radikand / (x * x)) / 3.0;
        }
        return x;
    }

    public static void main(String[] args){
        System.out.println(heronCubicRoot(27.0, 0.0000000000001));
    }
}
