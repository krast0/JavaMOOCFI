import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true){

            System.out.println("Title: ");
            String inputTitle = scanner.nextLine();
            if(inputTitle.equals("")){
                break;
            }
            System.out.println("Pages: ");
            int inputPages = Integer.parseInt(scanner.nextLine());

            System.out.println("Publication year: ");
            int publicationYearInput = Integer.parseInt(scanner.nextLine());

            books.add(new Book(inputTitle,inputPages,publicationYearInput));
        }

        System.out.println("What information will be printed? ");
        String whatToBePrintedInput = scanner.nextLine();

        switch (whatToBePrintedInput){
            case "everything": {
                for (Book book :
                        books) {
                    System.out.println(book.getTitle() + ", " + book.getPages() + " pages, " + book.getPublicationYear());
                }
            }
            case "name": {
                for (Book book :
                        books) {
                    System.out.println(book.getTitle());
                }
            }
        }

    }
}
