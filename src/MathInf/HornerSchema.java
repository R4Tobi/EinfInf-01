package MathInf;

public class HornerSchema {
    // Methode zur Berechnung des Funktionswerts durch sukzessive Summation
    public static double evalSimple(double[] a, double x) {
        double result = 0.0;
        double term = 1.0;

        // Iteriere über alle Koeffizienten
        for (int i = 0; i < a.length; i++) {
            result += a[i] * term;
            term *= x;
        }

        return result;
    }

    //Gruppenarbeit mit Pranin evalHorner und evalHornerRec
    // Iterative method to calculate the function value using Horner's scheme
    public static double evalHorner(double[] a, double x) {
        int n = a.length;
        double result = 0.0;

        // Iterate backwards over the coefficients and apply Horner's scheme
        for (int i = n - 1; i >= 0; i--) {
            result = result * x + a[i];
        }
        return result;
    }

    // Methode zur Berechnung des Funktionswerts nach dem Horner-Schema
    public static double evalHornerRec(double[] a, double x) {
        int power= a.length-1; //highest power of the polynomial
        return hornerrec(a,x,power,0);
    }
    public static double hornerrec(double[] a, double x, int power,double result) {
        if(power==0){ //breaks recursion when the power is 0 (a0)
            return result*x+a[0];
        }
        return hornerrec(a,x,power-1,result*x+a[power]); //same as result = (result*x)+a[i]
    }

    /**    VERGLEICH horner/simple
     *  horner benötigt weniger multiplikationen
     *  in beiden müssen die koeffizienten sortiert werden
     */

    public static void main(String[] args) {
        // Beispielaufruf
        double[] coefficients = {1.93, 2.25, 3.134, 4.3, 9.51}; // Beispielkoeffizienten, müssen geordnet sein
        double x = 2.0; // Beispielvariable
        System.out.println("evalSimple: " + evalSimple(coefficients, x));
        System.out.println("evalHorner: " + evalHorner(coefficients, x));
        System.out.println("evalHornerRec: " + evalHornerRec(coefficients, x));
    }
}
