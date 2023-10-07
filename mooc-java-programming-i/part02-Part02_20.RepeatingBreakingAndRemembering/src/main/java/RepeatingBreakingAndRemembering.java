
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers:");

        int sumOfNumbers = 0;
        int countOfNumbers = 0;
        int oodNumbers = 0;
        int evenNumbers = 0;

        while(true) {
            int userInput = scanner.nextInt();

            if(userInput == -1){
                System.out.println("Thx! Bye!");
                break;
            }

            countOfNumbers++;
            sumOfNumbers += userInput;

            if(userInput % 2 == 0){
                evenNumbers++;
            }else{
                oodNumbers++;
            }
        }

        double avarageOfNumbers = (double) sumOfNumbers / countOfNumbers;

        System.out.println("Sum:" + sumOfNumbers);
        System.out.println("Numbers: " + countOfNumbers);
        System.out.println("Average:" + avarageOfNumbers);
        System.out.println("Even:" + evenNumbers);
        System.out.println("Odd:" + oodNumbers);









    }
}
