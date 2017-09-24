
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

public class L445 {


ListNode res;	
int carry = 0;
public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
		int len1 = 0;
		int len2 = 0;
		
		ListNode curr1 = l1;
		ListNode curr2 = l2;
		
		while(curr1 != null){
			len1++;
			curr1 = curr1.next;
		}
		
		while(curr2 != null){
			len2++;
			curr2 = curr2.next;
		}
		
		int diff = len1 - len2;
		int i = 0;
		
		if(diff > 0) {
			
			while(i < diff) {
				
				ListNode temp = new ListNode(0);
				temp.next = l2;
				l2 = temp;
				i++;
			}			
		}
		
		else if(diff < 0) {
			
			while(i < Math.abs(diff)) {
				
				ListNode temp = new ListNode(0);
				temp.next = l1;
				l1 = temp;
				i++;
			}			
		}
		
		addUtil(l1,l2);
		
		if(carry > 0 )
		{
			ListNode temp = new ListNode(carry);
			temp.next = res;
			res = temp;
		}
		
		return res;
			
    }

	void addUtil(ListNode curr1,ListNode curr2) {
		
		
		if(curr1 == null && curr2 == null)
			return;
		
		addUtil(curr1.next,curr2.next);
		
		int sum = curr1.val + curr2.val + carry;
		carry = sum/10;
		
		ListNode temp = new ListNode(sum%10);
		temp.next = res;
		res = temp;
	}

	void printLL(ListNode curr) {
		
		while(curr != null)
		{
			System.out.println(curr.val);
			curr = curr.next;
		}
	}
	public static void main(String[] args) {
		
		L445 l = new L445();
		
		ListNode h2 = new ListNode(0);
		//h2.next = new ListNode(2);
		//h2.next.next = new ListNode(4);
		//h2.next.next.next = new ListNode(3);
		
		
		ListNode h1 = new ListNode(9);
		h1.next = new ListNode(5);
		h1.next.next = new ListNode(6);
		h1.next.next.next = new ListNode(4);
		
		l.printLL(l.addTwoNumbers(h1, h2));
		
	}
}
