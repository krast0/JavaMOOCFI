
import java.util.Scanner;

public class NumberOfNegativeNumbers {

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
            }else if (userInput < 0){
                sum += 1;
                continue;
            }

        }
        System.out.println("Number of negative numbers: " + sum);
    }
}
