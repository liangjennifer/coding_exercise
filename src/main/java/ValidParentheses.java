import java.util.Stack;

/**
 * Created by jliang1 on 10/11/17.
 *
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

 The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.


 */
public class ValidParentheses {

    public boolean isValid(String s) {

        Stack myStack = new Stack();

        if (s.length() % 2 == 1)
            return false;

        for (int i = 0; i < s.length(); i++ ) {
            if (s.charAt(i) == '{' || s.charAt(i) == '(' ||s.charAt(i) == '[') {
                myStack.push(s.charAt(i));
            } else if (s.charAt(i) == ']' && !myStack.empty() && myStack.peek() == Character.valueOf('['))
                myStack.pop();
            else if ( s.charAt(i) == ')' && !myStack.empty() &&myStack.peek() == Character.valueOf('('))
                myStack.pop();
            else if (s.charAt(i) == '}'&& !myStack.empty() &&myStack.peek() == Character.valueOf('{'))
                myStack.pop();
            else
                return false;


        }

        if (myStack.empty())
            return true;
        else
            return false;
    }
}
