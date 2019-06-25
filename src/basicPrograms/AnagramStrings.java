package basicPrograms;

import java.util.Arrays;

public class AnagramStrings {

	public static void main(String[] args) {
		String str1 = "Sibabrata swain";
		String str2 = "siba atarb inaws";
		
		char[]char1 = str1.replaceAll("\\s", "").toLowerCase().toCharArray();
		char[]char2 = str2.replaceAll("\\s", "").toLowerCase().toCharArray();
		
		Arrays.sort(char1);
		Arrays.sort(char2);
		
		boolean status = Arrays.equals(char1, char2);
		
		if(status)
		{
			System.out.println("Anagrams");
		}
		else
		{
			System.out.println("Not Anagrams");
		}
		

	}

}
