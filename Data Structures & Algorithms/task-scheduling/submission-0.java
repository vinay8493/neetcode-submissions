class Solution {
    public int leastInterval(char[] tasks, int n) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        int[] count = new int[26];
        for(char ch : tasks){
            count[ch-'A']++;
        }

        for(int task : count){
            if(task != 0)
            queue.add(task);
        }

        Queue<int[]> q = new LinkedList<>();
        int time=0;
        while(!queue.isEmpty() || !q.isEmpty()){
            time++;
            if(queue.isEmpty()){
                time = q.peek()[1];
            }else{
                int cnt = time+n;
                int task = queue.poll()-1;
                if(task > 0){
                    q.add(new int[]{task,cnt});
                }    
            }

            if(!q.isEmpty() && q.peek()[1] == time){
                queue.add(q.poll()[0]);
            }
        }
        return time;
    }
}
