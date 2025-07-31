package basicPrograms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CodePractiseCLass {

    //1. Find the permutation of all strings
    private void permutationOfAllString()
    {
        String str ="sibabata";
        String res;
        char[] a = str.toCharArray();
//        for (int i=0;i<a.length;i++){
//            res = str.substring();
//        }

    }

    private static void reverseString(String s)
    {
        String rev="";
        for(int i = s.length()-1;i>=0;i--)
        {
             rev = rev + s.charAt(i);
        }
        System.out.println(rev);

    }

    private static void removeDuplicateCharacters(char[] ch)
    {
        Set<Character> set = new HashSet<>();
        for (char c : ch)
        {
            set.add(c);
        }
        Iterator<Character> s = set.iterator();
        while(s.hasNext())
        {
            System.out.print(s.next());
        }
    }



    public static void main(String args[])
    {
        CodePractiseCLass.reverseString("siba");
        CodePractiseCLass.removeDuplicateCharacters(new char[]{'a','a','b'});
    }

}
