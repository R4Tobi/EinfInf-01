package MathInf;

public class NewtonRoot {
    public static double root(double radikand, int basis, double genauigkeit){
        if(radikand <= 0 || basis <= 0 || genauigkeit <= 0){
            throw new IllegalArgumentException("Argumente dürfen nicht negativ oder 0 sein.");
        }
        double result = 1;
        while(Math.abs(Math.pow(result, basis) - radikand) > genauigkeit){
            result = ((basis-1)*Math.pow(result,basis) + radikand)/(result*Math.pow(result, basis -1));
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(root(4,2,0.001));
    }
}
