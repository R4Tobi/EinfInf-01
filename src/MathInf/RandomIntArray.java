package MathInf;

import java.util.Arrays;

public class RandomIntArray {
    public static int[] createRandom(int n){
        int[] array = new int[n];
        int index = 0;
        while(index < n){
            array[index] = (int)(Math.random()*94) + 5;
            index++;
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static String toString(int[] a){
        return Arrays.toString(a);
    }

    public static int posMin(int[] a){
        int resultPos = 0;
        int lowest = a[0];
        for(int index = 0; index < a.length; index++){
            if(a[index] < lowest){
                lowest = a[index];
                resultPos = index;
            }
        }
        return resultPos;
    }

    public static void swap(int[] a){
        int first = a[0];
        int last = a[a.length - 1];
        a[0] = last;
        a[a.length - 1] = first;
    }

    public static void main(String[] args){
        int[] a = createRandom(5);
        System.out.println(posMin(a));
        swap(a);
        System.out.println(toString(a));
    }
}
