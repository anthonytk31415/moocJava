
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input = "placeholder";
        while (!input.isEmpty()) {
            input = String.valueOf(scanner.nextLine());
            if (!input.isEmpty()){
                Item newItem = new Item(input);
                items.add(newItem);
            }
        }
        for (Item curItem : items){
            System.out.println(curItem);
        }
    }
}
