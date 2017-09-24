
public class L557 {

	void reverse(char[] ch , int i , int j) {
		

		while(i < j) {
			
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			i++;
			j--;
			
		}
	}
	
	public String reverseWords(String s) {
    
	char[] ch = s.toCharArray();
	int i =0;
	int j =0;
	
	for(j =0;j<s.length();j++) {
		
		if(ch[j] == ' '){
			
			reverse(ch,i,j-1);
			i = j+1;
		}
	}
	reverse(ch,i,j-1);
	
	//reverse(ch,0,j-1);

	StringBuilder sb = new StringBuilder();
	return sb.append(ch, 0, ch.length).toString();
	
    }
	
	public static void main(String[] args) {
		
		L557 l = new L557();
		
		System.out.println(l.reverseWords("Let's take LeetCode contest"));
	}
}
