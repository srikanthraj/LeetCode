
public class L605 {

public boolean canPlaceFlowers(int[] a, int n) {
        
        if(a == null || a.length ==0)
        return false;
        
        int count = 0;
        int countA = 0;
        int countB = 0;
        int i =0;
        
        
        if(a.length == 1)
        {
            
            if(a[i] == 0) 
            count++;
            
            else
            return false;
            
        }
        
        else {
            
        while(i < a.length) {
            
            if((a[i] == 0 && i >0 && a[i-1] == 1) || (a[i] == 0 && i < a.length-1 && a[i+1] == 1))
                a[i] = -1;
            
            else if (i ==0 && a[i] == 0)
            {
                if(a[i+1] ==1)
                a[i] = -1;
            }
            
            i++;
        }
        
        for(i =0;i < a.length;i += 2){
       
        	System.out.print(a[i]+"\t");
	        if(a[i] == 0)
	        countA++;
	        if(i < a.length -1 && a[i+1] == 0)
	        countB++;
	        
        }
        
        count = Math.max(countA,countB);
        
       }
        return count >= n;
    }

	public static void main(String[] args) {
		
		L605 l = new L605();
		
		int[] a= {1,0,0,0,1};
		int n = 2;
		System.out.println(l.canPlaceFlowers(a, n));
	}
}
