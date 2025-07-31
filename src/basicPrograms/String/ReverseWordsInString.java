package basicPrograms.String;

public class ReverseWordsInString {

	public static void main(String[] args) {
		String str = "siba brata swain";
		String revStr = "";
		String[] words = str.split(" ");
		
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String revWord = "";
			
			for(int j=word.length()-1;j>=0;j--)
			{
				revWord = revWord + word.charAt(j);
				
			}
			
			revStr = revStr + revWord + " ";
		
			
		}
		System.out.println(str);
		System.out.println("Reverse of "+str+" is "+revStr);
				

	}

}
