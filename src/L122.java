
public class L122 {

	public int maxProfit(int[] a) {
        
	int maxProfit =0;
	
	if(a == null || a.length == 0 || a.length == 1)
		return maxProfit;
	
	int i =0;
	int buy = 0;
	int sell = 0;
	boolean buyFinished = false;
	
	while(i < a.length -1) {
		
		//Buy
		
		while(i < a.length -1 && a[i] >= a[i+1])
			i++;
		
		if(i < a.length -1 && a[i] < a[i+1] && !buyFinished)
		{
			buy = a[i];
			sell = -1;
			buyFinished = true;
			continue;
		}
		
		//Sell
		
		while(i < a.length -1 && a[i] <= a[i+1])
			i++;
		
		if(i < a.length -1 && a[i] > a[i+1] && buyFinished)
		{
			sell = a[i];
			maxProfit += (sell - buy);
			buyFinished = false;
			continue;
		}
	}
	
	// Is there a need to see last day transaction ?
	if(sell == -1 && buyFinished) {
		sell = a[i];
		maxProfit += (sell - buy);
		buyFinished = false;
	}
	
	return maxProfit;
	
    }
	public static void main(String[] args) {
	
		L122 l = new L122();
		
		int[] prices = {120,100,180,260,310,40,535,695};
		System.out.println(l.maxProfit(prices));
	}
}
