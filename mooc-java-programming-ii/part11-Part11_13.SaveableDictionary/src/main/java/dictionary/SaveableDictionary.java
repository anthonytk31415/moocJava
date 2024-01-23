/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

/**
 *
 * @author anthonytk
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.io.PrintWriter;
import java.nio.file.Paths;
// import java.util.PrintWriter;

public class SaveableDictionary {
    
    private HashMap<String, String> finToEng; 
    private HashMap<String, String> engToFin; 
    private String file; 
    
    public SaveableDictionary(){
        this.finToEng = new HashMap<>();
        this.engToFin = new HashMap<>();
        this.file = ""; 
    }
    
    public void add(String word, String translation){
        if (!this.finToEng.containsKey(word)){
            this.finToEng.put(word, translation);
            this.engToFin.put(translation, word);
        }
    }
    public String translate(String word){
        if (this.finToEng.containsKey(word)){
            return this.finToEng.get(word);             
        } else if (this.engToFin.containsKey(word)){
            return this.engToFin.get(word);
        }
        return null;
    }


    public void delete(String word){
        if (this.finToEng.containsKey(word)){
            this.engToFin.remove(this.finToEng.get(word));
            this.finToEng.remove(word);             
        } else if (this.engToFin.containsKey(word)){
            this.finToEng.remove(this.engToFin.get(word));
            this.engToFin.get(word);
        }
    }

    public SaveableDictionary(String file){
        this.finToEng = new HashMap<>();
        this.engToFin = new HashMap<>();
        this.file = file; 


    }
    public boolean load(){
        try (Scanner scanner = new Scanner(Paths.get(this.file))) {
            // ArrayList<String> rows = new ArrayList<>();
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                // rows.add(row);
                String[] words =  row.split(":");
                this.add(words[0], words[1]); 
            }
            return true; 
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false; 
        }
    }

    public boolean save(){
        try {
            PrintWriter writer = new PrintWriter(this.file);
            String text = "";
            for (String key : this.finToEng.keySet()){
                text += key + ":" + this.finToEng.get(key) + "\n";
            }
            writer.print(text);
            writer.close();
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false; 
        }

    }

}
