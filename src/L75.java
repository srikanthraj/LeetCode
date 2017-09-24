import java.util.Arrays;

public class L75 {

public void swap(int a[], int i , int j) {
	
	int temp = a[i];
	a[i] = a[j];
	a[j] = temp;
}

public void sortColors(int[] a) {
    
	
	int low = 0;
	int high = a.length-1;
	int mid = low;
	
	while(mid <= high)
	{
		
		if(a[mid] == 1)
			mid++;
		
		else if(a[mid] == 2)
		{
			swap(a,high,mid);
			high--;
			
		}
		
		else {
			swap(a,low,mid);
			low++;
			mid++;
		}
	}
}

	public static void main(String[] args) {
		
		L75 l = new L75();
		
		//int[] a= {1,0,1,0,2,0,0,1,2,0,1,2,0,0,1};
		//int[] a = {2,1,1};
		int [] a= {0};
		l.sortColors(a);
		System.out.println(Arrays.toString(a));
	}
}
