import java.util.TreeMap;

public class Experiment {

	public static void main(String[] args) {
		
		TreeMap<Integer,Integer> tm = new TreeMap<Integer,Integer>();
		
		tm.put(10,1);
		tm.put(9,1);
		tm.put(8,1);
		tm.put(7,1);
		Integer val = tm.floorKey(5);
		System.out.println(val);
	}
}
