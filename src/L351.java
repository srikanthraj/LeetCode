
public class L351 {

	int[][] skip = new int[10][10];
	
	public int numberOfPatterns(int m, int n) {
    	
		skip[1][3]=skip[3][1]=2;
        skip[4][6]=skip[6][4]=5;
        skip[7][9]=skip[9][7]=8;
        skip[1][7]=skip[7][1]=4;
        skip[2][8]=skip[8][2]=5;
        skip[3][9]=skip[9][3]=6;
        skip[1][9]=skip[9][1]=skip[3][7]=skip[7][3]=5;
		
		
		boolean visited[] = new boolean[10];
		
		int res = 0;
		
		res += findSol(m,n,skip,visited,1,0) * 4;
		res += findSol(m,n,skip,visited,5,0);
		res += findSol(m,n,skip,visited,2,0) * 4;
		
    }

	int findSol(int m, int n , int[][]skip, boolean[] visited, int num) {
		
		
		visited[num]
	}
	public static void main(String[] args) {
		
		L351 l = new L351();
		
		System.out.println(l.numberOfPatterns(2, 3));
		
	}
	
}
