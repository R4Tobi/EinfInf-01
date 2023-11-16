package MathInf;

import java.math.BigInteger;

public class BigIntegerFibonacci {
    public static void main(String[] args) {
        System.out.println("Fibonacci-Zahlen:");
        int n = 5;
        BigInteger[] fib = new BigInteger[n];
        for (int i = 0; i <= n; i++) {
            BigInteger result = fib1(i);
            System.out.println("rFibonacci(" + i + ") = " + result);
        }
        for (int i = 0; i <= n; i++) {
            BigInteger result = fib2(i);
            System.out.println("iFibonacci(" + i + ") = " + result);
        }
        System.out.println("Iterativ: " + iterative); // Bei n=23 rek. 150025 Aufrufe, iter. 231 Wiederholungen
        System.out.println("Rekursiv: " + recursive);
        System.out.println("--------------");
        System.out.println(fib1(5));
        System.out.println(fib2(7));
    }

    private static int iterative = 0;
    private static int recursive = 0;

    public static BigInteger fib1(int n) {
        recursive++;
        // Basisfälle
        if (n == 0) {
            return BigInteger.ONE;
        } else if (n == 1) {
            return BigInteger.ONE;
            // Rekursiver Aufruf: Fibonacci(n-2) + Fibonacci(n-1)
        } else {
            return fib1(n - 2).add(fib1(n - 1));
        }
    }

    public static BigInteger fib2(int n) {
        if (n == 0) {
            return BigInteger.ONE;
        } else if (n == 1) {
            return BigInteger.ONE;
        } else {
            BigInteger[] fibArray = new BigInteger[n + 1];
            fibArray[0] = BigInteger.ONE;
            fibArray[1] = BigInteger.ONE;

            for (int i = 2; i <= n; i++) {
                iterative++;
                // Fibonacci(i) = Fibonacci(i-1) + Fibonacci(i-2)
                fibArray[i] = fibArray[i - 1].add(fibArray[i - 2]);
            }

            return fibArray[n];
        }
    }
}
