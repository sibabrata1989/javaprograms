package basicPrograms;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;


public class RemoveDuplicateChars {

	public static void main(String[] args) {
		String s="aabbccdef";
		char[] charArray = s.toCharArray();
		Set<Character> set=new LinkedHashSet<Character>();
		for(Character c:charArray)
		{
		    set.add(c);
		}

		Iterator<Character> itr = set.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next());
        }
	}

}
