package basicPrograms;

public class PrimeNumber {
    public static void main(String[] str)
    {
        int count;
        for (int num = 1; num <= 10; num++) {
            count = 0;
            for (int i = 2; i <= num/2 ; i++) {
                if(num%i==0)
                {
                    count++;
                    break;
                }
            }
            if(count==0 && num!=1)
            {
                System.out.print(num+" ");
            }
        }
    }
}
