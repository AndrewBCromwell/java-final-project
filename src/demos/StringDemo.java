package src.demos;
import java.util.Arrays;
import java.util.Random;

import javax.swing.plaf.synth.SynthScrollPaneUI;


public class StringDemo {
    public static void main(String[] args) {
        String mySchool = "Kirkwood Community College";
        // int 	length()
        System.out.println(mySchool.length()); // .length() is for strings, .length is for arrays.
        // char 	charAt(int index)
        System.out.println(mySchool.charAt(9)); // if use number grater than characters in string, string index out of bounds.

        for(int i = mySchool.length() - 1; i >= 0; i--){
            System.out.print(mySchool.charAt(i));
        }
        System.out.println();

        // char[] 	toCharArray()
        char[] letters = mySchool.toCharArray();
        System.out.println(Arrays.toString(letters));

        // int 	compareTo(String anotherString)
        // 9
        System.out.println(mySchool.compareTo("Blackhawk Community College"));
        // -9
        System.out.println("Blackhawk Community College".compareTo(mySchool));
        // diff between int val of first char in first string and first char in second string
        // if result is 0, uses the second letter
  


        // indexOf(String str)
        int locationFound = mySchool.indexOf("C"); // can us lastIndexOf()
        System.out.println(locationFound);
        if(locationFound >= 0){
            System.out.println("I found it");
        }else{
            System.out.println("Not found");
        }
        locationFound = mySchool.indexOf("Z");
        System.out.println(locationFound);
        if(locationFound >= 0){
            System.out.println("I found it");
        }else{
            System.out.println("Not found");
        }

        // boolean 	contains(CharSequence s)
        boolean found = mySchool.contains("C"); // similar to indexOf exept returns true
        if(found) {                             // if is in, false if not in. no index return.
            System.out.println("I found it");
        } else {
            System.out.println("Not found");
        }
        found = mySchool.contains("Z");
        if(found) {
            System.out.println("I found it");
        } else {
            System.out.println("Not found");
        }
        
        
        // replace() and replaceAll()
        String sentence = "The quick brown fox jumped over the lazy dogs";
        System.out.println(sentence.replace("brown", "red"));
        System.out.println(sentence.replace("lazy", "relaxing"));
        System.out.println(sentence.replace("e", "f"));
        
        // String[]     split()
        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));
        
        // trim() removes trailing and leading spaces

        // Substring()
        System.out.println(mySchool.substring(0, 4)); // characters in indexes 0 - 3
        System.out.println(mySchool.substring(4)); // characters in index 4 to end

        // toUpperCase() and toLowerCase() return strings

        // can chain methods with same return type

        String name = "Kirkwood";
        name = name.toUpperCase();
        for(int i = 0; i < name.length(); i++){
            for(int j = 0; j < i; j++){
                System.out.print("\t");
            }
            System.out.println(name.charAt(i));
        }
        
    }

}

