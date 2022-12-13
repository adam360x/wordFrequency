import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main{
    public static void main(String[] args){

        HashMap<String,Integer> words = new HashMap<String, Integer>(); // Initialize our Hashmap of each word and it's count
        String word;
        int starting_index = 0;

        for (int i = 0; i < args[0].length(); i++){ // Loop through the provided string
            if(args[0].charAt(i) == ' ' || i == args[0].length() - 1){ // If space detected or at end of string     
                word = args[0].substring(starting_index, i + 1).trim();  // Split string and remove end whitespace
                words.put(word, words.getOrDefault(word, 0) + 1); // Put string in hashmap if not exists, otherwise, find and increment value
                starting_index = i + 1;
            }
        }

        ArrayList<String> formatted_words = new ArrayList<String>(); 

        for (Map.Entry<String, Integer> element : words.entrySet()){ // Loop over every word
            formatted_words.add(element.getValue() + " " + element.getKey()); // Format via specified formatted
        }

        Collections.sort(formatted_words, Collections.reverseOrder()); // Sort by highest number

        for (String i : formatted_words){
            System.out.println(i);
        }
    }

}

