package basicPrograms.Array;

import java.util.Arrays;

public class MergerTwoSortedArrayWithoutExtraSpace {
    public static void main(String[] args)
    {
        int[] a = {1, 5, 9, 10, 15, 20};
        int[] b = {2, 3, 8, 13};
        int i = a.length-1;
        int j = 0;
        int temp;
        while (i>=0 && j<b.length)
        {
            if(a[i]<b[j])
            {
                i--;
            }
            else {
                temp = b[j];
                b[j] = a[i];
                a[i] = temp;
                j++;
                i--;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for(int m : a)
        {
            System.out.print(m);
        }
        for(int n:b)
        {
            System.out.print(n);
        }
    }

    public static class PalindromeStringCheck {
        public static void main(String args[]) {
            System.out.println(PalindromeStringCheck.isPalindrome("aba57,//,.  aaba")); //removes whitespace and special char
            System.out.println(PalindromeStringCheck.isPalindrome("abaaaba"));
        }
        private static boolean isPalindrome(String s) {
                String str = s.replaceAll("\\s", "").toLowerCase();
                String result = "";
                for (char ch : str.toCharArray()) {
                    if (Character.isAlphabetic(ch)) {
                        result = result + ch;
                    }
                }
                str = result;
                int start = 0;
                int end = str.length() - 1;
                while (start < end) {
                    if (str.charAt(start) != str.charAt(end)) {
                        return false;
                    }
                    start++;
                    end--;
                }
                return true;

        }

    }
}
