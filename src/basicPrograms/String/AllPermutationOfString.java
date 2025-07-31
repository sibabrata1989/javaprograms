package basicPrograms.String;

public class AllPermutationOfString {
    public static void main (String[] args)
    {
        String inputString = "siba";
        AllPermutationOfString.printPermutation(inputString,"");
        }
        private static void printPermutation(String str, String ans)
        {
            if(str.length()==0)
            {
                System.out.print(ans + " ");
                return;
            }
            for(int i=0;i<str.length();i++)
            {
                char ch = str.charAt(i);
                String res = str.substring(0,i)+str.substring(i+1);
                printPermutation(res,ans+ch);
            }
        }

}
