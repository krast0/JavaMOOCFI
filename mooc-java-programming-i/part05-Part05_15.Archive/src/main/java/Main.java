
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> itemsList = new ArrayList<>();



        while(true){
            System.out.println("Identifier? (empty will stop)");
            String indentifierInput = scanner.nextLine();
            if(indentifierInput.equals("")){
                break;
            }
            System.out.println("Name? (empty will stop)");
            String nameInput = scanner.nextLine();
            if(nameInput.equals("")){
                break;
            }
            Item itemToBeAdded = new Item(indentifierInput,nameInput);
            if(!(itemsList.contains(itemToBeAdded))) {
                itemsList.add(itemToBeAdded);
            }


        }

        for (int i = 0; i < itemsList.size(); i++) {
            Item currentItem = itemsList.get(i);

            System.out.println(currentItem.getId() + ": " + currentItem.getName());

        }

    }
}
