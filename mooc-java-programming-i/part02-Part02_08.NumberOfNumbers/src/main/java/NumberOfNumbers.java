
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while(true){
            System.out.println("Give a number:");
            int userInput = Integer.parseInt(scanner.nextLine());

            if(userInput == 0){
                break;
            }

            sum += 1;


        }

        System.out.println("Number of numbers: " + sum);
    }
}
