class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int i  = 0;

        while (i < matrix.length){

            int []arr = matrix[i];
            if(targetFound(arr,target)){
                return true;
            }
            i++;   
        }
        return false;
    }

    private boolean targetFound(int []arr, int target){
        int l  = 0;
        int r = arr.length-1;
        while(l <= r){
            int mid = l + (r-l)/2;
            if(arr[mid]==target){
                return true;
            }
            if(arr[mid] > target){
                r = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return false;
    }
}
