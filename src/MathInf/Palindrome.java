package MathInf;

public class Palindrome {
    public static int numDigits(int n){
        int counter = 0;
        while(n != 0){
            n /= 10;
            counter++;
        }
        return counter;
    }

    public static int getDigit(int n, int index){
        int[] digits = new int[numDigits(n)];

        int i = 0;
        while(i <= index){
            digits[i] = n % 10;
            n /= 10;
            i++;
        }
        return digits[index];
    }
    public static boolean isPalindrome(int n){
        int length = (numDigits(n) - 1);
        for (int index = 0; index <= length; index++){
            if(getDigit(n, index) != getDigit(n, length - index)){
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(String string){
        String reversed = new StringBuilder(string).reverse().toString();
        return (string.equals(reversed));
    }

    public static void main(String[] args){
        System.out.println(isPalindrome(1234321));
        System.out.println(isPalindrome(1337));
        System.out.println(isPalindrome(1441));
        System.out.println(isPalindrome("1234321"));
        System.out.println(isPalindrome(7));

    }
}
