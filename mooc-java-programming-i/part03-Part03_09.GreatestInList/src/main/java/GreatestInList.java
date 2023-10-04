
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        int biggestNumber = getBiggestNumber(list);
        System.out.println("The greatest number: " + biggestNumber);

        // implement finding the greatest number in the list here

    }
    public static int getBiggestNumber(ArrayList<Integer> list){
        int biggestNumber = list.get(0);
        for (int n:
             list) {
            if(biggestNumber < n){
                biggestNumber = n;
            }
        }
        return biggestNumber;
    }
}
