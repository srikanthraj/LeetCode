
public class L277 {

	int knows[][] = {{0,1,1,1,1},{0,0,0,0,0},{0,1,0,0,0},{0,1,0,0,1},{1,1,0,0,0}};
	
	public int findCelebrity(int n) {
        int candidate = 0;
        for(int i = 1; i < n; i++){
            if(knows[candidate][i] == 1)
                candidate = i;
        }
        
        System.out.println(candidate);
        for(int i = 0; i < n; i++){
            if(i != candidate && (knows[candidate][i] == 1 || knows[i][candidate] == 0)) return -1;
        }
        return candidate;
    }
	
	public static void main(String[] args) {
		
		L277 l = new L277();
		System.out.println(l.findCelebrity(5));
	}
}
