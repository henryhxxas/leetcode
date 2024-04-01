/**
 * @Author: hhx
 * @Date: 2024/4/1 9:59
 * @Description: TODO
 * @Version: 1.0
 */
public class code30_Swap_Nodes_in_Pairs {
    public ListNode swapPairs(ListNode head) {
        ListNode pre=new ListNode(0);
        pre.next=head;
        ListNode temp=pre;
        while(temp.next!=null&&temp.next.next!=null){
            ListNode start=temp.next;
            ListNode end=temp.next.next;
            temp.next=end;
            start.next=end.next;
            end.next=start;
            temp=start;
        }
        return pre.next;
    }
    public class ListNode{
        int val;
        ListNode next;
        ListNode(){

        }
        ListNode(int val){
            this.val=val;
        }
        ListNode(int val,ListNode next){
            this.val=val;
            this.next=next;
        }
    }
}
