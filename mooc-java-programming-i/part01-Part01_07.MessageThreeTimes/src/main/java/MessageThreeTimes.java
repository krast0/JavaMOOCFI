
import java.util.Scanner;

public class MessageThreeTimes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");
        // Write your program here
        String massage = scanner.nextLine();
        System.out.println(massage);
        System.out.println(massage);
        System.out.println(massage);

    }
}
