import java.util.Arrays;

public class L16 {

public int threeSumClosest(int[] a, int target) {
        
	
	int min = Integer.MAX_VALUE;
	int res = 0;
	
	for(int i =0;i<a.length-2;i++) {
		int k = a.length-1;
		int j = i+1;
		while(j<a.length-1&&j<k) {
			
			//System.out.println("i = " + i + " j = "+ j + "k = "+k);
			int sum = a[i] + a[j] + a[k];
			if(Math.abs(sum- target) < min){
				min = Math.abs(sum - target);
				res = sum;
			}
			if(sum == target && target == 0)
				return sum;
			
			else if (sum < target)
				j++;
			
			else
				k--;
		}
		
	}
	
	return res;
   }


	public static void main(String[] args) {
		
		L16 l = new L16();
		int a[]= {0,2,1,-3};
		Arrays.sort(a);
		System.out.println(l.threeSumClosest(a, 1));
	}
	
}
