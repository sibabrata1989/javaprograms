package basicPrograms.String;

import java.util.HashMap;
import java.util.Set;

public class CountDuplicateCharInString_HashMap {

	public static void main(String[] args) {

	 String str = "Sibabrata";

	 HashMap<Character, Integer> chrMap = new HashMap<>();

	 char[] strArray = str.toCharArray();

	 for (Character c : strArray) {
		if (chrMap.containsKey(c)){
			chrMap.put(c, chrMap.get(c)+1);

		}
		else
		{
			chrMap.put(c, 1);
		}
	}

	 System.out.println(chrMap);

	 Set<Character>setChar = chrMap.keySet();

	 for (Character character : setChar) {
		if (chrMap.get(character)>1) {
			System.out.println(character+" : "+chrMap.get(character));

		}
	}

	}


}
