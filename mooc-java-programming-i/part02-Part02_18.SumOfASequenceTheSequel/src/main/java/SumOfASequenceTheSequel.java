
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        int sum = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("First number?");
        int userInputFrom = scanner.nextInt();
        System.out.println("Last number?");
        int userInputTo = scanner.nextInt();

        for (int i = userInputFrom; i <= userInputTo; i++) {
            sum += i;
        }
        System.out.println("The sum is: " + sum);
    }
}
