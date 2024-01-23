
import java.util.Scanner;
//import java.util.math; 

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // test your method here

    }
    public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest){
        int res = 0;
        for (int i = Math.max(0, fromWhere); i < Math.min(toWhere, array.length); i ++ ){
            if (array[i] >= smallest && array[i] <= largest){
                res += array[i];
            }

        }
        return res; 
    }
}
