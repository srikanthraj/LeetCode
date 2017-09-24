
public class DiviBy7 {

	boolean isDiviBy7(int num) {
		
		if(num < 0)
			return isDiviBy7(-1 * num);
		
		if(num == 0 || num == 7)
			return true;
		
		if(num < 10)
			return false;
		
		return(isDiviBy7(num/10 - 2 * (num - (num/10 * 10))));
	}
	public static void main(String[] args) {
		
		DiviBy7 d = new DiviBy7();
		System.out.println(d.isDiviBy7(41));
	}
}
