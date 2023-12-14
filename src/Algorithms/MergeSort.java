package Algorithms;

public class MergeSort {
    //-----------------------------------------------------------------//
    // Hilfsmethoden fuer rekursives Sortieren durch Verschmelzen
    private static void _mergeSort(int[] a, int[] copy, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            _mergeSort(a, copy, start, mid);
            _mergeSort(a, copy, mid + 1, end);
            merge(a, copy, start, mid, end);
        }
    }

    //-----------------------------------------------------------------//
    private static void merge(int[] a, int[] copy, int start, int mid, int end) {
        int i = 0;
        int j = start;
        int k = start;
        while (j <= mid) {
            copy[i++] = a[j++];
        }

        i = 0;
        while (k < j && j <= end) {
            if (copy[i] <= a[j]) {
                a[k++] = copy[i++];
            } else {
                a[k++] = a[j++];
            }
        }

        while (k < j) {
            a[k++] = copy[i++];
        }
    }

    //-----------------------------------------------------------------//
    public static  void mergeSort(int[] a) {
        _mergeSort(a, new int[a.length], 0, a.length - 1);
    }
}
