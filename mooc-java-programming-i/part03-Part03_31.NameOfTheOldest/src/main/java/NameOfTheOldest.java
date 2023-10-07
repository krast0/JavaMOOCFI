
import java.util.ArrayList;
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        while(true){
            String userInput = scanner.nextLine();
            if(userInput.equals("")){
                break;
            }
            list.add(userInput);
        }
        System.out.println("Name of the oldest: " + nameOfOldest(list));
    }

    public static String nameOfOldest(ArrayList<String> list){
        int age = 0;
        String name = null;
        for (String nameAndAge :
                list) {
            String newArr[] = nameAndAge.split(",");
            if(Integer.parseInt(newArr[1]) > age){
                age = Integer.parseInt(newArr[1]);
                name = newArr[0];
            }

        }
        return name;
    }
}
