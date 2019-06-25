package basicPrograms;

import java.io.Console;
import java.util.logging.ConsoleHandler;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		 int  a=5, b=10;            
	       System.out.println("Before swap a= "+a+" b= "+b);    
	       a=a+b; //a=15 (5+10)      
	       b=a-b; //b=5 (15-10)      
	       a=a-b; //a=10 (15-5)   
	       System.out.println("After swap a= "+a+" b= "+b);

	}

}
