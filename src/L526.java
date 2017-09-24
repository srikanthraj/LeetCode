import java.util.Arrays;

public class L526 {

	int count = 0;
	int findArrangements(int n) {
	
	
		int a[] = new int[n];
		
		for(int i=0;i<n;i++)
			a[i] = i+1;
		
		permute(a,0);
		
		return count;
	}
	
	void swap(int [] a, int i, int j) {
		
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	void permute(int[] a, int pos) {
		
		if(pos == a.length){
			System.out.println(Arrays.toString(a));
			count++;
			
		}
		for(int i = pos;i<a.length;i++) {
			
			swap(a,i,pos);
			if(((a[pos] % (pos+1) == 0) || ((pos+1) % a[pos] == 0)))
			permute(a,pos+1);
			swap(a,i,pos);
		}
	}
	
	public static void main(String[] args) {
		
		L526 l = new L526();
		
		int n = 6;
		
		System.out.println(l.findArrangements(n));
	}
}
