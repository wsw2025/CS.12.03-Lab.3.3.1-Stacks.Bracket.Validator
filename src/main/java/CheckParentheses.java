import java.util.Stack;

public class CheckParentheses {

    // Method called checkValidParentheses that returns a boolean indicating whether a string of brackets is valid or not.
    public static boolean checkValidParentheses(String expression) {

        // Obtain an array of the brackets (each element is a single bracket).
        char a[] = new char[200];
        for (int i = 0; i < expression.length(); i++){
            a[i]=expression.charAt(i);
        }

        // Create a stack.
        Stack<Character> s = new Stack<Character>();
        // Iterate over the array of brackets.
            for (int i = 0; i < expression.length(); i++){
                char c = a[i];
                if(c=='{' || c=='[' || c=='('){
                    s.push(c);
                }else{
                    if(s.empty()) return false;
                    if(c=='}' && s.peek()=='{'|| c==']' && s.peek()=='['|| c==')' && s.peek()=='('){
                        s.pop();
                    }else{
                        s.push(c);
                    }
                }
            }
            // Obtain the reversed version of bracket.

            // Check if the bracket is an opening bracket. If it is, push it onto the stack.

            // If the stack is empty or if the popped bracket is not equal to the reverse bracket of the current bracket, return false as this must mean that the expression is invalid.
        if(s.empty()) return true;
        // If the stack is empty after we have finished iterating over the array of brackets, then return true as this must mean that the expression is valid. If the stack is not empty, this must mean that the expression is invalid.
        return false;

    }

    // Private helper method called isLeftBracket that returns a boolean value to indicate whether the bracket is a left (opening) bracket.
    private static boolean isLeftBracket(String bracket) {

        return false;

    }

    // Private helper method called getReversedBracket that returns a String which is the reverse version of the bracket passed to the method.
    private static String getReversedBracket(String bracket) {

        return null;

    }
}
