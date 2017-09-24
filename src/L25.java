
public class L25 {

	
	 ListNode reverse(ListNode curr, int num) {
		    
	        ListNode prev = null;
	        ListNode temp;
	        int count =0;
	        while(count < num) {
	            
	            temp = curr.next;
	            curr.next = prev;
	            prev = curr;
	            curr = temp;
	            count++;
	        }
	        return prev;
	    }
	    
	    void revKUtil(ListNode curr, ListNode prev , int k) {
	        
	        if(curr == null)
	        return;
	        
	        int count =0;
	        while(curr != null && count < k-1) {
	            curr = curr.next; count++;
	        }
	        
	        if(curr == null)
	        return;
	        
	        else {
	            
	        	//System.out.println(curr.val);
	            ListNode temp = curr.next;
	            ListNode ttemp = prev.next;
	            //System.out.println(temp.val +"\t" + ttemp.val);
	            
	            prev.next = reverse(prev.next,k);
	            ttemp.next = temp;
	            
	            revKUtil(temp,ttemp,k);
	        }
	    }
	    
	    public ListNode reverseKGroup(ListNode head, int k) {
	        
	        if(head == null)
	        return null;
	        if(head.next == null)
	        return head;
	        if(k == 1)
	        return head;
	        
	        ListNode prev = null;
	        ListNode temp = new ListNode(0);
	        temp.next = head;
	        head = temp;
	        prev = temp;
	        
	        revKUtil(head.next,head,k);
	        return head.next;
	    }
	    
	    void printLL(ListNode head) {
	    	
	    	while(head != null){
	    		System.out.println(head.val);
	    		head = head.next;
	    	}
	    }
	    public static void main(String[] args) {
			
	    	L25 l = new L25();
	    	
	    	ListNode head = new ListNode(1);
	    	head.next = new ListNode(2);
	    	
	    	//head.next.next = new ListNode(3);
	    	//head.next.next.next = new ListNode(4);
	    	//head.next.next.next.next = new ListNode(5);
	    	l.printLL(l.reverseKGroup(head,1));
	    
		}
}
