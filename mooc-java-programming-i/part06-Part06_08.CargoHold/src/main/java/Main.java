
public class Main {

    public static void main(String[] args) {
        // You can use the main to test your classes!
        Item brick = new Item("brick", 2);
        Item wood = new Item("wood", 3);
        Suitcase suitCase = new Suitcase(5);
        System.out.println(suitCase);
        suitCase.addItem(brick);
        suitCase.addItem(wood);
        System.out.println(suitCase);
    }

}
