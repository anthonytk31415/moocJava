
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!
        HashMap<String,String> nameStore = new HashMap<>();
        nameStore.put("matthew", "matt");
        nameStore.put("michael", "mix");
        nameStore.put("arthur", "artie");
        System.out.println(nameStore.get("arthur"));
    }

}
