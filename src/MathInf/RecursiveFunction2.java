package MathInf;

import java.util.Arrays;

public class RecursiveFunction2 {
    public static int marge(int n){
        if(n == 0){
            return 1;
        }else{
            return n - homer(marge(n - 1));
        }
    }

    public static int homer(int n){
        if(n == 0){
            return 0;
        }else{
            return n - marge(homer(n - 1));
        }
    }

    public static boolean dispute(int n){
        if(n < 0){
            return false;
        }else{
            return marge(n) != homer(n);
        }
    }

    public static int[] differenceDisputes(int x){
        int[] differences = new int[x + 1];
        int index = 0;
        int i = 0;

        // abstand der jahre bestimmen zwischen denen homer und marge nicht streiten
        while (index < (x + 1)) {
            if (dispute(i)) {
                differences[index++] = i;
            }
            i++;
        }

        // differenzen erstellen
        int[] result = new int[x];
        for (int j = 0; j < x; j++) {
            result[j] = differences[j + 1] - differences[j];
        }

        return result;
    }
    public static void main(String[] args) {
        System.out.println("kupferne Hochzeit: " + dispute(7));
        System.out.println("silberne Hochzeit: " + dispute(25));
        //differenz wird immer größer => Verhältnis bessert sich
        System.out.println(Arrays.toString(differenceDisputes(11)));
    }
}