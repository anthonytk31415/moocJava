
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        int sumNums = 0;
        int countNums = 0;
        int evens = 0;
        int x = 1;
        while (x != -1) {
            System.out.println("Give numbers:");
            x = Integer.valueOf(scanner.nextLine());
            if (x != -1){
                sumNums += x;
                countNums += 1;
                if (x % 2 == 0){
                    evens += 1;
                }
            }            
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sumNums);
        System.out.println("Numbers: " + countNums);
        System.out.println("Average: " + sumNums*1.0/countNums);    
        System.out.println("Even: " + evens);     
        System.out.println("Odd: " + (countNums - evens));           
    }
}
