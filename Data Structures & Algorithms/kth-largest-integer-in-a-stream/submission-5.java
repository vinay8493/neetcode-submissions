class KthLargest {
    PriorityQueue<Integer> minHeap;
    int k;

    KthLargest(int k, int[] nums){
        this.minHeap = new PriorityQueue<>((a,b) -> (a-b));
        this.k = k;
        for(int n : nums){
            add(n);
        }
    }

    int add(int val){
        minHeap.add(val);
        if(minHeap.size() > k){
            minHeap.poll();
        }
        return minHeap.peek();
    }
}
