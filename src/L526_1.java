import java.util.Arrays;

public class L526_1 {

	int count = 0;
    public int countArrangement(int N) {
        boolean[] visited = new boolean[N + 1];
        calculate(N, 1, visited);
        return count;
    }
    public void calculate(int N, int pos, boolean[] visited) {
        if (pos > N){
            count++;
            return;
        }
        for (int i = 1; i <= N; i++) {
            if (!visited[i] && (pos % i == 0 || i % pos == 0)) {
                visited[i] = true;
                calculate(N, pos + 1, visited);
                visited[i] = false;
            }
        }
    }
	
	public static void main(String[] args) {
		
		L526_1 l = new L526_1();
		
		int n = 4;
		
		System.out.println(l.countArrangement(n));
	}
}
