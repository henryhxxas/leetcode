/**
 * @Author: hhx
 * @Date: 2024/3/25 11:06
 * @Description: TODO
 * @Version: 1.0
 */
public class code26_Linked_List_Cycle_II {
    public ListNode detectCycle(ListNode head) {
        ListNode fast=head,slow=head;
        while(true){
            if(fast==null||fast.next==null) return null;
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow) break;
        }
        ListNode indexnode=head;
        while(slow!=indexnode){
            slow=slow.next;
            indexnode=indexnode.next;
        }
        return indexnode;

    }
    public  class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val=x;
            next=null;
        }
    }
}
