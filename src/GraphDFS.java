import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class G {

	int V;
	HashMap<Integer,List<Integer>> adj;
	
	
	G(int v) {
		this.V = v;
		adj = new HashMap<Integer,List<Integer>>();
	}

	void addEdge(int u, int v) {
		
		
		if(adj.containsKey(u)) 
			adj.get(u).add(v);
			
		
		else
		{
			List<Integer> al = new ArrayList<Integer>();
			al.add(v);
			adj.put(u, al);
		}
		
		
	}
	
	void depthTraversal(int s) {
		
		boolean [] visited = new boolean[V];
		
		
			dfTraversalUtil(s,visited);
		
	}
	
	void dfTraversalUtil(int u , boolean[] visited) {
		
		visited[u] = true;
		System.out.print(u);
	
		
			if(!adj.containsKey(u))
				return;
		
			
		for(int i =0;i<adj.get(u).size();i++) {
			if(!visited[adj.get(u).get(i)]) {
			dfTraversalUtil(adj.get(u).get(i),visited);
			//System.out.println();
			}
			
		}
	}
	
	void breadthTraversal(int s) {
		
		boolean [] visited = new boolean[V];
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.add(s);
		
		
		while(!q.isEmpty()) {
			
			
			int u = q.poll();
			visited[u] = true;
			System.out.print(u + "\t");
			
			for(int num:adj.get(u))
			{
				if(!visited[num] && !q.contains(num))
				q.add(num);
			}
		}
	}
	
}



public class GraphDFS {

	
	
	boolean hasPath(int s, int d) {
		
		return false;
	}
	
	public static void main(String[] args) {
		
		GraphDFS gd = new GraphDFS();
		
		List<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		
		al.ge
		
		G g = new G(4);
		 	g.addEdge(0, 1);
	        g.addEdge(0, 2);
	        g.addEdge(1, 2);
	        g.addEdge(2, 0);
	        g.addEdge(2, 3);
	        g.addEdge(3, 3);
		System.out.println(g.adj);
		//g.depthTraversal(0);
		g.breadthTraversal(0);
		//System.out.println(g.adj);

	}
}
