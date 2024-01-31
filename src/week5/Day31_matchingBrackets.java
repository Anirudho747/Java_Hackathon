package week5;

import java.util.Stack;

public class Day31_matchingBrackets {

    static String str12 = "()";
    static String str13 = "()[]{}";
    static String str1 = "(}";
    static Stack<Character> stack = new Stack<Character>();


    public static void main(String[] args) {

        System.out.println(checkBrackets());

    }

    static boolean checkBrackets()
    {
        for (char c : str1.toCharArray()) {
            // If the character is an opening bracket, push it onto the stack
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else { // If the character is a closing bracket
                // If the stack is empty, there is no matching opening bracket, so return false
                if (stack.isEmpty()) {
                    return false;
                }
                // Otherwise, get the top of the stack and check if it's the matching opening bracket
                char top = stack.peek();
                if ((c == ')' && top == '(') || (c == ']' && top == '[') || (c == '}' && top == '{')) {
                    // If it is, pop the opening bracket from the stack
                    stack.pop();
                } else { // Otherwise, the brackets don't match, so return false
                    return false;
                }
            }
        }
        // If the stack is empty, all opening brackets have been closed, so return true
        // Otherwise, there are unmatched opening brackets, so return false
        return stack.isEmpty();

    }
}
