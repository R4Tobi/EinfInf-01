package MathInf;

public class Polynomial {
    private final int degree; // highest power of x
    private final double[] coeffs; // Array with coefficients, all coefficients [0..degree] are necessary

    public Polynomial(double[] c) {
        this.coeffs = c;
        int i = 1;
        while(true){
            if(c[c.length - i] == 0){
                i++;
            }else{
                break;
            }
        }
        this.degree = c.length - i;
    }

    public int getDegree(){
        return this.degree;
    }

    public double[] getAllCoefficients(){
        return this.coeffs;
    }

    public double getCoefficient(int i){
        return this.coeffs[i];
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        double[] coeffs = this.getAllCoefficients();
        for (int i = 0; i <= this.getDegree(); i++) {
            //Zero as coefficient is completely ignored
            if (coeffs[i] != 0) {
                //checks and appends the first coefficient
                if (!result.isEmpty())/*if sth is already appended to the result the right opaeration is added to the String*/ {
                    result.append(coeffs[i] > 0 ? " + " : " - ");
                } else if (coeffs[i] < 0) /*if the first coefficient is smaller 0 append "-" before it, or nothing*/{
                    result.append("-");
                }
                //append the coefficient to the String, but just the abs, because the operation is already added by the if before
                //for coefficient 1 and i 0 the coefficient is not added to the string
                if (Math.abs(coeffs[i]) != 1 || i == 0) {
                    result.append(Math.abs(coeffs[i]));
                }
                //for exponents over 0 append x and for over one append the exponent as well
                if (i > 0) {
                    result.append("x");
                    if (i > 1) {
                        result.append("^").append(i);
                    }
                }
            }
        }
        return result.toString();
    }

    public double evaluate(double x) {
        //call the horner function we already defined earlier
        //return HornerSchema.evalHorner(this.coeffs, x);

        //copy and pasted
        int n = this.getDegree();
        double[] coeffs = this.getAllCoefficients();
        double result = 0.0;

        // Iterate backwards over the coefficients and apply Horner's scheme
        for (int i = n ; i >= 0; i--) {
            result = result * x + coeffs[i];
        }
        return result;
    }

    public Polynomial differentiate() {
        //create a new shortened array of coefficients
        double[] derivativeCoeffs = new double[degree];
        //multiply each coefficient with its exponent and remove the first entry, which hasn't an exponent (constants are removed)
        for (int i = degree - 1; i >= 0; i--) {
            derivativeCoeffs[i] = (i + 1) * coeffs[i + 1];
        }
        //return a new Polynomial Object with the new coefficients
        return new Polynomial(derivativeCoeffs);
    }

    public static void main(String[] args) {
        Polynomial p = new Polynomial(new double[]{3,-8,0,0,0,7,0,0,0});
        System.out.println(p);
        System.out.println(p.getDegree());
    }
}
