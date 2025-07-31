package basicPrograms.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeArrayIntervals {
    public static void main(String args[])
    {
        int[][] intervals = {{1,3},{2,6},{8,10},{11,17},{15,18}};
       // expected output = {{1,6},{8,10},{11,18}};

        if(intervals.length<=1)
        {
            System.out.println(intervals);
        }
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0])); // Sorting the array based on first position
        List<int[]> merged = new ArrayList<>();
        int[] currentInterval = intervals[0];
        merged.add(currentInterval);
        for(int[] interval: intervals)
        {
            int currentEnd = currentInterval[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];
            if(currentEnd>=nextStart)
            {
                currentInterval[1] = Math.max(currentEnd,nextEnd);
            }
            else {
                currentInterval = interval;
                merged.add(currentInterval);
            }
        }
        System.out.println(Arrays.deepToString(merged.toArray(new int[merged.size()][])));
    }
}
