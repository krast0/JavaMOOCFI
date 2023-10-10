
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("First name: ");
            String firstNameInput = scanner.nextLine();
            if (firstNameInput.equals("")){
                break;
            }
            System.out.println("Last name: ");

            String lastNameInput = scanner.nextLine();

            System.out.println("Identification number: ");
            String indentificationNumberInput = scanner.nextLine();

            infoCollection.add(new PersonalInformation(firstNameInput,lastNameInput,indentificationNumberInput));

        }
        for (PersonalInformation info :
                infoCollection) {
            System.out.println(info.getFirstName() + " " + info.getLastName());
        }

    }
}
