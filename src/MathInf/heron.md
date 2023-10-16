~~~
public class root {
    public static double hedonSquareRoot(double radikand, double genauigkeit){
        double x = 1.0;
        while (Math.abs(x*x - radikand) > genauigkeit) {
            x = (x + radikand / x) / 2.0;
        }
        return x;
    }

    public static double hedonCubicRoot(double radikand, double genauigkeit){
        double x = 1.0;
        while (Math.abs(x*x*x - radikand) > genauigkeit){
            x = (2.0 * x + radikand / (x * x)) / 3.0;
        }
        return x;
    }
}
~~~