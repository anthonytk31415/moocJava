
import java.util.Scanner;
import java.util.ArrayList; 
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();   
        System.out.println("Enter point totals, -1 stops:");
        while (true){
            int num = Integer.valueOf(scanner.nextLine());
            if (num == -1){
                break;
            } else if (num >=0 && num <= 100){
                nums.add(num);
            }
        }
//        
//        Collections.sort(nums, (a,b)-> b - a);
//        System.out.println(nums);
        
        System.out.println("Point average (all): " + calcAvg(nums));
        double avgPassing = calcAvgPassing(nums);
        if (avgPassing >0){
            System.out.println("Point average (passing): " + avgPassing);
        } else {
            System.out.println("Point average (passing): -");
        }
        
//        double passPercentage = ;
        System.out.println("Pass percentage: " + passPct(nums));
        printStars(nums);
    }
          
    
    public static double calcAvg(ArrayList<Integer> nums){
        double res = 0.0;
        for (int num : nums){
            res += num; 
        }
        return res/nums.size(); 
    }
    
    public static double calcAvgPassing(ArrayList<Integer> nums){
        double res = 0.0;
        int count = 0;
        for (int num : nums){
            if (num >= 50){
                res += num; 
                count += 1;
            }
        }
        if (count == 0){
            return -1;
        }
        return res*1.0/count; 
    }
    
    public static double passPct(ArrayList<Integer> nums){
        int count = 0;
        for (int num : nums){
            if (num >= 50){
                count += 1;
            }
        }
        if (count == 0){
            return 0;
        }
        return count*100.0/nums.size(); 
    }
    
    public static void printStars(ArrayList<Integer> nums){
        int[] starCount = new int[6];
        for (int num : nums){
            int curRes = 0;
            if (num >= 90){
                curRes = 5;
            } else if (num >= 80){
                curRes = 4;
            } else if (num >= 70){
                curRes = 3;
            } else if (num >= 60){
                curRes = 2;
            } else if (num >= 50){
                curRes = 1;
            } 
            starCount[curRes] += 1; 
        }

        System.out.println("Grade distribution:");
        for (int i = 5; i >= 0; i --){
            String stars = "*".repeat(starCount[i]);
            System.out.println(i+": " + stars);
        }
        
    }


    


    
    
}
