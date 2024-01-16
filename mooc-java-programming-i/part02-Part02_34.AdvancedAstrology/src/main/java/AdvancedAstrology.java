
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        System.out.println("*".repeat(number));
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        System.out.print(" ".repeat(number));
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for (int i = size - 1; i > 0; i --){
            printSpaces(i);
            printStars(size - i);
        }
        printStars(size);
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int size = height; 
        for (int i = size - 1; i > 0; i --){
            printSpaces(i);
            printStars((size - i)*2-1);
        }
        printStars(size*2-1);
        for (int i = 0; i < 2; i ++){
            printSpaces(size - 2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
