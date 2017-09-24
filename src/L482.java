import java.util.LinkedList;

public class L482 {

	public String licenseKeyFormatting(String s, int k) {
        
		s=s.replaceAll("-", "");
		//System.out.println(s);
		int len = s.length();
		int grps = (len%k ==0)?(len/k):(len/k)+1;
		String res = "";
		
	
		String[]keys = new String[grps];
		
		for(int i =grps-1;i>=0;i--) {
			
			if(i>0)
				keys[i] = "-";
			
			else
				keys[i]= "";
			if(len -k < 0)
				keys[i] = keys[i].concat(s.substring(0,len).toUpperCase());
			
			else if(len -k > 0)
				keys[i] = keys[i].concat(s.substring(len-k,len).toUpperCase());
			
			else
				keys[i] = keys[i].concat(s.substring(0,len).toUpperCase());
			
			//if(i ==0)				
			//	keys[i] = keys[i].substring(1);
			
			len = len-k;
		}
		
		for(String str:keys)
		res = res+str;
		
		//if(k==1)
			//return res.substring(1);
		return res;
    }

	public static void main(String[] args) {
		
		L482 l = new L482();
		
		String s = "2-4A0r7-4k";
		int k =4;
		System.out.println(l.licenseKeyFormatting(s, k));
	}
}
