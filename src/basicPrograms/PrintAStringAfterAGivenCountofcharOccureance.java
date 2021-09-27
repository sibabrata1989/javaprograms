package basicPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PrintAStringAfterAGivenCountofcharOccureance {
    public static void main(String args[]) {
        String str = "sibabrataswain";
        int count = 4;
        char[] ch = str.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < ch.length; i++) {
            if(map.containsKey(ch[i]))
            {
                map.put(ch[i],map.get(ch[i])+1);
                if(map.get(ch[i])==count)
                {
                    System.out.println(str.substring(i+1));
                    break;
                }
            }
            else
            {
                map.put(ch[i],1);
            }

        }
    }

}
