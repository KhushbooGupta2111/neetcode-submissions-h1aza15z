class Solution {
    public int calPoints(String[] operations) {
        int totalPoints = 0;

        Stack<Integer> stack = new Stack<>();
        
        for(String operation : operations){
            if(operation.equals("+")){
                    int top = stack.pop();
                    int newTop = top + stack.peek();
                    stack.push(top);
                    stack.push(newTop);
                    totalPoints += newTop;
            }
            else if(operation.equals("C")){
                totalPoints -= stack.pop();
                
            }
            else if(operation.equals("D")){
                stack.push(2*stack.peek());
                totalPoints += stack.peek();

            }else{
                stack.push(Integer.parseInt(operation));
                totalPoints += stack.peek();
            }
        }

        return totalPoints;
    }
}