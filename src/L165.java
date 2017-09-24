
public class L165 {

public static int compareVersion(String version1, String version2) {
        
        int v1First = 0;
        int v1Sec = 0;
        int v2First = 0;
        int v2Sec = 0;
        
        
        if(version1.contains(".")) {
        	System.out.println(version1);
            String []v1 = version1.split("\\.");
            v1First = Integer.parseInt(v1[0]);
            v1Sec = Integer.parseInt(v1[1]);
        }
        
        else
            v1First = Integer.parseInt(version1);
        
        if(version2.contains(".")) {
            String []v2 = version2.split(".");
            v2First = Integer.parseInt(v2[0]);
            v2Sec = Integer.parseInt(v2[1]);
        }
        
        else
            v2First = Integer.parseInt(version2);
        
        
        
        
        if(v1First > v2First)
        return 1;
        
        else if(v2First > v1First)
        return -1;
        
        else {
           
         if(v1Sec > v2Sec)
        return 1;
        
        else if(v2Sec > v1Sec)
        return -1;
        
        else
        return 0;
        }
        
    }

	public static void main(String[] args) {
		
		compareVersion("10.1","10");
	}
}
