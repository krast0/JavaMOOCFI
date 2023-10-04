
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        // implement here a program that reads user input
        while(true) {

            int userInput = scanner.nextInt();
            // until the user enters 9999
            if(userInput == 9999){
                break;
            }

            list.add(userInput);


        }
        int smallestNumber = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if(smallestNumber > list.get(i)){
                smallestNumber = list.get(i);
            }
        }
        System.out.println("Smallest number: " + smallestNumber);

        for (int i = 0; i < list.size(); i++) {
            if(smallestNumber == list.get(i)){
                System.out.println("Found at index: " + i);
            }
        }
        
    }
}
