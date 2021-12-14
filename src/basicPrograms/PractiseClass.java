
package basicPrograms;

import java.util.*;

public class PractiseClass {



	//Methods..........
	private void FindTheCountOfEachCharacter(String str) {
		Map<Character, Integer> charMap = new HashMap<>();
		char[] chars = str.toCharArray();

		for (Character ch : chars) {
			if (charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch) + 1);
			} else {
				charMap.put(ch, 1);
			}
		}
		Set<Character> st = charMap.keySet();
		for (Character c : st) {
			System.out.println(c + ":" + charMap.get(c));
		}

	}

	//find unique words in a string
	private void uniqueWordInString(String str) {
		Map<String, Integer> strMap = new HashMap<>();
		String[] words = str.split(" ");
		for (String word : words) {
			if (strMap.containsKey(word)) {
				strMap.put(word, strMap.get(word) + 1);
			} else {
				strMap.put(word, 1);
			}

		}
		Set<String> set = strMap.keySet();
		for (String key : set) {
			if (strMap.get(key) == 2) {
				System.out.println(key);
			}

		}
	}

	//palindrome number
	private void palindrome(int num) {
		int sum = 0;
		int r = 0;
		int temp;
		temp = num;
		while (num > 0) {
			r = num % 10;
			sum = (sum * 10) + r;
			num = num / 10;
		}
		if (temp == sum) {
			System.out.println("pallindrome number");
		} else {
			System.out.println("not a pallindrome");
		}
	}

	//reverse a number
	private void reverseANumber(int num) {
		int r, temp, rev = 0;
		temp = num;
		while (num > 0) {
			r = num % 10;
			rev = rev * 10 + r;
			num = num / 10;
		}
		System.out.println("the reverse of" + num + ":" + rev);

	}

	//reverse a string
	private void reverseString(String str) {
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);

		}
		System.out.println("The reverse of String " + str + ": " + rev);
	}

	//reverse words in a sentence
	private void reverseWordsInSentence(String str) {

		String sentence = "";
		String[] words = str.split(" ");
		for (String word : words) {
			String rev = "";
			for (int i = word.length() - 1; i >= 0; i--) {
				rev = rev + word.charAt(i);
			}
			sentence = sentence + rev + " ";
		}

		System.out.println(sentence);
	}

	//second largest number in a aray
	private void secondLargestNumber(int[] num) {
		int largest = num[0];
		int secLargest = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] > largest) {
				secLargest = largest;
				largest = num[i];
			} else if (num[i] > secLargest) {
				secLargest = num[i];

			}

		}
		System.out.println(secLargest);
	}

	//swap two string
	private void swapString(String s1, String s2) {
		s1 = s1 + s2;
		s2 = s1.substring(0, s1.length() - s2.length());
		s1 = s1.substring(s2.length());
		System.out.println("The reverse string are : " + s1 + " " + s2);
	}

	//triplet matching the sum
	private void tripletMatchingTheNum(int[] nums, int sum) {
		for (int i = 0; i < nums.length - 2; i++) {
			for (int j = i + 1; j < nums.length - 1; j++) {
				for (int k = j + 1; k < nums.length; k++) {
					if (nums[i] + nums[j] + nums[k] == sum) {
						System.out.println(nums[i] + " " + nums[j] + " " + nums[k]);
					}
				}

			}

		}
	}

	//find all pairs from a array whose sum is equal to 5
	private void findPairInArray(int[] nums, int sum) {
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == sum) {
					System.out.println("{" + nums[i] + "," + nums[j] + "}");
				}

			}

		}
	}

	//find a sub array whose sum is equal to a given number
	private void subArrayMatchingSum(int[] arr, int sum) {
		for (int i = 0; i < arr.length; i++) {

		}
	}

	// star triangle pattern
	private void starPatterns(int n) {
		for (int i = 0; i < n; i++)
		{
				for (int k = i; k < n; k++)
				{
				System.out.print(" ");
				}
				for (int j = 0; j <= i; j++)
				{
					System.out.print("* ");
				}
			System.out.println();
		}
	}

	private void leftTriangle(int n)
	{
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	private void Triangle(int n)
	{
		for (int i = n; i >=1 ; i--) {
			for (int j = i; j >=1 ; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

	//sorting of a array
	private void sortArray(int[] arr)
	{
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i]=arr[j];
					arr[j] = temp;
				}

			}
			System.out.print(arr[i]);
		}

	}
	static int a =0;
