package basicPrograms.String;

import java.util.HashSet;
import java.util.Iterator;

public class FindVowelsInString {
    public static void main(String[] args) {
        String str = "sibabrata swain";
        HashSet<Character> vowel = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vowel.add(str.charAt(i));
            }
        }
        Iterator<Character> it = vowel.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
