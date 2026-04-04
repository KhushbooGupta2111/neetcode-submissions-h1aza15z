class Solution {
    public boolean isValid(String s) {
        
        boolean valid = true;

        Stack<Character> stack = new Stack<>();

        if(s.isEmpty()){
            return valid;
        }

        for(Character c : s.toCharArray()){
            if(c == ')' && !stack.isEmpty()){
                if(stack.peek() == '('){
                    stack.pop();
                }else{
                    return false;
                }
            }
            else if(c == '}' && !stack.isEmpty()){
                if(stack.peek() == '{'){
                    stack.pop();
                }else{
                    return false;
                }
            }
             else if(c == ']' && !stack.isEmpty()){
                if(stack.peek() == '['){
                    stack.pop();
                }else{
                    return false;
                }
            }else{
                stack.push(c);
            }
        }


        return stack.isEmpty();
    }
}
