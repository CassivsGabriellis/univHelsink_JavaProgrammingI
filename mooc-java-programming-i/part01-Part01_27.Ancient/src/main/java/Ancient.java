
import java.util.Scanner;

public class Ancient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a number:");
        int number = Integer.valueOf(scan.nextLine());
        if (number < 2015) {
            System.out.println("Ancient history!");
        } else {
            System.out.println("A year, indeed.");
        }
    }
}
