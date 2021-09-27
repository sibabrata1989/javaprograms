package basicPrograms;

public class AllPermutationOfString {
    public static void main (String[] args)
    {
        String str = "abcd";
        String res="";
        char temp;
        char[] b = str.toCharArray();
        for (int i = 0; i < b.length; i++) {
                res = str.substring(0,i)+str.substring(i+1);
            System.out.println(res+b[i]);
            }


        }

}
