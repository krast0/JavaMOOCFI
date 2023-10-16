
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        while(true){

            System.out.println(
                    "Give a number:"
            );
            int userInput = Integer.valueOf(scanner.nextLine());

            if(userInput == 0){
                break;
            }

            if(userInput > 0){
                sum += userInput;
                count += 1;
            }
        }
        if(count == 0){
            System.out.println("Cannot calculate the average");
            return;
        }

        System.out.println((double) sum / count);

    }
}
