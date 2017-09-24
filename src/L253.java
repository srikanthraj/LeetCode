import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class IntervalComp implements Comparator<Interval> {
	
	public int compare(Interval i1, Interval i2) {
		
		if(i1.start == i2.start)
			return (i1.end - i2.end);
		
		return (i1.start - i2.start);
	}
}

class Interval
{
	int start;
	int end;
	
	Interval() {
		start = 0;
		end  = 0;
	}
	
	Interval(int start, int end) {
		this.start = start;
		this.end = end;
	}
}


public class L253 {

	public int minMeetingRooms(Interval[] intervals) {
		
		Arrays.sort(intervals,new IntervalComp());
        
		
        
		int count =0;
		
		
		
        PriorityQueue<Interval> pq = new PriorityQueue<Interval>(1000,new Comparator<Interval>()
        {  
    
                public int compare(Interval i1, Interval i2) {                         
                    if (i1.end < i2.end) return -1;
                    if (i1.end > i2.end) return 1;
                    return 0;
                }      
            });  
        
        
        
        for(int i =0;i<intervals.length;i++) {
            
            while(! pq.isEmpty() && intervals[i].start >= pq.peek().end)
                pq.poll();
            pq.add(intervals[i]);
                count = Math.max(count,pq.size());
        }
        
		return count;
	}
	public static void main(String[] args) {
		
		L253 l = new L253();
	
		
		Interval i1 = new Interval(1,5);
		Interval i2 = new Interval(8,9);
		Interval i3 = new Interval(8,9);
		
		Interval[] intervals = {i1,i2,i3};
		
		System.out.println(l.minMeetingRooms(intervals));
		
			
	}
}
