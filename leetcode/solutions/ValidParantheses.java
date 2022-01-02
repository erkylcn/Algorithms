package leetcode.solutions;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParantheses {
    public static void main(String[] args) {
        
        System.out.println(new ValidParantheses().isValid("]"));
    }

    public boolean isValid(String s) {
    
        Map<String, String> close = new HashMap<>();
        close.put("]","[");
        close.put(")","(");
        close.put("}","{");

        Stack<String> stack = new Stack<>();
        char [] toCharArray = s.toCharArray();
        for(int i = 0;i<toCharArray.length;i++){
            String key = String.valueOf(toCharArray[i]);
            if(close.get(key) == null){
                stack.push(key);
            }
            else if(close.get(key) != null){
                if(stack.size() == 0){
                    return false;
                }
                String popped = stack.pop();
                if(!popped.equals(close.get(key))){
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
