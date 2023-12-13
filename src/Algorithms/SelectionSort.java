package Algorithms;

public class SelectionSort{
    public static void sort (int [] a ) {
        int n = a . length ;
        for ( int i =0; i <n -1;++ i ) { // (3)
            int imin = i ;
            for ( int j = i +1; j < n ;++ j ) // (1)
                if ( a [ j ] < a [ imin ])
                    imin = j ;
            int t = a [ imin ]; a [ imin ]= a [ i ]; a [ i ]= t ; // (2)
        }
    }

    public static <T extends Comparable<T>> void sort(T[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j].compareTo(array[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            T temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

}
