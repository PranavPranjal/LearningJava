//Write a method named printSquareStar with one parameter of type int named number.
//
//If number is < 5, the method should print "Invalid Value".
//
//The method should print diagonals to generate a rectangular pattern composed of stars (*). This should be accomplished by using loops
public class DiagonalStar {
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        for (int row = 1; row <= number; row++) {
            for (int column = 1; column <= number; column++) {
                if (row == 1 || row == number || column == 1 || column == number || row == column || column == (number - row + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
