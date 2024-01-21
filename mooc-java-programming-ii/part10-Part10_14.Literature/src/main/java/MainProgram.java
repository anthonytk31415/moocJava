
import java.util.Scanner;
import java.util.ArrayList; 
import java.util.Comparator; 
import java.util.Collections; 
public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<ArrayList<String>> content = new ArrayList<>();

        while (true){
            System.out.println("Input the name of the book, empty stops: ");
            ArrayList<String> lines = new ArrayList<>();
            String line0 = scanner.nextLine(); 
            if (line0.isEmpty()){
                break; 
            }
            lines.add(line0);
            System.out.println("Input the age recommendation: ");
            lines.add(scanner.nextLine());
            content.add(lines);
        }
//        Comparator<ArrayList<String>> comp = 
        
        Collections.sort(content, Comparator
                .comparing((ArrayList<String> x) -> x.get(1))
                .thenComparing(x -> x.get(0)));
        
        System.out.println(content.size() + " books in total." + "\n" + "Books: \n");
        content.stream()
            .forEach( x -> System.out.println(x.get(0) + " (recommended for " + x.get(1) + " year-olds or older)")); 
    }

}
