import java.util.List;
import java.util.ArrayList;

public class L251 {

	 int i ;
	 int j;
	 List<List<Integer>> al;
	 
	 public L251(List<List<Integer>> vec2d) {
		 i =0;
		 j =0;
		 
		 al = vec2d;
		 
	 }
	 
	 public int next() {
		 
		 return al.get(i).get(j++);
		 
	 }
	 
	 public boolean hasNext() {
		 
		 while(i < al.size()){
	            if(j < al.get(i).size())
	                return true;
	            else{
	                i++;
	                j = 0;
	            }
	        }
	        return false;
		 
	 }
	
	public static void main(String[] args) {
		
		
		 List<List<Integer>> al = new ArrayList<List<Integer>>();
		 
		 ArrayList<Integer> al1 = new ArrayList<Integer>();
		 ArrayList<Integer> al2 = new ArrayList<Integer>();
		 ArrayList<Integer> al3 = new ArrayList<Integer>();
		 
		 //al1.add(1);
		 //al1.add(2);
		 //al2.add(3);
		 al3.add(4);
		 //al3.add(5);
		 //al3.add(6);
		 al.add(al1);
		 //al.add(al2);
		 al.add(al3);
		 
		 L251 i = new L251(al);
		 
		// System.out.println(i.hasNext());
		 while(i.hasNext())
			 System.out.println(i.next());
		
		 
	}
}
