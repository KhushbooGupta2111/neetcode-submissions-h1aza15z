class Solution {
    public boolean hasDuplicate(int[] nums) {
      Set<Integer> numbersSet = new HashSet<>();
      for(int i = 0; i < nums.length; i++){
        if(numbersSet.contains(nums[i])){
            return true;
        }
        numbersSet.add(nums[i]);
      }
      return false;
    }
}