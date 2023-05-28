import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println(isValid("(){}"));
    }

    static Boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        char[] arr = s.toCharArray();

        for (char i : arr) {
            if(i == '('){
                stack.push(')');
            }

           else if(i == '{'){
                stack.push('}');
            }

           else if(i == '['){
                stack.push(']');
            }

            else if(i != stack.pop()){
                return false;
            }
        }

        return stack.isEmpty();
    }
}
