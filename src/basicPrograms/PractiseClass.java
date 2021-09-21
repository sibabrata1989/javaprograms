
package basicPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PractiseClass {

	public static void main(String[] args) {
		PractiseClass pc = new PractiseClass();
		//pc.FindTheCountOfEachCharacter("sibabrataswain");
		//pc.uniqueWordInString("siba likes to play badminton and siba likes to cook food");
		//pc.palindrome(121);
		//pc.reverseANumber(563);
		//pc.reverseString("Sibabrata Swain");
		//pc.reverseWordsInSentence("Siba likes to play badminton");
		//pc.secondLargestNumber(new int[]{1, 4, 9, 10, 2});
		//pc.swapString("siba","swain");
		pc.tripletMatchingTheNum(new int[]{1, 2, 1, 4, 5, 6, 0},6);


	}

	//Methods..........
	private void FindTheCountOfEachCharacter(String str)
	{
		Map<Character, Integer> charMap = new HashMap<>();
		char[] chars = str.toCharArray();

		for (Character ch: chars) {
			if(charMap.containsKey(ch))
			{
				charMap.put(ch,charMap.get(ch)+1);
			}
			else
			{
				charMap.put(ch,1);
			}
		}
		Set<Character> st = charMap.keySet();
		for (Character c: st) {
			System.out.println(c +":"+charMap.get(c));
		}

	}
	//find unique words in a string
	private void uniqueWordInString(String str)
	{
		Map<String,Integer> strMap = new HashMap<>();
		String[] words = str.split(" ");
		for (String word: words) {
			if(strMap.containsKey(word))
			{
				strMap.put(word,strMap.get(word)+1);
			}
			else
			{
				strMap.put(word,1);
			}

		}
		Set<String> set = strMap.keySet();
		for (String key:set) {
			if(strMap.get(key)==2)
			{
				System.out.println(key );
			}

		}
	}
	//palindrome number
	private void palindrome(int num)
	{
		int sum = 0;
		int r = 0;
		int temp;
		temp = num;
		while(num>0)
		{
			r = num%10;
			sum = (sum*10)+r;
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println("pallindrome number");
		}
		else
		{
			System.out.println("not a pallindrome");
		}
	}
	//reverse a number
	private void reverseANumber(int num)
	{
		int r,temp,rev=0;
		temp = num;
		while(num>0)
		{
			r = num%10;
			rev = rev*10+r;
			num=num/10;
		}
		System.out.println("the reverse of"+num +":"+rev);

	}
	//reverse a string
	private void reverseString(String str)
	{
		String rev="";
		for (int i = str.length()-1; i >=0 ; i--) {
			rev = rev + str.charAt(i);

		}
		System.out.println("The reverse of String "+str+": "+rev);
	}

	//reverse words in a sentence
	private void reverseWordsInSentence(String str)
	{

		String sentence ="";
		String[] words = str.split(" ");
		for (String word:words) {
			String rev = "";
			for (int i = word.length()-1; i >=0 ; i--) {
				rev = rev + word.charAt(i);
			}
			sentence =  sentence + rev + " ";
		}

		System.out.println(sentence);
	}
	//second largest number in a aray
	private void secondLargestNumber(int[] num)
	{
		int largest = num[0];
		int secLargest = num[0];
		for (int i = 0; i < num.length; i++) {
			if(num[i]>largest)
			{
				secLargest = largest;
				largest = num[i];
			}
			else if (num[i]>secLargest)
			{
				secLargest = num[i];

			}

		}
		System.out.println(secLargest);
	}
	//swap two string
	private void swapString(String s1, String s2)
	{
		s1 = s1+s2;
		s2 = s1.substring(0,s1.length()-s2.length());
		s1 = s1.substring(s2.length());
		System.out.println("The reverse string are : "+s1 +" "+s2);
	}

	//triplet matching the sum
	private void tripletMatchingTheNum(int[] nums, int sum)
	{
		for (int i = 0; i < nums.length-2; i++) {
			for (int j = i+1; j < nums.length-1; j++) {
				for (int k = j+1; k < nums.length ; k++) {
					if(nums[i]+nums[j]+nums[k]==sum)
					{
						System.out.println(nums[i]+" "+nums[j]+" "+nums[k]);
					}
				}

			}

		}
	}


}