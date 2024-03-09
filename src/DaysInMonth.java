//Write a method isLeapYear with a parameter of type int named year.
//Write another method getDaysInMonth with two parameters month and year. Both of type int.
//This method needs to return the number of days in the month. Be careful about leap years they have 29 days in month 2 (February).
//If parameter month is < 1 or > 12 return -1. 
//
//If parameter year is < 1 or > 9999 then return -1.
public class DaysInMonth {
    public static boolean isLeapYear( int year){
        if (year <= 1 || year >= 9999){
            return false;
        }
        else if(year % 4 != 0) {
            return false;
        }
        else if ((year % 4 == 0)&&(year % 100 != 0)){
            return true;
        }
        else if (year % 400 != 0){
            return false;

        }
        else {
            return true;
        }

    }
    public static int getDaysInMonth (int month, int year){
        if(year < 1 || year > 9_999){
            return -1;
        }
        return switch (month) {
            case 1,3,5,7,8,10,12 -> 31;
            case 2 -> isLeapYear(year) ? 29 : 28;
            case 4,6,9,11 -> 30;
            default -> -1;

        };
    }
}
