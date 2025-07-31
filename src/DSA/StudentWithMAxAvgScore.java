package DSA;

public class StudentWithMAxAvgScore {
    private static String studentScore(String [][] s)
    {
        int max = 0;
        String result="";
        for(int i=0 ;i<s.length;i++)
        {
            int avg = (Integer.parseInt(s[i][1])+Integer.parseInt(s[i][2])+Integer.parseInt(s[i][3]))/3;
            if(avg>max)
            {
                max = avg;
                result = s[i][0];
            }
        }
        return result+" "+max;
    }
    public static void main(String args[])
    {
        String [][] s = {{"siva","78","89","62"},{"Ram","67","98","85"}};
        System.out.println(StudentWithMAxAvgScore.studentScore(s));
    }
}
