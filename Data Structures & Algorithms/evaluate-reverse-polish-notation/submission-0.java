class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> operands = new Stack<>();

        for(int i = 0; i < tokens.length; i++){
            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") ||
            tokens[i].equals("/")){
                int operandOne = operands.pop();
                int operandTwo = operands.pop();
                int result = performOperation(operandTwo, operandOne,tokens[i]);
                operands.push(result);
            }else{
                operands.push(Integer.parseInt(tokens[i]));
            }
        }
         return operands.peek();
    }
    private int performOperation(int operand1, int operand2, String operator){
        if(operator.equals("+")){
            return operand1 + operand2;
        }
        else if(operator.equals("-")){
            return operand1 - operand2;
        }  else if(operator.equals("*")){
            return operand1 * operand2;
        }  else {
            return operand1 / operand2;
        }
    }
}
