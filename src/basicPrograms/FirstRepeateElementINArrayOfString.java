package basicPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FirstRepeateElementINArrayOfString {
    public static void main(String args[]) {
        String str = "bcad";
        char[] ch = str.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<ch.length;i++)
        {
            if(map.containsKey(ch[i]))
            {
                map.put(ch[i],map.get(ch[i]+1));
                System.out.println(ch[i]);
                break;
            }
            else
            {
                map.put(ch[i],1);
            }
            if(i==ch.length-1)
            {
                System.out.println("no repeat");
            }
        }

    }
}
