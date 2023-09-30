
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
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
        double avarage = ((double) sum / count);
        System.out.println("Average of the numbers: " + avarage);

    }
}
