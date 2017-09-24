import java.util.ArrayList;

class Point {
	int x ;
	int y;
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class CCIRobotGrid {
	
ArrayList<Point> res = null;

boolean isSafe(int m , int n , int x, int y) {
	
	return (x>=0 && x<=m && y >=0 && y<=n);
}
	void findPath(char[][] mat, int m , int n, int x, int y,ArrayList<Point> al) {
		
		al.add(new Point(x,y));
		
		if(x == m && y == n) {
			
			if(res == null){
				//al.add(new Point(x,y));
				res = new ArrayList<Point>(al);
			}
			return;
		}
		
		if(res == null){
		
		if(isSafe(m,n,x+1,y) && mat[x+1][y] != 'x')
			findPath(mat,m,n,x+1,y,al);
		
		if(isSafe(m,n,x,y+1) && mat[x][y+1] != 'x')
			findPath(mat,m,n,x,y+1,al);
		
		if(al.size() >0)
			al.remove(al.size()-1);
		}
	}

	public static void main(String[] args) {
		
		CCIRobotGrid c = new CCIRobotGrid();
		char [][]mat = {{'o','o','x','o'},{'o','o','o','o'},{'o','o','o','x'},{'o','x','o','o'},{'o','x','x','o'}};
		
		c.findPath(mat,4,3,0,0,new ArrayList<Point>());
		
		if(c.res == null)
			System.out.println("No Paths Exist");
		
		else {
		for(Point p:c.res)
		System.out.println(p.x + "," + p.y);
		}
			
	}
}
