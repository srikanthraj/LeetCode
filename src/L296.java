import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;

class Dim {
	
	int x;
	int y;
	int dist;
	
	Dim(int x, int y, int dist) {
		
		this.x = x;
		this.y = y;
		this.dist = dist;
	}
}

public class L296 {

	int [][]dirs = {{0,-1},{0,1},{-1,0},{1,0}};
	
	public int minTotalDistance(int[][] grid) {
    
		if(grid == null || grid.length ==0)
			return 0;
		
		int m = 0;
		int n =0;
		
		m = grid.length;
		
		if(m >0)
			n = grid[0].length;
		
		ArrayList<Dim> al = new ArrayList<Dim>();
		
		for(int i =0;i<m;i++){
			for(int j =0;j<n;j++) {
				
				if(grid[i][j] ==1)
					al.add(new Dim(i,j,0));
				
				grid[i][j] = -grid[i][j];
			}
		}
		
		int dist[][] = new int[m][n];
		int k =0;
		for(k =0;k<al.size();k++)
		{
			bfs(grid,dist,k,al,m,n);
			
			
			System.out.println("From Building  :" + (k+1));
	            System.out.println("Grid : ");
	            for (int i = 0; i < m; ++i)
	            	System.out.println(Arrays.toString(grid[i]));
	            
	            System.out.println("Dist : ");
	            for (int i = 0; i < m; ++i)
	            	System.out.println(Arrays.toString(dist[i]));
	            	
		}
		
		int ans = -1;
		
		for(int i =0;i<m;i++) {
			
			for(int j =0;j<n;j++) {
				
				if(grid[i][j] == k  && (ans < 0 || ans > dist[i][j]))
					ans = dist[i][j];
			}
		}
		
		return ans;
	}
	
	void bfs(int[][] grid, int[][]dist, int k, ArrayList<Dim> al,int m, int n) {
		
		Queue<Dim> q = new ArrayDeque<Dim>();
		q.add(al.get(k));
		
		while(!q.isEmpty()) {
			
			Dim d = q.poll();
			
			int x = d.x;
			int y = d.y;
			dist[x][y] += d.dist;
			
			for(int i =0;i<4;i++) {
				
				int neighX = x+dirs[i][0];
				int neighY = y+dirs[i][1];
				
				if(neighX >=0 && neighX < m && neighY >=0 && neighY <n && grid[neighX][neighY] == k)
				{
					grid[neighX][neighY] = k+ 1;
					int distance = Math.abs(d.x - neighX) + Math.abs(d.y - neighY);
					q.add(new Dim(neighX, neighY,distance));
				} 
			}
		}
		
	}

	public static void main(String[] args) {
		
		L296 l = new L296();
		int[][]grid = {{1,0,0,0,1},{0,0,0,0,0},{0,0,1,0,0}};
		System.out.println(l.minTotalDistance(grid));
		
	}
}
