import java.util.*;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {

            // TODO: if c is an opening bracket, push it
            if(c=='(' || c=='[' || c=='{'){
                stack.push(c);
            }
         
            else if(c==')' || c==']' || c=='}'){
                if (stack.isEmpty()){
                    return false;
                }
                char top = stack.peek();
                if ((c==')' && top=='(') || (c==']' && top=='[') || (c=='}' && top=='{')){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
            else{
                return false;
            }
            //         if stack is empty OR top doesn't match -> return false
        
        }

        return stack.isEmpty();
        
        // TODO: return whether stack is empty
    }
    
    public static void main(String[] args) {
        System.out.println(isValid("{()[}"));
        System.out.println(isValid("{()[]}"));
        System.out.println(isValid("[]{}({})"));

    }
}