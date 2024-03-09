//Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
//
//The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.


public class EqualThreeDecimal {
    public static void main(String[] args) {

    }
    public static boolean areEqualByThreeDecimalPlaces (double num1, double num2){
        // if( (long) (num1 * 1000) == (long) (num2 * 1000)){
        //     return true;
        // }
        // return false;

        long num1r = (long) ( num1 * 1000);
        long num2r = (long) ( num2 * 1000);
        return num1r == num2r;
    }

}
