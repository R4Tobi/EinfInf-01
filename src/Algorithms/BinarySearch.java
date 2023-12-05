package Algorithms;

public class BinarySearch {

    public static int counter = 0;
    public static int comparisons = 0;
    public static int binarySearchRecursive(int[] sortedArray, int key) {
        return _binarySearchRecursive(sortedArray, key, 0, sortedArray.length - 1);
    }

    private static int _binarySearchRecursive(int[] sortedArray, int key, int low, int high){
        counter++;
        int middle = low  + ((high - low) / 2);

        if (high < low) {
            comparisons++;
            return -1;
        }

        if (key == sortedArray[middle]) {
            comparisons++;
            return middle;
        } else if (key < sortedArray[middle]) {
            comparisons++;
            return _binarySearchRecursive(sortedArray, key, low, middle - 1);
        } else {
            return _binarySearchRecursive(sortedArray, key, middle + 1, high);
        }
    }
    public int binarySearchIterative(int[] sortedArray, int key) {
        int index = Integer.MAX_VALUE;
        int low = 0;
        int high = sortedArray.length - 1;

        while (low <= high) {
            int mid = low  + ((high - low) / 2);
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }
}
