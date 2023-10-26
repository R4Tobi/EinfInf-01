package MathInf;

import java.util.*;

public class HappyNumbers {
    public static boolean isHappy(int number){
        Set<Integer> seenNumbers = new HashSet<>();

        //Schleife solange ausführen bis 1 in den geprüften Zahlen ist und die geprüften Zahlen die zu prüfende Zahl enthält
        while (number != 1 && !seenNumbers.contains(number)) {
            seenNumbers.add(number); //geprüfte Zahl hinzufügen
            number = getNextNumber(number);
        }
        //Die nummer ist fröhlich wenn number am Ende der schleife 1 ist.
        return number == 1;
    }
    //Helper for isHappy()
    private static int getNextNumber(int n) {
        int sum = 0;
        //nächste Stelle von der nummer überprüfen und zurückgeben
        while (n > 0) {
            int digit = n % 10; //nächste Zahl
            sum += digit * digit; //potenz bilden
            n /= 10; //ganzzahldivision durch 10
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
