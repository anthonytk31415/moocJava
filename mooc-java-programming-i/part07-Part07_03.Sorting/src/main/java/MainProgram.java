import java.util.Collections;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        
        

    }
    public static int indexOfSmallest(int[] arr){        
        int res = 0;
        for (int i = 0; i < arr.length; i ++){
            if (arr[i] < arr[res]){
                res = i;
            }
        }
        return res; 
        
    }
    
    
    
    public static int smallest(int[] array){
        return array[indexOfSmallest(array)];
    }
    
    public static int indexOfSmallestFrom(int[] arr, int startIndex) {
//        if (startIndex >= arr.length) {
//            return null;
//        }

        int res = startIndex; 
        for (int i = startIndex; i < arr.length; i ++){
            if (arr[i] < arr[res]){
                res = i;
            }
        }
        return res; 
    
    }
    public static void swap(int[] arr, int index1, int index2) {
    // write your code here
        int temp = arr[index2]; 
        arr[index2] = arr[index1];
        arr[index1] = temp;
    }
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i ++){
            int curSmallest = indexOfSmallestFrom(arr, i);
            swap(arr, i, curSmallest);
        }
        
        
    }

}
