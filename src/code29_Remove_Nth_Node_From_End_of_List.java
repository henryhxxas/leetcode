/**
 * @Author: hhx
 * @Date: 2024/3/28 21:14
 * @Description: TODO
 * @Version: 1.0
 */
public class code29_Remove_Nth_Node_From_End_of_List {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return null;
        }
        ListNode p=head;
        ListNode q=head;
        while(n>0){
            q=q.next;
            n--;
        }
        if(q==null){
            return head.next;
        }
        ListNode pre=null;
        while(q!=null){
            pre=p;
            p=p.next;
            q=q.next;
        }
        if(pre!=null){
            pre.next=p.next;
        }
        return head;
    }
    public class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int x){
            val=x;
        }
        ListNode(int x,ListNode next){
            this.val=x;
            this.next=next;
        }
    }
}
