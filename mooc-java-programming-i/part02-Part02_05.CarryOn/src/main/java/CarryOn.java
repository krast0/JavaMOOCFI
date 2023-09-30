
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Shall we carry on?");
        while(true){
            String userinput = scanner.nextLine();
            if(userinput.equals("no")){
                break;
            }else{
                System.out.println("Shall we carry on?");
            }
        }
    }
}
