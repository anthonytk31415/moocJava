
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            String curInput = scanner.nextLine();
            if (curInput.equals("end")){
                break;
            }
            Integer num = Integer.parseInt(curInput);
            System.out.println(num * num * num);
        }
    }
}
