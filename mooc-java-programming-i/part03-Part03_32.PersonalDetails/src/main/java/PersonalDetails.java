
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String userInput = scanner.nextLine();

            if(userInput.equals("")){
                break;
            }

            list.add(userInput);


        }
        System.out.println("Longest Name: " + findLongest(list));
        System.out.println("Average of the birth years: " + findAverageOfYears(list));




    }
    public static String findLongest(ArrayList<String> list){
        int numberOfCharsInName = 0;
        String name = null;
        for (String n :
                list) {
            String arr[] = n.split(",");
            if(numberOfCharsInName < arr[0].length()){
                numberOfCharsInName = arr[0].length();
                name = arr[0];
            }
        }
        return name;
    }

    public static double findAverageOfYears(ArrayList<String> list){
        double sum = 0;
        int count = 0;
        for (String n :
                list) {
            count++;
            String arr[] = n.split(",");
            sum += Integer.parseInt(arr[1]);
        }
        return sum / count;
    }
}
