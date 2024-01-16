
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashSet; 

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Order> orders = new ArrayList<>();
        HashSet<String> orderIds = new HashSet<>();
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String id = scanner.nextLine();
            if (id.isEmpty()) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            
            Order order = new Order(id, name);
            if (!(orderIds.contains(id))){
                orders.add(order);
                orderIds.add(id);
            }            
        }

        for (Order order: orders) {
            System.out.println(order.getId() + ": " + order.getName());
        }

    }
}
