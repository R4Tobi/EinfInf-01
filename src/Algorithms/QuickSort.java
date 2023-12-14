package Algorithms;

public class QuickSort {
    /* [5,3,4,8,7,1,2]
    * letztes Element als Pivot Element, in dem Fall also 2
    * Die Elemente werden so umsortiert, dass Elemente kleiner als das Pivotelement links davon platziert werden und Elemente größer als das Pivotelement rechts davon platziert werden.
    * --> [1,2,5,3,4,8,7]
    * erneute rekursive Anwendung auf die Teilmengne, hier also [1] und [5,3,4,8,7]
    * in der rechten Teilmenge wird jetzt die 7 als Pivot element gewählt und erneut partitioniert
    * --> [[1],2,[3,4,[5],7,[8]]] --> [1,2,3,4,5,6,7,8]
    *
    *
    * */
    public static <T extends Comparable<T>> void quickSort(T[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private static <T extends Comparable<T>> void quickSort(T[] array, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(array, low, high);

            quickSort(array, low, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, high);
        }
    }

    private static <T extends Comparable<T>> int partition(T[] array, int low, int high) {
        T pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j].compareTo(pivot) <= 0) {
                i++;
                swap(array, i, j);
            }
        }

        swap(array, i + 1, high);

        return i + 1;
    }
    private static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
