package basicPrograms.Array;

public class FindLargestNumberInArray {
    public static void main(String[] args)
    {
        int[] a = {2,3,49,29,3,2};
        int max = a[0];
        for( int i=0; i<a.length;i++)
        {
         if(a[i]>max)
         {
             max = a[i];
         }
        }
        System.out.println(max);
    }
}
