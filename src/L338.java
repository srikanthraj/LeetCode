import java.util.Arrays;

public class L338 {

	public int[] countBits(int num) {
	    int[] f = new int[num + 1];
	    for (int i=1; i<=num; i++) f[i] = f[i >> 1] + (i & 1);
	    return f;
	}
	
	public static void main(String[] args) {
		
		L338 l = new L338();
		
		//System.out.println(Arrays.toString(l.countBits(5)));
		System.out.println(5>>1);
	}
}
