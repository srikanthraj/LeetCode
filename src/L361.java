
public class L361 {

int calcRow(char[][] grid, int row, int col) {
        
        int res =0;
        for(int j =col;j<grid[0].length && grid[row][j] != 'W';j++) 
            if(grid[row][j] == 'E')
                res++;
        
        return res;
    }
    
    int calcCol(char[][] grid, int row, int col) {
        
        int res =0;
        for(int i =row;i<grid.length && grid[i][col] != 'W';i++) 
            if(grid[i][col] == 'E')
                res++;
        
        return res;
    }
    
    public int maxKilledEnemies(char[][] grid) {
    
        if(grid == null || grid.length == 0 ||  grid[0].length == 0) return 0;
        int row = 0;
        int[] col = new int[grid[0].length];
        int max =0;
        for(int i =0;i<grid.length;i++) {
            
            for(int j =0;j<grid[0].length;j++) {
                
                if(grid[i][j] == 'W')
                    continue;
                if(j==0 || grid[i][j-1] == 'W')
                    row = calcRow(grid,i,j);
                
                if(i ==0 || grid[i-1][j] == 'W')
                    col[j] = calcCol(grid,i,j);
                
                if(grid[i][j] == '0')
                max = Math.max(max,(row+col[j]));
            }
        }
        
        return max;
    }
	public static void main(String[] args) {
		
		L361 l = new L361();
		char[][] grid = {{'0','E','0','0'},{'E','0','W','E'},{'0','E','0','0'}};
		System.out.println(l.maxKilledEnemies(grid));
	}
}