//	 PractiseClass(int a)
//	{
//		a = 10;
//		System.out.println(a);
//
//	}
	private void testFinal()
	{
	a = 10;
	System.out.println(a);

	}
	public void possibleComination() {
		int[] num = {1, 2, 3};
		Integer n=0;
		Set<Integer> set= new HashSet<Integer>();
		for (int i = 0; i < num.length; i++){
			n=num[i];
			String s,s2;s=s2=n.toString();
			for (int j=0;j<num.length;j++){
				if(num[j]==n){
					continue;
				}
				else{
					s=s+num[j];
				}
			}
			for (int j=num.length-1;j>=0;j--){
				if(num[j]==n){
					continue;
				}
				else{
					s2=s2+num[j];
				}
			}
			set.add(Integer.parseInt(s));
			set.add(Integer.parseInt(s2));

		}
		System.out.println("Total no of Combinations "+set.size());
		for (Integer i:set
		) {
			System.out.println(i);
		}
	}

	private void possibleCombinationbyswapping() {
		int[] num = {1, 2, 3};
		int temp;
		for (int i = 0; i < num.length; i++) {
			if (num[i] == 1) {
				num[i + 1] = num[i + 1] + num[i + 2];
				num[i + 2] = num[i + 1] - num[i + 2];
				num[i + 1] = num[i + 1] - num[i + 2];

			}

		}


	}

	private void anagramString(String s1, String s2) {
		char[] ch1 = s1.replaceAll("\\s", "").toLowerCase().toCharArray();
		char[] ch2 = s2.replaceAll("\\s", "").toLowerCase().toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		boolean status = Arrays.equals(ch1, ch2);
		if (status) {
			System.out.println("anagram");
		} else {
			System.out.println("not anagram");
		}
	}

		private void amstrongNum(int n)
		{
			int c=0,a=0,temp;
			temp = n;
			while(n>0)
			{
				a=n%10;
				n=n/10;
				c=c+(a*a*a);
			}
			if(temp==c)
			{
				System.out.println("Armstrong num");
			}
		}
		private void countDuplicateChar(String str)
		{
			HashMap<Character, Integer> charMap = new HashMap<>();
			char[] chars = str.toCharArray();
			for(Character c : chars)
			{
				if(charMap.containsKey(c))
				{
					charMap.put(c,charMap.get(c)+1);
				}
				else
				{
					charMap.put(c,1);
				}
			}
			Set<Character> ch = charMap.keySet();
			for (Character c:ch) {
				if(charMap.get(c)>1)
				{
					System.out.println(c+" : "+charMap.get(c));
				}
			}
		}

		private void findoccurenceOfStringinsenetenceandreverseit(String str)
		{
			String reverseSentence = "";
			HashMap<String, Integer> hashMap = new HashMap<>();
			String[] words = str.split(" ");
			for (String word:words) {
				if(hashMap.containsKey(word))
				{
					hashMap.put(word,hashMap.get(word)+1);
				}
				else
				{
					hashMap.put(word,1);
				}
				String revStr = "";

				for(int i = word.length()-1;i>=0;i--)
				{
					revStr = revStr + word.charAt(i);
				}
				reverseSentence = reverseSentence + revStr + " ";

			}
			System.out.println(reverseSentence);
			System.out.println(hashMap);
		}




	public static void main(String[] args) {
		PractiseClass pc = new PractiseClass();

		//pc.FindTheCountOfEachCharacter("sibabrataswain");
		//pc.uniqueWordInString("siba likes to play badminton and siba likes to cook food");
		//pc.palindrome(121);
		//pc.reverseANumber(563);
		//pc.reverseString("Sibabrata Swain");
		//pc.reverseWordsInSentence("Siba likes to play badminton");
		pc.secondLargestNumber(new int[]{1, 4, 9, 10, 2});
		//pc.swapString("siba","swain");
		//pc.tripletMatchingTheNum(new int[]{1, 2, 1, 4, 5, 6, 0},6);
		pc.findPairInArray(new int[]{1,4,5,0,2,3,6,-1,8,-3},5);
		//pc.Triangle(5);
		pc.sortArray(new int[]{1, 2, 5, 3, 7, 4});
		//pc.testFinal();
		//pc.anagramString("siba","ibas");
		//pc.amstrongNum(153);
		//pc.countDuplicateChar("sibabrataswain");
		pc.findoccurenceOfStringinsenetenceandreverseit("siba is siba");
		//




	}

}