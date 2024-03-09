//Write a method called numberToWords with one int parameter named number.
//
//The method should print out the passed number using words for the digits.
//
//If the number is negative, print "Invalid Value".
public class NumberToWords {
    public static int getDigitCount (int number){
        int digits = 0;
        if (number < 0){
            return -1;
        }
        if (number == 0){
            return 1;
        }
        while(number > 0){
            if ( number % 10 == 0 || number % 10 != 0){
                digits++;

            }
            number = number /10;
        }
        return digits;
    }
    public static int reverse (int number){

        int digit = 0;
        int revnum = 0;
        while (number != 0){
            digit = number % 10;
            revnum = revnum * 10 + digit;
            number = number / 10;
        }
        return revnum;

    }
    public static void numberToWords (int number){
        if(number < 0){
            System.out.println("Invalid Value");
        }
        int revnum = reverse(number);
        int zercount = getDigitCount(number) - getDigitCount(revnum);
        int digit = 0;
        if (number == 0){
            System.out.println("Zero");
        }

        while (revnum > 0){
            digit = revnum % 10;
            switch (digit){
                case 0 -> System.out.println("Zero");
                case 1 -> System.out.println("One");
                case 2 -> System.out.println("Two");
                case 3 -> System.out.println("Three");
                case 4 -> System.out.println("Four");
                case 5 -> System.out.println("Five");
                case 6 -> System.out.println("Six");
                case 7 -> System.out.println("Seven");
                case 8 -> System.out.println("Eight");
                case 9 -> System.out.println("Nine");

            }
            revnum = revnum / 10;


        }
        for (int i = 0; i < zercount; i++){
            System.out.println("Zero");
        }

    }
}
