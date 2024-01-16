/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anthonytk
 */
import java.util.HashSet;


public class Recipe {
    private String name; 
    private HashSet<String> ingredients; 
    private int cookTime; 

    public Recipe(String name, HashSet<String> ingredients, int cookTime){
        this.name = name; 
        this.ingredients = ingredients;
        this.cookTime = cookTime; 
    }

    public String toString(){
        return this.name + ", cooking time: " + this.cookTime;  
    }
    
    public int getCookTime(){
        return this.cookTime; 
    }

    public boolean nameContainsWord(String searchKey){
        for (int i = 0; i < this.name.length() ; i ++ ){
            boolean isWordEqual = true; 
            int k = i; 
            for (int j = 0; j < searchKey.length(); j ++){
                if (k < this.name.length() && this.name.charAt(k) == searchKey.charAt(j)){
                    k += 1;
                } else {
                    isWordEqual = false; 
                    break; 
                }
            }
            if (isWordEqual){
                return true; 
            }
        }


        return false;
    }

    public boolean containsIngredient(String searchKey){        
        return this.ingredients.contains(searchKey);
    }

}

