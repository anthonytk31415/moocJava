
import java.nio.file.Paths;
//import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        HashMap<String, Integer[]> teams = new HashMap<>();
        
        try (Scanner scanner1 = new Scanner(Paths.get(file))){
            while (scanner1.hasNextLine()){
                String row = scanner1.nextLine();
                String[] parts = row.split(",");
                if (!teams.containsKey(parts[0])) {
                    Integer[] initialvalue = {0,0};
                    teams.put(parts[0], initialvalue );
                    
                }
                if (!teams.containsKey(parts[1])) {
                    Integer[] initialvalue = {0,0};
                    teams.put(parts[1], initialvalue );
                    
                }
                if (Integer.parseInt(parts[2]) > Integer.parseInt(parts[3])) {
                    teams.get(parts[0])[0] += 1;
                    teams.get(parts[1])[1] += 1; 
                } else {
                    teams.get(parts[0])[1] += 1;
                    teams.get(parts[1])[0] += 1; 
                }
            }
                    
        } catch (Exception e){ 
            System.out.println("Reading the file " + file + " failed.");            
        }
        System.out.println("Team:");
        String team = scan.nextLine();
        if (teams.containsKey(team)){
            System.out.println("Games: " + (teams.get(team)[0] + teams.get(team)[1]));
            System.out.println("Wins: " + (teams.get(team)[0]));
            System.out.println("Losses: " + (teams.get(team)[1]));
        } else {
            System.out.println("Games: 0"); 
            System.out.println("Wins: 0");
            System.out.println("Losses: 0");
        }

    }

}
