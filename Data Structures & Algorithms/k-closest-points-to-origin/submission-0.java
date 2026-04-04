class Solution {
    int findDistanceFromOrigin(int [] point){
        return ((point[0]-0)*(point[0]-0)) + ((point[1]-0)*(point[1]-0));
    }
    public int[][] kClosest(int[][] points, int k) {
       PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b) -> findDistanceFromOrigin(b)- findDistanceFromOrigin(a));

       for(int [] point : points){
        maxHeap.offer(point);
        if(maxHeap.size() > k){
            maxHeap.poll();
        }
       }

       int[][] res = new int[k][2];
       int i  = 0;
       while(!maxHeap.isEmpty()){
        res[i++] = maxHeap.poll();
       }

       return res;



    }
}
