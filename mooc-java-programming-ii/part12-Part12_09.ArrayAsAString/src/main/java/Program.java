
public class Program {

    public static void main(String[] args) {
        // Test your method here
//        MagicSquare sq = createMagicSquare(3);
//        System.out.println(sq);
//        
        
    }
    public static String arrayAsString(int[][] array){
        String res = "";
        for (int i = 0; i < array.length; i ++){
            for (int j = 0; j < array[i].length; j ++){
                res += array[i][j];
            }
            res += "\n";
        }
        return res; 
    }
}
