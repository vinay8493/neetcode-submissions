class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int max = 0;
        for(int i=0; i<piles.length; i++){
            max = Math.max(max, piles[i]);
        }
        int low = 1;
        int high = max;

        while(low <= high){
            int mid = (low+high)/2;
            int hours = calculateHours(piles, mid);
            if(hours <= h){
                high = mid-1;
            }else if(hours > h){
                low = mid+1;
            }
        }

        return low;
        
    }

    private int calculateHours(int[] piles, int hourlyRate){
        int totalHours = 0;
        for(int i=0; i<piles.length; i++){
            totalHours += Math.ceil((double)piles[i]/hourlyRate);
        }
        return totalHours;
    }
}
