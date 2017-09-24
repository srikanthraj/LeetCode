import java.util.Arrays;
import java.util.LinkedList;

public class L418 {

public int wordsTyping(String[] sentence, int rows, int cols) {
        

        int[] nI = new int[sentence.length];
        int []times = new int[sentence.length];
        
        for(int i =0;i<sentence.length;i++) {
            
            int currLen = 0;
            int curr = i;
            int time = 0;
            
            while(currLen + sentence[curr].length() <= cols){
                
                currLen += sentence[curr++].length()+1;
                
                if(curr == sentence.length)
                {
                    curr=0;
                    time++;
                }
            }
            
            
            nI[i] = curr;
            times[i] = time;
        }
        
        System.out.println(Arrays.toString(nI));
        System.out.println(Arrays.toString(times));
        int curr =0;
        int count =0;
        
        for(int i=0;i<rows;i++){
        
            count+= times[curr];
            curr = nI[curr];
        }
        
        return count;
    }
	public static void main(String[] args) {
		
		L418 l = new L418();
		String[] words = {"a", "bcd", "e"};
		int rows = 3;
		int cols = 6;
		System.out.println(l.wordsTyping(words, rows, cols));
	}
}
