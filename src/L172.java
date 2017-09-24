
public class L172 {

public int trailingZeroes(int n) {
        

	return n == 0 ? 0 : n / 5 + trailingZeroes(n / 5);
}

	public static void main(String[] args) {
		
		L172 l = new L172();
		System.out.println(l.trailingZeroes(5));
	}
}
