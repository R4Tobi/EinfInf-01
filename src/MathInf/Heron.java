package MathInf;

public class Heron {
    public static double heronSquareRoot(double radikand, double genauigkeit){
        double x = 1;
        while (Math.abs(x*x - radikand) > genauigkeit) {
            x = (x + radikand / x) / 2;
        }
        return x;
    }

    public static double heronCubicRoot(double radikand, double genauigkeit){
        double x = 1;
        while (Math.abs(x*x*x - radikand) > genauigkeit){
            x = (2.0 * x + radikand / (x * x)) / 3.0;
        }
        return x;
    }
}
