
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here
    }
    public static void removeLast(ArrayList<String> s){
        if (s.size() > 0){
            s.remove(s.size() - 1);
        }
    }

}
