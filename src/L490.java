import java.util.LinkedList;
import java.util.Queue;

public class L490 {

	class Point{
		
		int x;
		int y;
		
		Point(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
	
	int[][] dirs = {{0,-1},{0,1},{-1,0},{1,0}};
	
	public boolean hasPath(int[][] maze, int[] start, int[] dest) {
    
		if(maze == null || maze.length ==0)
			return false;
		
		int m = maze.length;
		int n = 0;
		
		if(m >0)
			n = maze[0].length;
		
		boolean[][] vis = new boolean[m][n];
		return bfs(maze,vis,m,n,start[0],start[1],dest[0],dest[1]);
		
    }

	
	boolean bfs(int[][]maze, boolean[][] vis, int m, int n, int i, int j, int dX, int dY) {
		
		Queue<Point> q = new LinkedList<Point>();
		q.add(new Point(i,j));
		
		while(!q.isEmpty()) {
			
			Point p = q.poll();
			
			//if(p.x == dX && p.y == dY)
				//return true;
			
			for(int k =0;k<dirs.length;k++){
				
				int x = p.x;
				int y = p.y;
				
				while(x >=0 && x<m && y >=0 && y<n && maze[x][y] == 0)
				{
					x = x+dirs[k][0];
					y = y+dirs[k][1];
				}
				
				// go back one step when hit by a Block
				x = x-dirs[k][0];
				y = y-dirs[k][1];
				
				if(vis[x][y])
					continue;
				
				vis[x][y] = true;
				
				if(x == dX && y == dY)
					return true;
				
				q.add(new Point(x,y));
				
			}
			
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		
		L490 l = new L490();
		int[][] maze = {{0,0,1,0,0},{0,0,0,0,0},{0,0,0,1,0},{1,1,0,1,1},{0,0,0,0,0}};
		int [] start = {0,4};
		int dest[] = {4,4};
		
		String s = "012";
		boolean res = s.startsWith("0") && s.length() >1;
		System.out.println(res);
		System.out.println(l.hasPath(maze, start, dest));
	}
}
