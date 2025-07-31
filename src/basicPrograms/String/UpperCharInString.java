package basicPrograms.String;

public class UpperCharInString {

	public static void main(String[] args) {
		String value = "carrot";
        String value2 = "steamed carrot";

        // Convert String to char array.
        char[] array = value.toCharArray();
        for (int i = 0; i < array.length; i++)
        {
			if(array[i]=='o')
			{
				array[i] = Character.toUpperCase(array[i]);
			}
		}
        new String(array);
        System.out.println(value);
        System.out.println(array);

	}

}
