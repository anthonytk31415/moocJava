
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
    }
    
    public static void printValues(HashMap<String,Book> hashmap){
        for (String key : hashmap.keySet()){
            System.out.println(hashmap.get(key));
        }
         
    }
    
    public static void printValueIfNameContains(HashMap<String,Book> hashmap, String text){
        for (String key : hashmap.keySet()){
            String updatedName = hashmap.get(key).getName().toLowerCase(); 
            if (updatedName.contains(text)){
                System.out.println(hashmap.get(key));
            }
            
        }
    }

}
