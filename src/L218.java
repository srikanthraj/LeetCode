import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;

class BuildingPoint {
	
	int x;
	int height;
	boolean isStart;
	
	BuildingPoint(int x, int height, boolean isStart) {
		
		this.x = x;
		this.height = height;
		this.isStart = isStart;
	}
}
public class L218 {

	 public List<int[]> getSkyline(int[][] buildings) {
	        
		 int index =0;
		 
		 List<int[]> al = new ArrayList<int[]>();
		 
		 BuildingPoint[] bpArray = new BuildingPoint[buildings.length*2];
		 for(int[] building:buildings) {
			 
			 //Start
			 BuildingPoint bpStart = new BuildingPoint(building[0],building[2],true);
			 bpArray[index++] = bpStart;
			 
			 // End
			 
			 BuildingPoint bpEnd = new BuildingPoint(building[1],building[2],false);
			 bpArray[index++] = bpEnd;
			 
		 }
		 
		 
		 Arrays.sort(bpArray,new Comparator<BuildingPoint>() {
			 

			@Override
			public int compare(BuildingPoint o1, BuildingPoint o2) {
				
				if((o1.x == o2.x) && o1.isStart && !o2.isStart){
					
					
					return -1;
				}
				
				if((o1.x == o2.x) && !o1.isStart && o2.isStart){
					
					return 1;
				}
				
				if((o1.x == o2.x) && o1.isStart && o2.isStart)
					return o2.height - o1.height;
				
				if((o1.x == o2.x) && !o1.isStart && !o2.isStart)
					return o1.height - o2.height;
				
				
				
				
				
				
						return o1.x - o2.x;
				
			}
		});
		
		 
		 System.out.println("After Sort");
		 for(int i =0;i<bpArray.length;i++){
			 
			 System.out.println(bpArray[i].x + " , " + bpArray[i].height + " , "+bpArray[i].isStart);
			 
		 }
		 
		 
		 TreeMap<Integer, Integer> tm = new TreeMap<Integer,Integer>();
		 
		 tm.put(0, 1);
		 
		 for(BuildingPoint bp: bpArray) {
		 
			 if(bp.isStart) {
				
				 if(tm.lastKey() < bp.height) {
					 tm.put(bp.height, 1);
					 int[] num = new int[2];
					 num[0] = bp.x;
					 num[1] = bp.height;
					 al.add(num);
				 }
				 
				 else {
					 
					 tm.put(bp.height, tm.getOrDefault(bp.height, 0)+1);
				 }
			 }
			 
			 else {
				 
				 if(bp.height < tm.lastKey()) {
					 
					 if(tm.get(bp.height) == 1)
						 tm.remove(bp.height);
					 
					 else
						 tm.put(bp.height, tm.get(bp.height)-1);
				 }
				 
				 else {
					 
					 if(tm.get(bp.height) == 1){
						 tm.remove(bp.height);
						 int[] num = new int[2];
						 num[0] = bp.x;
						 num[1] = tm.lastKey();
						 al.add(num);
					 }
					 
					 else
						 tm.put(bp.height, tm.get(bp.height)-1);
						 
				 }
				 
			 }
		 }
		 
		 
		 return al;
	  }
	 
	public static void main(String[] args) {
		
		L218 l = new L218();
		//int buildings[][] = {{2,9,10},{3,7,15},{5,12,12},{15,20,10},{19,24,8}};
		int buildings[][] = {{0,2,3},{2,5,3}};
		List<int[]> al = l.getSkyline(buildings);
		
		for(int[] res:al) {
			
			System.out.println("("+res[0] +"," +res[1]+")");
		}
	}
}
