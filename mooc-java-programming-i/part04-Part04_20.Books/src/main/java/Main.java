import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them

        ArrayList<Book> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true){
            String checkValue = String.valueOf(scanner.nextLine());
            if (!checkValue.isEmpty()){
                String fname = checkValue;
                int pages = Integer.valueOf(scanner.nextLine());
                int year = Integer.valueOf(scanner.nextLine());
                Book book = new Book(fname, pages, year);
                programs.add(book);
                System.out.println(book.getTitle() + book);
            }
            else {
                break;
            }
        }
//        System.out.println(programs);
        System.out.println("What information will be printed? ");
        String infoType = String.valueOf(scanner.nextLine());
        
        for (Book book : programs){
            if (infoType.equals("everything")){
                System.out.println(book);
            } else if (infoType.equals("name")){
                System.out.println(book.getTitle());
            }
        }
    }
}
