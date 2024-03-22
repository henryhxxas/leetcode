/**
 * @Author: hhx
 * @Date: 2024/3/22 9:21
 * @Description: TODO
 * @Version: 1.0
 */
public class code25_Linked_List_Cycle {
    public boolean hasCycle(ListNode head) {
        if(head==null||head.next==null){
            return false;
        }
        ListNode slow=head;
        ListNode fast=head.next;
        while(slow!=fast){
            if(fast==null||fast.next==null){
                return false;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        return true;
    }
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val=x;
            next=null;
        }
    }
}
