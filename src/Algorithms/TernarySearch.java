package Algorithms;

public class TernarySearch {
    public static int counter = 0;
    public static int comparisons = 0;
    public static int ternaryRec(int[] a, int key){
        return _ternarySearch(0, a.length - 1, key, a);
    }
    public static int ternarySearch(int[] a, int key){
        return _ternarySearch(0, a.length - 1, key, a);
    }
    private static int _ternarySearch(int l, int r, int key, int[] arr){
        counter++;
        if (r >= l) {
            comparisons++;
            // Find the mid1 and mid2 [1,...,|,...,|,...,n]
            int mid1 = l + (r - l) / 3; //left mid
            int mid2 = r - (r - l) / 3; // right mid

            // Check if key is present at any mid (best case)
            if (arr[mid1] == key) {
                comparisons++;
                return mid1;
            }
            if (arr[mid2] == key) {
                comparisons++;
                return mid2;
            }

            // if key is not present at mid, check in which region it is present,then repeat the Search operation in that region

            // The key is between l and mid1
            if (key < arr[mid1]) {
                comparisons++;
                return _ternarySearch(l, mid1 - 1, key, arr);
            }
            // The key is between mid2 and r
            else if (key > arr[mid2]) {
                comparisons++;
                return _ternarySearch(mid2 + 1, r, key, arr);
            } /* The key is between mid1 and mid2*/
            else {
                return _ternarySearch(mid1 + 1, mid2 - 1, key, arr);
            }
        }
        // Key not found
        return -1;
    }

}
