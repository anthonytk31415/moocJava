
public class Statistics {
    private int count; 
    private int sum; 
    public Statistics(){
        this.count = 0;
        this.sum = 0; 
    }
    
    public void addNumber(int num){
        this.count += 1;
        this.sum += num; 
    }
    public int getCount(){
        return this.count; 
    }
    
    public int sum(){
        return sum;
    }
    public double average(){
        if (count == 0) {
            return 0.0;
        }
        return sum*1.0/count;
    }
}
