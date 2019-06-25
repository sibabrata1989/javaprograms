package basicPrograms;

public class FibonacciSeries {
//The Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, ...
	
	public static void main(String[] args) {
		int n = 10,t1=0,t2=1,t3;
        System.out.print("First " + n + " terms: ");

        for (int i = 1; i <= n; i++)
        {
            System.out.print(t1+",");

            t3=t2+t1;
            t1=t2;
            t2=t3;
            
        }
    }
}


