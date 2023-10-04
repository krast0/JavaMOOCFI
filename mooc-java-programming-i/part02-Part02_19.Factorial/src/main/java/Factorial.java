
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number: ");
        int userInput = scanner.nextInt();
        if(userInput == 0){
            System.out.println("Factorial: 1");
            return;
        }

        int factorial = 0;
        for (int i = 0; i < userInput; i++) {
            if(i == 0){
                factorial = 1;
            }
            int n = i * factorial;
            factorial += n;


        }
        System.out.println("Factorial: " + factorial);
    }
}
