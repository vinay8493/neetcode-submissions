class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((a,b) -> b-a);
        for(int i=0; i<stones.length; i++){
            queue.add(stones[i]);
        }

        while(queue.size() != 1){
            int heaviestW = queue.poll();
            int secondHeaviestW = queue.poll();
            int weightAfterCollision = Math.abs(heaviestW-secondHeaviestW);
            queue.add(weightAfterCollision);
        }

        return queue.peek();
    }
}
