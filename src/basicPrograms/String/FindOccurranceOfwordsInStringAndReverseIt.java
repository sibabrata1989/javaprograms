package basicPrograms.String;

import java.util.HashMap;
import java.util.Map;

public class FindOccurranceOfwordsInStringAndReverseIt {
    public static void main(String[] args) {
        String str = "Rohit is a batsman and Ashwin is a bowler";
        String reverseWord = "";

        Map<String, Integer> hasMap = new HashMap<>();
        String[] words = str.split(" ");
        for (String word : words) {
        if(hasMap.containsKey(word))
        {
            hasMap.put(word,hasMap.get(word)+1);
        }
        else
        {
            hasMap.put(word,1);
        }
            String reverse = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reverse = reverse + word.charAt(i);

            }
            reverseWord = reverseWord + reverse + " ";
        }

        System.out.println(hasMap);
        System.out.println(reverseWord);

    }
}
