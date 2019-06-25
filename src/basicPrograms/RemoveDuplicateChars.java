package basicPrograms;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;


public class RemoveDuplicateChars {

	public static void main(String[] args) {
		String s="aabbccdef";
		Set<Character> set=new LinkedHashSet<Character>();
		for(char c:s.toCharArray())
		{
		    set.add(Character.valueOf(c));
		}

		Iterator<Character> itr = set.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next());
        }
	}

}
