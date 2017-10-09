package leetcode;

/**
 * You are given two non-empty linked lists representing two non-negative
 * integers. The digits are stored in reverse order and each of their nodes
 * contain a single digit. Add the two numbers and return it as a linked list.
 * 
 * You may assume the two numbers do not contain any leading zero, except the
 * number 0 itself.
 * 
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4) Output: 7 -> 0 -> 8
 * 
 * @Author doctorrm
 * @Time 2017-09-10 上午12:04:56
 */
public class AddTwoNumbers {

	public static void main(String[] args) throws Exception {
		ListNode listNode1=new ListNode(1);
		ListNode listNode2=new ListNode(3);listNode1.next=listNode2;				
		ListNode listNode3=new ListNode(6);
		ListNode result=addTwoNumbers(listNode1, listNode3);
		while(result!=null){
			System.out.print(result.val);
			result=result.next;
		}
		
		/*ListNode l1=new ListNode(3);
		ListNode l2=l1;
				l2.val=9;
		System.out.println(l1.val);//9,SO magic!  Answer:Two instances,one memery of val;
		*/
		
		/*String aString="first memory";
		String bString=aString;
		bString="another memory";
		System.out.println(bString+aString);*/
		
	}
	 public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		    ListNode dummyHead = new ListNode(0);
		    ListNode p = l1, q = l2, curr = dummyHead;//assgin,two instances,One memory!That's the key!	  
		    int carry = 0;
		    while (p != null || q != null) {
		        int x = (p != null) ? p.val : 0;//consider when one of the list ends first.
		        int y = (q != null) ? q.val : 0;
		        int sum = carry + x + y;//0 at the begining,satisty the reverse linked list.
		        carry = sum / 10;
		        curr.next = new ListNode(sum % 10);
		        curr = curr.next;
		        if (p != null) p = p.next;
		        if (q != null) q = q.next;
		    }
		    if (carry > 0) {//carry==1
		        curr.next = new ListNode(carry);
		    }		    
		    //System.out.println(curr.equals(dummyHead));//false
		    //System.out.println(curr==dummyHead);//false
		    //but curr and dummyHead refer to the same memory address.
		    return dummyHead.next;
		 }
}

//Definition for singly-linked list.
class ListNode {
	int val;//single value of node
	ListNode next;//instance of this class
	ListNode(int x) { 
		val = x; }
}