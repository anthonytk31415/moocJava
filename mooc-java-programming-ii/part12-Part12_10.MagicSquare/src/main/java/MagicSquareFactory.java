
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {      
        MagicSquare square = new MagicSquare(size);        
        int k = 1;
        int limit = size * size; 
        int i = 0; 
        int j = (size - 1)/2; 
        while (k <= limit){
            
            // place value
            square.placeValue(j, i, k);            
            // move up and right; 
            int[] newMove = this.nextMove(i, j, size);
            int u = newMove[0];
            int v = newMove[1];
            if (square.readValue(v, u) != 0){
                int[] newDownMove = this.moveDown(i, j, size);
                    u = newDownMove[0];
                    v = newDownMove[1];
            }
            i = u; 
            j = v; 
            k += 1; 
        }
        // implement the creation of a magic square with the Siamese method algorithm here
        return square;
    }
    
    
    public int[] nextMove(int i, int j, int size){
        i -= 1; 
        j += 1; 
        if (i < 0){
            i = size - 1;
        }
        if (j >= size){
            j = 0; 
        }
        return new int[] {i, j};
    }
    
    public int[] moveDown(int i, int j, int size){
        i += 1; 
        if (i >= size){
            i = 0; 
        }
        return new int[] {i, j};
    }
    
    
}
