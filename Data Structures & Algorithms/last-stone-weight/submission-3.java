class Solution {
    public int lastStoneWeight(int[] stones) {
        
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)->(b-a));
    for(int i=0; i< stones.length; i++){
      maxHeap.offer(stones[i]);
    }
    while(maxHeap.size() > 1){
      int largestStone = maxHeap.poll();
      int secondLargest = maxHeap.poll();
      if(largestStone-secondLargest >= 0){
        maxHeap.add(largestStone-secondLargest);
      }
    }
    return maxHeap.peek();  
    }
}
