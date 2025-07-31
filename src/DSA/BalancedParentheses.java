package DSA;

import java.util.Stack;

public class BalancedParentheses {
    private static boolean isBalanced(String str) {
        char[] a = str.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char ch : a) {
            if (ch == '[' || ch == '{' || ch == '(') {
                stack.push(ch);
            } else if (ch == ']' || ch == '}' || ch == ')') {
                if(stack.isEmpty())
                {
                    return false;
                }
                char poppedChar = stack.pop(); // remove the top char as stack follow LIFO
                if(ch==']' && poppedChar!='[' || ch=='}' && poppedChar!='{' || ch==')' && poppedChar!='(')
                {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String args[])
    {
       System.out.println( BalancedParentheses.isBalanced("[{()}]")) ;
        System.out.println( BalancedParentheses.isBalanced("[{({)}]")) ;
    }
}
