package MathInf;

import java.util.*;

public class HappyNumbers {
    public static boolean isHappy(int number){
        Set<Integer> seenNumbers = new HashSet<>();

        while (number != 1 && !seenNumbers.contains(number)) {
            seenNumbers.add(number);
            number = getNextNumber(number);
        }

        return number == 1;
    }
    //Helper for isHappy()
    private static int getNextNumber(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

    public static int nextHappyNumber(int startNumber) {
        int nextNumber = startNumber + 1;

        while (true) {
            if (isHappy(nextNumber)) {
                return nextNumber;
            }else{
                nextNumber++;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(HappyNumbers.isHappy(20)); //true
        System.out.println(HappyNumbers.isHappy(103)); //true
        System.out.println(HappyNumbers.isHappy(23)); //true
        System.out.println(HappyNumbers.isHappy(1247)); //true
        System.out.println(HappyNumbers.isHappy(36925)); //false
        System.out.println(HappyNumbers.isHappy(20)); //false
        System.out.println(HappyNumbers.nextHappyNumber(101)); //103
    }
}
