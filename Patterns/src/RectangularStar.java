         /*
****
****
****
****
         */
import java.util.Scanner;

public class RectangularStar {

    public static void Pattern() {
        System.out.print("Enter input N: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");

            }
            System.out.println();

        }


    }

    public static void main(String[] args) {
        Pattern();

    }
}
