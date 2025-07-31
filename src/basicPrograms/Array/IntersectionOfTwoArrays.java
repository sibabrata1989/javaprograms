package basicPrograms.Array;

import java.util.ArrayList;

public class IntersectionOfTwoArrays {
    public static void main(String args[])
    {
        int[] a = {1,2,5,4,6,8};
        int[] b = {2,7,4,3,6};
        ArrayList<Integer> res = new ArrayList<>();

        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<b.length;j++)
            {
                if(a[i]==b[j])
                {
                    if(!res.contains(a[i])) {
                        res.add(a[i]);
                    }
                }
            }
        }
        for(int val: res) {
            System.out.print(val);
        }



    }
}
