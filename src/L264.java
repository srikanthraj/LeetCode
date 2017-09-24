import java.util.TreeSet;

public class L264 {

	public boolean isUgly(TreeSet<Integer> ts , int j) {
        
        int num = j;
        
            if(j%2 == 0) 
                j = j/2;
            
            
            else if(j%3 == 0) 
                j = j/3;
                
            
            else if(j%5 == 0) 
                j = j/5;
                
            if (ts.contains(j))        
            {
                //ts.add(num);
                return true;
            } 
                return false;
    }

public int nthUglyNumber(int n) {
    
    if(n == 1)
        return 1;
    
    int temp = 2;
    
    TreeSet<Integer> ts = new TreeSet<Integer>();
    ts.add(1);
    
    int current = 2;
    
    
    while(ts.size() < n) {
        
        
        if(isUgly(ts,current))
        ts.add(current);
        
        current++;
    }
    
    return ts.last();
    
}

public static void main(String[] args) {
	
	L264 l = new L264();
	System.out.println(l.nthUglyNumber(1690));
}
}
