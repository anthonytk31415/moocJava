
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString() {
        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }

        // we form a string from the people on the list
        if (this.elements.size() == 1){
           return "The collection " + this.name + " has 1 element:" + "\n" + this.elements.get(0);            
        }

        String printOut = "";
        if (this.elements.size() > 1) {
            printOut = "The collection " + this.name + " has " + this.elements.size() + " elements:" + "\n";
        }
        String msg = ""; 
        for (String x : elements){
            msg += x + "\n";
        }
        return printOut + msg; 
        
        
    }
    
}
