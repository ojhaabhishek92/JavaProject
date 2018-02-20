/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abhishek Ojha
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
 
public class Repeatingword {
    
public static void main(String[] args) 
{
 
        
       countRepeat("C:\\Users\\Abhishek Ojha\\Desktop\\myText.txt");
    
}
 
  
    public static void countRepeat(String fileName) {
 
        String line = "";
        Map<Character, Integer> mapOfRepeatedChar = new HashMap<Character, Integer>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) 
        {
             while ((line = bufferedReader.readLine()) != null) {
             char[] chArray = line.toCharArray();
             for(char ch : chArray) {
             if(ch != ' ')
             {
               if(mapOfRepeatedChar.containsKey(ch))
               {
                   mapOfRepeatedChar.put(ch, mapOfRepeatedChar.get(ch) + 1);
                        
               } 
                        else 
               {
 
                            mapOfRepeatedChar.put(ch, 1);
                        }
                    }
                }
            }
 
            System.out.println("Before sorting : \n");
            System.out.println("Char" + "\t" + "Count");
           
 
           
            Set<Character> character = mapOfRepeatedChar.keySet();
 
            
            for(Character ch : character) {
                System.out.println(ch + "\t" + mapOfRepeatedChar.get(ch));
            }
 
           
            Map<Character, Integer> wordLHMap = sortByCountValue(mapOfRepeatedChar);
 
            System.out.println("\nAfter sorting\n");
            System.out.println("Char" + "\t" + "Count");
           
 
            
            for(Map.Entry<Character, Integer> entry : wordLHMap.entrySet())
            {
                System.out.println(entry.getKey() + "\t" + entry.getValue());
            }
        }
        catch (FileNotFoundException fnfex) 
        {
            fnfex.printStackTrace();
        }
        catch (IOException ioex) 
        {
            ioex.printStackTrace();
        }
    }
 
    
    public static Map<Character, Integer> sortByCountValue
        (
            Map<Character, Integer> mapOfRepeatedWord) 
        {
 
        
        Set<Map.Entry<Character, Integer>> setOfWordEntries = mapOfRepeatedWord.entrySet();
 
       
        List<Map.Entry<Character, Integer>> listOfwordEntry = new ArrayList<Map.Entry<Character, Integer>>(setOfWordEntries);
 
        
        Collections.sort(listOfwordEntry,new Comparator<Map.Entry<Character, Integer>>() {
 
            @Override
            public int compare(Entry<Character, Integer> es1, 
                    Entry<Character, Integer> es2) {
                return es2.getValue().compareTo(es1.getValue()); 
            }
        });
 
       
        Map<Character, Integer> wordLHMap = new LinkedHashMap<Character, Integer>();
 
          for(Map.Entry<Character, Integer> map : listOfwordEntry)
        {
            wordLHMap.put(map.getKey(), map.getValue());
        }
 
        return wordLHMap;
    }
}