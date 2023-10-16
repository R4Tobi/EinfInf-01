import static MathInf.Heron.heronCubicRoot;
import static MathInf.Heron.heronSquareRoot;

import MathInf.HappyNumbers;
import MathInf.HappyNumbers.*;

public class Main {
    public static void main(String[] args) {
        // Heron Square Root
        System.out.println(heronSquareRoot(81, 0.00000000001));
        // Heron Cubic Root
        System.out.println(heronCubicRoot(27, 0.000000000001));

        //Happy Numbers
        System.out.println(HappyNumbers.isHappy(20));
        System.out.println(HappyNumbers.nextHappyNumber(1234));
    }
}