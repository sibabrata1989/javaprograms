package basicPrograms;

public class SwapTwoStringWithoutThirdString {
    public static void main(String[] args)
    {
        String s1 = "Sibabrata";
        String s2 = "Swain";
        System.out.println("Before : " +s1+" " +s2);
        s1 = s1+s2;
        s2 = s1.substring(0, s1.length()-s2.length());
        s1 = s1.substring(s2.length());

        System.out.println("After : " +s1+" " +s2);
    }
}
