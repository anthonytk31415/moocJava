
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

//      read the file
        ArrayList<String> list = new ArrayList<>();
        try (Scanner scanner1 = new Scanner(Paths.get(file))){
            while (scanner1.hasNextLine()){
                String row = scanner1.nextLine();
                list.add(row);
            }
                    
        } catch (Exception e){ 
            System.out.println("Reading the file " + file + " failed.");            
        }
//        Verify searchedFor
        if (list.contains(searchedFor)){
            System.out.println("Found!");
        } else {
            System.out.println("Not found.");
        }
        
    }
}
