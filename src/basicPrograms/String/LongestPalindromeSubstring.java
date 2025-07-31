package basicPrograms.String;

public class LongestPalindromeSubstring {
    public static void main(String args[])
    {
        LongestPalindromeSubstring lp = new LongestPalindromeSubstring();
        String s = "ababadda";
        String longest = "";
        int n = s.length();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++)
            {
                if(lp.isPalindrome(s,i,j) && (j-i+1) > longest.length()){
                    longest = s.substring(i,j+1);
                }
            }
        }
        System.out.println("longest substring : "+longest);

//        String str = "abaaba";
//       System.out.println(lp.isPalindrome(str,0,str.length()-1));

    }
    private boolean isPalindrome(String s, int start, int end)
    {
        while(start<end)
        {
            if(s.charAt(start) != s.charAt(end))
            {
                return false;
            }
            start ++;
            end --;
        }
        return true;
    }



}
