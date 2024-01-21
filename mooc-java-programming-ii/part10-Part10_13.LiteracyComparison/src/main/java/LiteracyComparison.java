
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections; 

public class LiteracyComparison {
    
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> books = readBooks("literacy.csv");
        books.stream()
//                .map(x -> x.get(2))
                .forEach(x -> System.out.println(x.get(3) + " (" + x.get(4) + "), " + Arrays.asList(x.get(2).split(" ")).get(1) + ", " + x.get(5)));



        
    }
    
    public static ArrayList<ArrayList<String>> readBooks(String file){
        ArrayList<ArrayList<String>> rows = new ArrayList<>();
        try {            
            Files.lines(Paths.get(file))
                    .forEach(x -> rows.add(lineToBook(x)));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        Collections.sort(rows, (x, y) -> Double.compare(Double.parseDouble(y.get(5)), Double.parseDouble(x.get(5))));
        return rows; 
        

    }
    
    public static ArrayList<String> lineToBook(String row){
        ArrayList<String> arr = new ArrayList(Arrays.asList(row.split(",")));
        return arr;
    }
}


