package Java.DataStructures.Medium;

import java.util.Scanner;
import java.util.Stack;

public class JavaStacks {
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input=sc.next();
            //Complete the code
            System.out.println(areBalanced(input));
        }
        sc.close();
    }
    static boolean areBalanced(String s){
        Stack<Character> stack = new Stack<>();
        //traverse through sentence
        for(int i = 0; i < s.length(); i++){
            char t = s.charAt(i);
            if(t == '(' || t == '[' || t == '{'){
                //add type to the stack
                stack.push(t);
                continue;
            }
            if(stack.isEmpty()){
                return false;
            }
            char checkType;
            switch(t){
                // check if beginning type matches if not return false
                case ')':
                    checkType = stack.pop();
                    if (checkType == '{' || checkType == '[' )
                        return false;
                    break;
                // check if beginning type matches if not return false
                case ']':
                    checkType = stack.pop();
                    if (checkType == '{' || checkType == '(' )
                        return false;
                    break;
                // check if beginning type matches if not return false
                case '}':
                    checkType = stack.pop();
                    if (checkType == '(' || checkType == '[' )
                        return false;
                    break;
            }
        }
        // return empty if so
        return stack.isEmpty();
    }
}
