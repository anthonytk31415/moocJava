import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true){
            String checkValue = String.valueOf(scanner.nextLine());
            if (!checkValue.isEmpty()){
                String fname = checkValue;
                int duration = Integer.valueOf(scanner.nextLine());

                TelevisionProgram tv = new TelevisionProgram(fname, duration);
                programs.add(tv);
            }
            else {
                break;
            }
        }
        System.out.println("Program's maximum duration? ");
        int maxDuration = Integer.valueOf(scanner.nextLine());
        for (TelevisionProgram tv : programs){
            if (tv.getDuration() <= maxDuration){
                System.out.println(tv.getName() + ", "+ tv.getDuration() + "minutes");
            }
        }
    }
}
