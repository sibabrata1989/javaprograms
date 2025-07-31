
package basicPrograms.String;

public class ReverseAString {

	public static void main(String[] args) {
		//ReverseAString.reverseString("siba");
        ReverseAString.reverseAStringWithoutChangingThePositionOfSpecialChar("sib6i8a");


	}
    private static void reverseString(String str)
    {
        String reverse = "";

        for(int i = str.length() - 1; i >= 0; i--)
        {
            reverse = reverse + str.charAt(i);
        }

        System.out.println("Reversed string is:" +reverse);
    }
    private static void reverseAStringWithoutChangingThePositionOfSpecialChar(String str)
    {

        char temp;
        char [] ch = str.toCharArray();
        int start = 0;
        int end = ch.length-1;
        while(start<end)
        {
            if(!Character.isAlphabetic(ch[start])){
                start++;
            }
            else if(!Character.isAlphabetic(ch[end])){
                end--;
            }
            else
            {
                temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;

            }
        }
        System.out.println(ch);

    }



}
