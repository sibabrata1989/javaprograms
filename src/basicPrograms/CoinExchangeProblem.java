package basicPrograms;

import java.util.*;

public class CoinExchangeProblem {

    static int minCoins(int coins[], int length, int value)
    {
        // base case
        if (value == 0) return 0;

        // Initialize result
        int res = Integer.MAX_VALUE;

        // Try every coin that has smaller value than V
        for (int i=0; i<length; i++)
        {
            if (coins[i] <= value)
            {
                int sub_res = minCoins(coins, length, value-coins[i]);

                // Check for INT_MAX to avoid overflow and see if
                // result can minimized
                if (sub_res != Integer.MAX_VALUE && sub_res + 1 < res)
                    res = sub_res + 1;
            }
        }
        return res;
    }
    public static void main(String args[])
    {
        int coins[] =  {9, 6, 5, 1};
        int length = coins.length;
        int value = 11;
        System.out.println("Minimum coins required is "+ minCoins(coins, length, value) );
    }
}

