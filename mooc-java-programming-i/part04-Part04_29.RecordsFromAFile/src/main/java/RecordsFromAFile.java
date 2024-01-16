
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file: ");
        String file = scanner.nextLine();
        
        
//        ArrayList<String> names = new ArrayList<>();
//        ArrayList<Integer> nums = new ArrayList<>();
        
        try (Scanner scanner1 = new Scanner(Paths.get(file))){
            while (scanner1.hasNextLine()){
                String row = scanner1.nextLine();
                
                String[] parts = row.split(",");
                if (parts[1].equals("1")) {
                    System.out.println(parts[0] + ", age: " + parts[1] +" year");
                } else {
                    System.out.println(parts[0] + ", age: " + parts[1] +" years");
                }
                

            }
                    
        } catch (Exception e){ 
            System.out.println("Reading the file " + file + " failed.");            
        }
        
        
    }
}
