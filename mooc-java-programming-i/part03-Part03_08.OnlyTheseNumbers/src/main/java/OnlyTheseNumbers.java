
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }
        System.out.println("From where?");
        int fromIndex = scanner.nextInt();
        System.out.println("To where?");
        int toIndex = scanner.nextInt();

        for (int i = fromIndex; i <= toIndex; i++) {
            System.out.println(numbers.get(i));
        }
    }
}
