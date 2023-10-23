package MathInf;

import java.util.Arrays;

public class MedianOfThree {
    public static int median(int a, int b, int c){
        int[] all = {a, b, c};
        int highest = all[0];
        int lowest = all[0];

        for(int number : all){
            if(number >= highest){
                highest = number;
            }
            if(number <= lowest){
                lowest = number;
            }

            if(a == b  && b == c){
                return a;
            }
            if(a == b) {
                return a;
            }
            if(a == c){
                return a;
            }
            if(b == c){
                return b;
            }
        }
        int result = 0;
        for(int number : all){
            if(number != highest && number != lowest){
                result = (number);
            }
        }
        return result;
    }

    public static int median2(int a, int b, int c){
        int[] all = {a, b, c};
        Arrays.sort(all);
        return all[1];// die zwei resultiert aus x * ((n+1) / 2)
    }

    public static void main(String[] args){
        int a = 1;
        int b = 2;
        int c = 1;
        //teste ob beide mediane gleich sind
        if(median(a,b,c) == median2(a,b,c)){
            System.out.println("Test erfolgreich.");
        }else{
            System.out.println("Test nicht erfolgreich.");
        }
        System.out.println(median(a,b,c));
        System.out.println(median2(a,b,c));
    }
}
