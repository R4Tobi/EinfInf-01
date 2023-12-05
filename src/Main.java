import Algorithms.BinarySearch;
import Algorithms.TernarySearch;
import MathInf.*;
import OOP.GluehWein;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
        GluehWein G1 = new GluehWein(true,0.5F, "rot");
        GluehWein G2 = new GluehWein(false,0.25F, "eierlikör");
        GluehWein G3 = new GluehWein(true, 0.5F, "weiß");
        GluehWein G4 = new GluehWein(false, 0.25F, "rot");

        System.out.println(G1.getPrice());
        System.out.println(G2.getPrice());
        System.out.println(G3.getPrice());
        System.out.println(G4.getPrice());

        GluehWein[] GArr = new GluehWein[]{G1, G2, G3, G4};
        System.out.println(Arrays.toString(GArr));
        Arrays.sort(GArr);
        System.out.println(Arrays.toString(GArr));

        */
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50};
        Algorithms.BinarySearch.binarySearchRecursive(arr,3);
        Algorithms.TernarySearch.ternarySearch(arr, 3);
        System.out.println("Counter BinarySearch:" + BinarySearch.counter);
        System.out.println("Comparisons BinarySearch:" + BinarySearch.comparisons);
        System.out.println("Counter TernarySearch:" + TernarySearch.counter);
        System.out.println("Comparisons TernarySearch:" + TernarySearch.comparisons);
    }
}