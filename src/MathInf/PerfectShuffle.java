package MathInf;

import java.util.Arrays;

public class PerfectShuffle {
    public static void main(String[] args){
        System.out.println(shuffleNumber(52));
    }
    public static int[] interleave(int[] firstStaple, int[] secondStaple){
        if(firstStaple.length != secondStaple.length){
            throw new IllegalArgumentException("Arguments must be the same length.");
        }
        int iterations = firstStaple.length * 2;
        int[] shuffled = new int[iterations];
        for(int index = 0; index < iterations; index++){
            if(index % 2 == 0){
                shuffled[index] = firstStaple[index/2];
            }
            if(index % 2 != 0){
                shuffled[index] = secondStaple[index/2];
            }
        }
        return shuffled;
    }

    public static int[] perfectShuffle(int[] staple){
        if(staple.length % 2 != 0){
            //throw new IllegalArgumentException("Length of Argument must be even.");
            return staple;
        }
        int[] firstStaple = new int[(staple.length)/2];
        int[] secondStaple = new int[(staple.length)/2];
        int length = staple.length / 2;

        for(int index = 0; index < length; index++){
            firstStaple[index] = staple[index];
        }

        for(int index = length; index < length*2; index++){
            secondStaple[index - length] = staple[index];
        }
        return interleave(firstStaple, secondStaple);
    }

    public static int shuffleNumber(int n){
        //Kontrolle, on n kleiner oder gleich null und gerade ist.
        if (n <= 0 || n % 2 != 0) {
            return -1;
        }
        //Erstellen eines Arrays der Länge n
        int[] staple = new int[n];
        for (int index = 0; index < n; index++) {
            staple[index] = index;
        }

        //Erstellen einer Kopie des Arrays
        int[] stableCopy = Arrays.copyOf(staple, n);
        int index = 0;

        //Array so lange shufflen, bis er dem original entspricht
        do {
            stableCopy = perfectShuffle(stableCopy);
            index++;
        } while (!Arrays.equals(stableCopy, staple));

        return index;
    }
}
