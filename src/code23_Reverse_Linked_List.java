/**
 * @Author: hhx
 * @Date: 2024/3/20 19:27
 * @Description: TODO
 * @Version: 1.0
 */
public class code23_Reverse_Linked_List {
    public ListNode reverseList(ListNode head) {
        ListNode cur=head;
        ListNode pre=null;
        while(cur!=null){
            ListNode tmp=cur.next;
            cur.next=pre;
            pre=cur;
            cur=tmp;

        }
        return pre;
    }
     public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
