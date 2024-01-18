
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int curSum = 0;
        int count = 0;
        while (true){

            Integer num = Integer.parseInt(scanner.nextLine());
            if (num == 0){
                break;
            } else if (num > 0){
                curSum += num;
                count += 1;
            } 
            
        }
        if (count == 0){
            System.out.println("Cannot calculate the average");
            
        } else {
            System.out.println(curSum*1.0/count);            
        }

    }
}
