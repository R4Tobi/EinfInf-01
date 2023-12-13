package Algorithms;

public class InsertionSort {
    public static void sort (int [] a ) {
        int n = a . length ;
        for ( int i =1; i < n ;++ i ) {
            int x = a [ i ]; // insert x into (a0,...,ai−1)
            int j ;
            for ( j = i ;j >0 && a [j -1] > x ; --j )
                a [ j ]= a [j -1];
            a [ j ]= x ;
        }
    }

    public static <T extends Comparable<T>> void sort(T[] array) {
        int n = array.length;

        for (int i = 1; i < n; i++) {
            T key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j].compareTo(key) > 0) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }
}
