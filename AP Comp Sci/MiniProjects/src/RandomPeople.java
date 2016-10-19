/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dsartory
 */
public class RandomPeople {
      // Add any necessary instance variables here
    private static List<String> nameList;
    
    /**
     * Your constructor should initialize any instance variables.
     * You may not modify the originalList parameter.
     * @param originalList 
     */
    public RandomPeople(String[] originalList){
        nameList = new ArrayList<String>();
        for(String s : originalList){
            nameList.add(s);
        }
    }
    
    /**
     * Get a random and unique name from the list and return it.  If all names
     * have been used/returned, return "None" instead.
     * @return String name or "None"
     */
    public static String getRandomName(){
        if(nameList.size() > 0){
            return nameList.remove((int)(Math.random() * nameList.size()));
        }
        return "None";
    }
    
    
}
