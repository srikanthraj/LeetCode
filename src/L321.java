import java.util.Arrays;

public class L321 {

	int[] findSol(int[]a, int[] b , int k) {
		
		int indexA = -1;
		int indexB = -1;
		int lenrem = 6;
		
		int ci = 0;
		int lenA = a.length;
		int lenB = b.length;
		
		boolean aPicked = false;
		int indexPicked = -1;
		
		int res[] = new int[k];
		
		for(ci =0;ci<k;ci++)
		{
			lenrem = k-ci-1;
			
			// Pick from A
			int i = indexA+1;
			
			while(i < lenA && ((lenA-i-1)+(lenB-indexB-1) >= lenrem)){
				
				if(res[ci] < a[i])
				{
					res[ci] = a[i];
					
					aPicked = true;
					indexPicked = i;
					i++;
				}
				
				else i++;
				
				//i++;
			}
			
			
			//Pick from B
			
			int j = indexB+1;
			
			while(j < lenB && ((lenA-indexA-1)+(lenB-j-1) >= lenrem)){
				
				if(res[ci] < b[j])
				{
					res[ci] = b[j];
					
					aPicked = false;
					indexPicked = j;
					j++;
				}
				
				else if(res[ci] > b[j]) j++;
				
				else if(res[ci] == b[j]) {
					
					if(indexPicked >=j)
						indexPicked = j;
					j++;
				}
				//j++;
			}
			
			if(aPicked) 
				indexA = indexPicked;
			else
				indexB = indexPicked;
			
			System.out.println(indexA + "\t" + indexB);
		}
		
		return res;
	}
	public static void main(String[] args) {
		
		L321 l = new L321();
		int a[] = {8,9};
		int b[] = {3,9};
		int k =3;
		
		System.out.println(Arrays.toString(l.findSol(a,b,k)));
	}
}
