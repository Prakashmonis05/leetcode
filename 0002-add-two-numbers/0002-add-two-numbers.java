/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1=l1;
        ListNode temp2=l2;
        ListNode head=null;
        ListNode temp=null;
        int res=0;
        if(l1==null && l2==null  )
        {
            return head;
        }
        while(temp1!=null && temp2!=null)
        {
            res+=temp1.val+temp2.val;
            int rem=res%10;
            res=res/10;
            ListNode newNode=new ListNode(rem);
            if(head==null)
            {
                
                head=newNode;
                temp=head;
            }
            else
            {
                temp.next=newNode;
                temp=temp.next;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }

        while(temp1!=null)
        {

            res+=temp1.val;
            int rem=res%10;
            res=res/10;
            ListNode newNode=new ListNode(rem);
            if(head==null)
            {
                
                head=newNode;
                temp=head;
            }
            else
            {
                temp.next=newNode;
                temp=temp.next;
            }
            temp1=temp1.next;
        }

         while(temp2!=null)
        {

            res+=temp2.val;
            int rem=res%10;
            res=res/10;
            ListNode newNode=new ListNode(rem);
            if(head==null)
            {
                
                head=newNode;
                temp=head;
            }
            else
            {
                temp.next=newNode;
                temp=temp.next;
            }
            temp2=temp2.next;
        }


        if(res!=0)
        {
            ListNode newNode=new ListNode(res); 
            temp.next=newNode;
        }


        return head;
    }
}