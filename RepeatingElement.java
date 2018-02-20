/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Abhishek Ojha
 */
public class RepeatingElement {
  public static void main(String[] args) {
        System.out.print("Enter the String");
        Scanner sn = new Scanner(System.in);
        String input = sn.nextLine();
        String[] words = input.split(" ");
        
         Map<String,String> wordMap = new HashMap<String,String>();                
        Map<String,String> printedMap = new HashMap<String,String>();

        for(int i=0;i<words.length;i++) {
            String word = words[i].toUpperCase(); 
            if(wordMap.get(word)!=null) {
               
                if(printedMap.get(word)==null) { 
                    System.out.println("Repeated word:"+word);
                    printedMap.put(word, word); 
                }
            }else {
                wordMap.put(word, word);
            }
        }
    }
    
}