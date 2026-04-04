class Solution {
    public boolean hasDuplicate(int[] nums) {
      Set<Integer> numbersSet = new HashSet<>();
      for(int i : nums){
        if(!numbersSet.add(i)){
            return true;
        }
      }
      return false;
    }
}