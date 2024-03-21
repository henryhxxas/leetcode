/**
 * @Author: hhx
 * @Date: 2024/3/21 9:59
 * @Description: TODO
 * @Version: 1.0
 */
public class code24_Palindrome_Linked_List {
    public boolean isPalindrome(ListNode head) {
        ListNode middle=findmiddle(head);//找到中间的结点
        ListNode second=reverse(middle.next);//对后半段进行反转
        ListNode first=head;
        while(second!=null){
            if(first.val!=second.val){
                return false;
            }
            first=first.next;
            second=second.next;
        }
        return true;

    }
    //反转
    private ListNode reverse(ListNode head){
        ListNode cur=head;
        ListNode pre=null;
        ListNode temp=null;
        while(cur!=null){
            temp=cur.next;
            cur.next=pre;
            pre=cur;
            cur=temp;
        }
        return pre;
    }
    //找到中间的结点
    private ListNode findmiddle(ListNode head){
        ListNode fast=head,slow=head;
        while(fast.next!=null&&fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
