package basicPrograms.Array;

public class ArraySorting {
    public static void main(String[] args)
    {
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        ArraySorting.bubbleSorting(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ ", ");
        }
    }
    private static void bubbleSorting(int[] arr)
    {
        int i, j, temp;
        boolean swapped;
        for (i =0; i<arr.length-1;i++)
        {
            swapped = false;
            for (j =0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false)
            {
                break;
            }

        }
    }

}
