package basicPrograms.Array;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class MaxOccuranceNumberInArray {
    public static void main(String[] args)
    {
        char[] a = {1,2,3,4,5,3,5,5,5,2,1,3};
        int max =0;
        int count;
        int element = 0;
        int secondLargest = 0;
        for(int i=0 ;i<a.length;i++)
        {
            count=1;
            for(int j=i+1;j<a.length;j++)
            {

                if(a[i]==a[j])
                {
                    count++;
                }
            }
            if(max<count)
            {
                max = count;
                element = a[i];
            }

        }
        System.out.println("Element:" +element + " Count: "+max);
       // System.out.println("2nd largest Element:" +secondLargest + " Count: "+max);
    }

}
