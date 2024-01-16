
import java.util.Scanner;
import java.util.HashMap;

public class Login {

    public static void main(String[] args) {
        

        HashMap<String, String> userNames = new HashMap<>();
        userNames.put("alex", "sunshine");
        userNames.put("emma", "haskell");
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String userName = String.valueOf(scanner.nextLine());    
        System.out.print("Enter password: ");
        String pw = String.valueOf(scanner.nextLine());            
        if (userNames.containsKey(userName) && userNames.get(userName).equals(pw)){
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
