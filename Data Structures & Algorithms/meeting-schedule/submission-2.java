/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        Collections.sort(intervals, (a,b) -> a.end-b.end);
        int endtime=0;
        for(Interval i : intervals){
            if(i.start >= endtime){
                endtime = i.end;
                continue;
            }
            return false;
        }
        return true;

    }
}
