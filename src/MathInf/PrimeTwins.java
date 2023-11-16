package MathInf;

import java.util.Arrays;

public class PrimeTwins {
    public static void main(String[] args){
        System.out.println(Arrays.deepToString(primeTwins(8)));
    }

    public static int[][] primeTwins(int amount){
        int counter = 0;
        int index = 2;
        int[][] result = new int[amount][2];
        while (counter < amount){
            if(isPrime(index) && isPrime(index + 2)){
                result[counter][0] = index;
                result[counter][1] = index + 2;
                counter++;
            }
            index++;
        }
        return result;
    }

    public static boolean isPrime(int number){
        if(number <= 1) {
            return false;
        }

        if(number % 2 == 0){
            return false;
        }

        for(int i = 2;i < (number / 2); i++) {
            if((number % i)==0){
                return  false;
            }
        }
        return true;
    }
}
