package basicPrograms;

public class ArmstrongNumber {
//A positive number is called armstrong number if it is equal to the sum of cubes of its digits for example 0, 1, 153, 370, 371, 407 etc.
	public static void main(String[] args) {
		 int c=0,r,temp;
		    int n=30;//It is the number to check armstrong  
		    temp=n;  
		    while(n>0)  
		    {  
		    r=n%10;
		    n=n/10;  
		    c=c+(r*r*r);
		    }  
		    if(temp==c)  
		    System.out.println("armstrong number");   
		    else  
		        System.out.println("Not armstrong number");   
		   }  

	}


