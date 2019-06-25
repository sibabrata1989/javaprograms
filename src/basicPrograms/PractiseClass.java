package basicPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class PractiseClass {

	public static void main(String[] args) {
		int f1=0,f2=1,f3;
		
	for (int n = 0; n < 10; n++)
	{
		System.out.print(f2+" ");
		f3=f1+f2;
		f1=f2;
		f2=f3;
	}
	}
}