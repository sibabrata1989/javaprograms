package basicPrograms;

import java.util.Map;

public class PowerOf2MatchingNumber {
    public static void main(String[] args) {
        int n = 64;
        int i=2;
        int res=0;
        while (i < n)
        {
           res = (int) ( Math.pow(2,i));
           if(res==n)
           {
               System.out.println("matching");
               break;
           }
           else
           {
               i++;
           }
           if(i==n-1)
           {
               System.out.println("notmatching");
           }
        }


    }
}
