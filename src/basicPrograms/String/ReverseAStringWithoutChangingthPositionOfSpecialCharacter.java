package basicPrograms.String;

public class ReverseAStringWithoutChangingthPositionOfSpecialCharacter {
    public static void main(String args[]) {
        String str = "!hdhd&*&ab";
        char[] ch = str.toCharArray();
        int l =0;
        int r = ch.length-1;
        char temp;
        while(l<r)
        {
            if(!Character.isAlphabetic(ch[l]))
            {
                l++;
            }
            else if(!Character.isAlphabetic(ch[r]))
            {
                r--;
            }
            else
            {
                temp = ch[l];
                ch[l] = ch[r];
                ch[r] = temp;
                l++;
                r--;
            }
        }
        System.out.println(String.valueOf(ch));

    }
}
