
public class L3 {

public int lengthOfLongestSubstring(String str) {
        
        int currLen = 0;
		int maxLen = Integer.MIN_VALUE;
		int ref[] = new int[256];
		
		int start = 0;
		int end = 0;
		for(int i =0;i<256;i++) {
			ref[i] = -1;
		}
		
		for(int i =0;i<str.length();i++) {
			
		
			if(ref[str.charAt(i)] == -1 || (i - currLen) > ref[str.charAt(i)]) {
				currLen++;
				ref[str.charAt(i)] = i;
			}
			else {
				
				if(currLen > maxLen)
				{
				end = i;
				start = i-currLen;
				System.out.println("START "+ start + "  END "+ end);
				}
				
				maxLen = Math.max(maxLen, currLen);
				currLen = i - ref[str.charAt(i)];
				
				ref[str.charAt(i)] = i;
			}
		}
		
		if(currLen > maxLen)
		{
			end = str.length();
			start = str.length()-currLen;
		}
		maxLen = Math.max(maxLen, currLen);
		
		System.out.println("String is\t" + str.substring(start, end));
		return maxLen;		
    }

	public static void main(String[] args) {
		
		L3 l = new L3();
		
		System.out.println(l.lengthOfLongestSubstring("pwwkew"));
	}
}
