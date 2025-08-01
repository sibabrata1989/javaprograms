package basicPrograms.String;

import java.util.*;

public class LargestSubstringWithNonRepetatedCharacter {
//    public static void main(String args[]) {
//        String str = "geeksforgeeks";
//        String res="";
//        int length =0;
//        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
//        for (int i = 0; i < str.length(); i++) {
//            char[] ch = str.toCharArray();
//            if(!map.containsKey(ch[i]))
//            {
//                map.put(ch[i],i);
//            }
//            else
//            {
//               // i = map.get(ch[i]);
//                map.clear();
//            }
//            if(map.size()>length)
//            {
//                length = map.size();
//                res = map.keySet().toString();
//            }
//        }
//        System.out.println(res);
//    }

    public static void main(String[] args)
    {
     String str = "sibabrataswain";
     int length= 0;
     String res = "";
     LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
     for(int i=0;i<str.length();i++)
     {
         char[] ch = str.toCharArray();
         if(!map.containsKey(ch[i]))
         {
             map.put(ch[i],i);
         }
         else
         {
             map.clear();
         }
         if(map.size()>length)
         {
             length = map.size();
             res = map.keySet().toString();
         }
     }
     System.out.println("Result: "+res + " size: "+length);

    }
}
