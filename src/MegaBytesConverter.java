import java.util.Scanner;

public class MegaBytesConverter {
//    Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type int with the name kiloBytes.
//    The method should not return anything (void) and it needs to calculate the megabytes and remaining kilobytes from the kilobytes parameter.
//    Then it needs to print a message in the format "XX KB = YY MB and ZZ KB".
//    XX represents the original value kiloBytes.
//    YY represents the calculated megabytes.
//    ZZ represents the calculated remaining kilobytes.
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int KB = input.nextInt();
    printMegaBytesAndKiloBytes(KB);
}

    public static void printMegaBytesAndKiloBytes ( int kiloBytes){
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
            return;
        }

        long megabytes =(long) kiloBytes / 1024;
        long remkilobytes = kiloBytes % 1024;
        System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + remkilobytes + " KB");
    }
}
