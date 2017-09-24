
public class L92 {

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
    
    public ListNode reverseBetween(ListNode head, int m, int n) {
        
        if(m == n)
        return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        head = dummy;
        
        ListNode prev = head;
        ListNode curr = head.next;
        int count =1;
        while (count < m)
        {
            prev = curr;
            curr = curr.next;
            count++;
        }
        
        while(count < n) {
            curr = curr.next;
            count++;
        }
        
        ListNode temp = prev.next;
        
        ListNode ttemp = curr.next;
        
        prev.next = reverse(prev.next,n-m+1);

        temp.next = ttemp;
        
        return head.next;
    }
    
    void printLL(ListNode head) {
    	
    	while(head != null){
    		System.out.println(head.val);
    		head = head.next;
    	}
    }
    public static void main(String[] args) {
		
    	L92 l = new L92();
    	ListNode head = new ListNode(3);
    	head.next = new ListNode(5);
    	//head.next.next = new ListNode(3);
    	//head.next.next.next = new ListNode(4);
    	//head.next.next.next.next = new ListNode(5);
    	l.printLL(l.reverseBetween(head,1,2));
    
	}
}
