
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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

        }
        System.out.println("Sum of the numbers: " + sum);
    }

}
