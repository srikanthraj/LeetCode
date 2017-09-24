import java.util.Arrays;

public class L259 {

	public int threeSumSmaller(int[] a, int target) {	
	int res = 0;
	
	for(int i =0;i<a.length-2;i++) {
		int k = a.length-1;
		int j = i+1;
		while(j<k) {
			
			//System.out.println("a[i] = " + a[i] + " a[j] = "+ a[j] + " a[k] = "+ a[k]);
			int sum = a[i] + a[j] + a[k];
			
			if (sum < target) {
				res += j-i;
				j++;
			}
			
			else
				k--;
		}
		
	}
	
	return res;
	}
	public static void main(String[] args) {
		L259 l = new L259();
		int a[]= {0,3,1,-2};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println(l.threeSumSmaller(a, 4));
	}
}
