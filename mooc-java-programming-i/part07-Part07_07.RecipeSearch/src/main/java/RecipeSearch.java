
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashSet;

public class RecipeSearch {

    public static void main(String[] args) {
        start();
    }



    public static ArrayList<Recipe> readFileToRecipes(String file){
        ArrayList<Recipe> list = new ArrayList<>();
        try (Scanner scanner1 = new Scanner(Paths.get(file))){
            ArrayList<String> rows = new ArrayList<>();
            while (scanner1.hasNextLine()){
                String row = scanner1.nextLine();
                rows.add(row); 
            }
            
            String name = "";
            int cookTime = -1;
            HashSet<String> ingredients = new HashSet<>();

            for (String row : rows){
                if (row.equals("")){
                    Recipe curRecipe = new Recipe(name, ingredients, cookTime);
                    list.add(curRecipe);
                    name = "";
                    cookTime = -1;
                    ingredients = new HashSet<>();
                } else if (name.equals("")){
                    name = row; 
                } else if (cookTime == -1){
                    cookTime = Integer.parseInt(row);
                } else {
                    ingredients.add(row);
                }
            }
            Recipe curRecipe = new Recipe(name, ingredients, cookTime);
            list.add(curRecipe);
            return list;
                    
        } catch (Exception e){ 
            System.out.println("Reading the file " + file + " failed.");      
            return list; 
        }

    }

    
    public static void printCommands(){
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
    }


    public static void start(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("File to read: ");

        String file = scanner.nextLine(); 
        ArrayList<Recipe> recipes = readFileToRecipes(file);

        printCommands();
        while (true){
            System.out.println("Enter Command:");
            String command = scanner.nextLine(); 
            if (command.equals("stop")){
                break;
            } else if (command.equals("list")){
                recipes.forEach(x -> {
                    System.out.println(x);
                });
            } else if (command.equals("find name")){
                System.out.println("Max cooking time: ");
                String searchKey = scanner.nextLine(); 
                recipes.forEach(x -> {
                    if (x.nameContainsWord(searchKey)){
                        System.out.println(x);
                    }
                }); 
            } else if (command.equals("find cooking time")){
                System.out.println("Max cooking time: ");
                int maxCookTime = Integer.parseInt(scanner.nextLine()); 
                recipes.forEach(x -> {
                    if (x.getCookTime() <= maxCookTime){
                        System.out.println(x);
                    }
                }); 
            } else if (command.equals("find ingredient")){
                System.out.println("Ingredient: ");
                String searchKey = scanner.nextLine(); 
                recipes.forEach(x -> {
                    if (x.containsIngredient(searchKey)){
                        System.out.println(x);
                    }
                }); 
                
            } 
        }
    }


}

