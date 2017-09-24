
public class L413 {

	public int numberOfArithmeticSlices(int[] A) {
	    int curr = 0, sum = 0;
	    for (int i=2; i<A.length; i++)
	        if (A[i]-A[i-1] == A[i-1]-A[i-2]) {
	            curr += 1;
	            sum += curr;
	        } else {
	            curr = 0;
	        }
	    return sum;
	}
	public static void main(String[] args) {
	
		L413 l = new L413();
		int nums[] = {1,2,3,4,6,7,8,9,10};
		System.out.println(l.numberOfArithmeticSlices(nums));
	}
}
