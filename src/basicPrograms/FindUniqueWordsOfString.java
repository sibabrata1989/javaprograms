package basicPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindUniqueWordsOfString {
    public static void main(String[] args)
    {
        String str = "Siba is a boy. Siba likes to play Badminton . Badminton game required lots of fitness";
        String[] words = str.split(" ");
        Map<String, Integer> hashMap = new HashMap<String,Integer>();
        for (String word:words) {
            Integer count = hashMap.get(word);
            if(count == null) {
                hashMap.put(word, 1);
            }
            else
            {
                hashMap.put(word,count+1);
            }

        }
        Set<String> keys = hashMap.keySet();
        for (String key : keys) {
            if(hashMap.get(key)==1)
            {
                System.out.println("The unique word is:"+key);
            }

        }

    }
}
