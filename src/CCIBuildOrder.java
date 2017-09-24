import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Stack;

public class CCIBuildOrder {

	HashMap<Character,ArrayList<Character>> hm = new HashMap<Character,ArrayList<Character>>(); 
	Stack<Character> st = new Stack<Character>();
	Set<Character> ws = new HashSet<Character>();
	Set<Character> gs = new HashSet<Character>();
	int findSol(){
		
		for(char ch:hm.keySet())
			ws.add(ch);
		
		Iterator<Character> it = ws.iterator();
		boolean[]visited = new boolean[hm.size()];
		
		while(it.hasNext()) {
			
			char ch = it.next();
			//ws.remove(ch);
			if(!visited[ch-97])
			{
				if(dfs(ch,visited) == -1)
				return -1;
				
				
			}
		}
		
		return 0;
	}
	
	
	int dfs(char ch,boolean[]visited) {
		
		
		if(gs.contains(ch))
			return -1;
		
		else if(visited[ch-97])
			return 0;
		
		int res =0;
		visited[ch-97] = true;
		gs.add(ch);

		Iterator<Character> i = hm.get(ch).iterator();
		
		while(i.hasNext()) {
			
			char c = i.next();
			
			res = dfs(c,visited);
			
		}
		
		if(res != -1) {
		st.push(ch);
		gs.remove(ch);
		return 0;
		}
		else
			return -1;
	}
	
	public static void main(String[] args) {
		
		CCIBuildOrder cb = new CCIBuildOrder();
		
		ArrayList<Character> al1 = new ArrayList<Character>();
		al1.add('d');
		cb.hm.put('a', al1);
		
		ArrayList<Character> al2 = new ArrayList<Character>();
		al2.add('d');
		//al2.add('f');
		cb.hm.put('b', al2);
		
		ArrayList<Character> al3 = new ArrayList<Character>();
		cb.hm.put('c', al3);
		
		ArrayList<Character> al4 = new ArrayList<Character>();
		al4.add('c');
		//al4.add('b');
		cb.hm.put('d', al4);
		
		ArrayList<Character> al5 = new ArrayList<Character>();
		cb.hm.put('e', al5);
		
		ArrayList<Character> al6 = new ArrayList<Character>();
		al6.add('a');
		al6.add('b');
		cb.hm.put('f', al6);
		
		//System.out.println('a'-97);
		if(cb.findSol() == -1)
			System.out.println("Error");
		
		else 
			while(!cb.st.isEmpty())
				System.out.print(cb.st.pop()+"\t");
	
	}
}
