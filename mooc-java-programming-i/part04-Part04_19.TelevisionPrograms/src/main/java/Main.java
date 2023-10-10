import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Name: ");
            String televisionProgramInput = scanner.nextLine();
            if(televisionProgramInput.equals("")){
                break;
            }
            System.out.println("Duration: ");
            int durationInput = Integer.parseInt(scanner.nextLine());

            programs.add(new TelevisionProgram(televisionProgramInput,durationInput));
        }

        System.out.println("Program's maximum duration?");
        int maxDuration = scanner.nextInt();
        for (TelevisionProgram program :
                programs) {
            if(maxDuration >= program.getDuration()){
                System.out.println(program.getName() + ", " + program.getDuration() + " minutes");
            }
        }


    }
}
