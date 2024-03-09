public class Palindrome {
    public static boolean isPalindrome (int number){
        int reverse = 0;
        int lastDigit = 0;
        int copy = number;

        while ( copy != 0){
            lastDigit = copy % 10;
            reverse = (reverse * 10) + lastDigit;

            copy = copy / 10;
        }
        return reverse == number;

    }
}
