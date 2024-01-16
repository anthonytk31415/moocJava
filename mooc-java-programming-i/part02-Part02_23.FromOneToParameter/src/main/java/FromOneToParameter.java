

public class FromOneToParameter {

    public static void main(String[] args) {

    }

    
    public static void printUntilNumber(int number) {
        for (int i = 1; i <= number; i ++) {
            System.out.println(i);
        }
    }
    
    public static void printFromNumberToOne(int number) {
        for (int i = number; i >= 1; i --) {
            System.out.println(i);
        }
    }
}
