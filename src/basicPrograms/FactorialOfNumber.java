package basicPrograms;

public class FactorialOfNumber {
//Write a program to find a Factorial of a number.
	public static void main(String[] args) {
		 int num = 4;
	        long factorial = 1;
	        for(int i = 1; i <= num; ++i)
	        {
	             factorial = factorial * i;
	            //factorial *= i;
	        }
	        System.out.printf("Factorial of %d = %d", num, factorial);

	}

}
