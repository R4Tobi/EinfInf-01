package MathInf;

import java.util.Arrays;

public class DifferentialPolynom {
    public static double[] diffPoly(double[] coeffs){
        int n = coeffs.length;

        if (n <= 1) {
            // Wenn das Polynom Grad 0 oder 1 hat, ist die Ableitung konstant 0
            return new double[]{};
        }

        double[] result = new double[n - 1];

        for (int i = 1; i < n; i++) {
            // Die Koeffizienten der Ableitung sind i * coeffs[i]
            result[i - 1] = i * coeffs[i];
        }

        return result;
    }

    public static void main(String[] args) {
        double[] coefficients = {7, 5, 3}; // Das Polynom 1 + 2x+ 3x^2
        System.out.println(Arrays.toString(diffPoly(coefficients)));
    }
}
