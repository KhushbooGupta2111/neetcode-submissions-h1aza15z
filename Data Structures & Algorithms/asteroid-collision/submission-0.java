class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int asteroid : asteroids){
            boolean isDestroyed = false;

            while(!stack.isEmpty() && stack.peek() > 0 && asteroid < 0){
                if(stack.peek() < -asteroid){
                    stack.pop();
                }
                else if(stack.peek() == -asteroid){
                    stack.pop();
                    isDestroyed = true;
                    break;
                }else{
                    isDestroyed = true;
                    break;
                }
            }

            if(!isDestroyed){
                stack.push(asteroid);
            }
        }

        int []res = new int[stack.size()];
        for(int i = stack.size()-1; i >= 0; i--){
            res[i] = stack.pop();
        }
        return res;
    }
}