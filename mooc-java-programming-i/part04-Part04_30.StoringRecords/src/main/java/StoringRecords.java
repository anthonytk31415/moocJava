
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();
        
        try (Scanner scanner1 = new Scanner(Paths.get(file))){
            while (scanner1.hasNextLine()){
                String row = scanner1.nextLine();
                String[] parts = row.split(",");
                Person curPerson = new Person(parts[0], Integer.parseInt(parts[1])); 
                persons.add(curPerson);
            }
                    
        } catch (Exception e){ 
            System.out.println("Reading the file " + file + " failed.");            
        }
        
       
        
        // Write here the code for reading from file
        // and printing the read records
        return persons;

    }
}
