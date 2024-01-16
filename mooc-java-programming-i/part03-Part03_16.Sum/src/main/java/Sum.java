
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        // Try your method here
    }
    public static int sum(ArrayList<Integer> nums){
        return nums.stream().reduce(0, (a,b)-> a + b);
    }
}
