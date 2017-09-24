import java.util.TreeSet;

public class test {

	public static void main(String[] args) {
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		ts.add(1);
		ts.add(2);
		ts.add(3);
		ts.add(4);
		ts.add(5);
		ts.add(6);
		//ts.add(8);
		System.out.println(ts.contains(8));
		System.out.println(ts.last());
	}
}
