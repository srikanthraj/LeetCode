import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

class Graph {
	
	int V;
	HashMap<Integer,List<Integer>> adj = new HashMap<Integer,List<Integer>>(); 
	Graph(int V){
		this.V = V;
	}
	
	void addEdge(int u, int v){
		
		if(!adj.containsKey(u)) {
			
			ArrayList<Integer> al = new ArrayList<Integer>();
			al.add(v);
			adj.put(u, al);
		}
		
		else
			adj.get(u).add(v);
	}
	
	List<List<Integer>> findPaths(int u, int v) {
		
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		
		if(u == v) {
			
			List<Integer> al = new ArrayList<Integer>();
			al.add(u);
			res.add(al);
			return res;
		}
		
		boolean [] visited = new boolean[V];
		
		findAllPaths(u,v,res,new ArrayDeque<Integer>(),visited);
		
		
		return res;
	}
	
	void findAllPaths(int u, int v ,List<List<Integer>> res, ArrayDeque<Integer> al, boolean[] visited) {
		
		al.add(u);
		visited[u] = true;
		if(u == v){
			
			res.add(new ArrayList<Integer>(al));
			return;
		}
		
		
		
		Iterator i = adj.get(u).iterator();
		
		while(i.hasNext()){
			
			int newSource = (int)i.next();
			
			if(!visited[newSource]){
		
			findAllPaths(newSource,v,res,al,visited);
			
			visited[newSource] = false;
			al.removeLast();
			}
			
		}
		//visited[u] = false;
		
	}
}

public class PathsSourceToDest {

	public static void main(String[] args) {
		
		Graph g = new Graph(4);
		g.addEdge(0, 1);
		g.addEdge(0, 3);
		g.addEdge(1, 3);
		g.addEdge(0, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 1);
		
		System.out.println(g.findPaths(2,3));
		
	}
}
