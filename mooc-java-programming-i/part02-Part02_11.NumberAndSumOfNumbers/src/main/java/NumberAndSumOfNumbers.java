
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;
        while(true){

            System.out.println(
                    "Give a number:"
            );
            int userInput = Integer.parseInt(scanner.nextLine());

            if(userInput == 0){
                break;
            }

            sum += userInput;
            count += 1;

        }
        System.out.println("Number of numbers: " + count);
        System.out.println("Sum of the numbers: " + sum);

    }

}
