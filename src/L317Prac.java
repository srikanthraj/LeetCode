import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;

class Tuple {
    int x;
    int y;
    int dist;
    
    Tuple(int x, int y, int dist) {
        
        this.x = x;
        this.y = y;
        this.dist = dist;
    }
}

public class L317Prac {

int[][] dirs = {{0,-1},{0,1},{1,0},{-1,0}};
    
    public int shortestDistance(int[][] grid) {
    
        int m = 0;
        int n =0;
        
        m = grid.length;
        
        if(grid == null || m == 0)
            return 0;
            n = grid[0].length;
        
        ArrayList<Tuple> al = new ArrayList<Tuple>();
        
        int[][] dist = new int[m][n];
        
        for(int i =0;i<m;i++) {
            
            for(int j =0;j<n;j++) {
                
                if(grid[i][j] == 1)
                    al.add(new Tuple(i,j,0));
                
                grid[i][j] = -grid[i][j];
            }
        }
        
       int k =0;
        for(k =0;k< al.size();k++){
        
        	
            bfs(grid,dist,k,al,m,n);
            
            /*
            System.out.println("From Building  :" + (k+1));
            System.out.println("Grid : ");
            for (int i = 0; i < m; ++i)
            	System.out.println(Arrays.toString(grid[i]));
            
            System.out.println("Dist : ");
            for (int i = 0; i < m; ++i)
            	System.out.println(Arrays.toString(dist[i]));
            	*/
            
        }
        
        //System.out.println(k);
        int ans = -1;
        
        for(int i =0;i<m;i++)
            
            for(int j =0;j<n;j++)
                
                if(grid[i][j] == k && (ans < 0 || (ans > dist[i][j])))
               	ans = dist[i][j];

        
        return ans;
    }
    
    void bfs(int[][]grid, int[][]dist, int k, ArrayList<Tuple> al,int m , int n) {
        
        Queue<Tuple> q = new ArrayDeque<Tuple>();
        q.add(al.get(k));
        //System.out.println(al.get(k).x + "\t" + al.get(k).y + "\t" + al.get(k).dist);
        
        while(!q.isEmpty()) {
            
            Tuple t = q.poll();
            //System.out.println(t.x + "\t" + t.y + "\t" + t.dist);
            int x = t.x;
            int y = t.y;
            dist[x][y] += t.dist;
            
            for(int i =0;i<4;i++) {
                
                int neighX = x + dirs[i][0];
                int neighY = y + dirs[i][1];
                
                if(neighX >=0 && neighX < m && neighY >=0 && neighY < n && grid[neighX][neighY] == k){
                    grid[neighX][neighY] = k+1;
                    q.add(new Tuple(neighX,neighY,t.dist+1));
                }
            }
        }
    }
	
	public static void main(String[] args) {
		
		L317Prac l = new L317Prac();
	
		int [][] grid = {{1,0,2,0,1},{0,0,0,0,0},{0,0,1,0,0}};
		
		System.out.println(l.shortestDistance(grid));
		
	}
}
