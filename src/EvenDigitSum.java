//Write a method named getEvenDigitSum with one parameter of type int called number.
//
//The method should return the sum of the even digits within the number.
//
//If the number is negative, the method should return -1 to indicate an invalid value.
public class EvenDigitSum {
    public static int getEvenDigitSum (int number){
        if (number < 0){
            return -1;
        }
        int sum = 0;
        int digit = 0;

        while (number > 0){
            digit = number % 10;
            if (digit % 2 == 0){
                sum = sum + digit;
            }
            number = number / 10;

        }

        return sum;

    }
}
