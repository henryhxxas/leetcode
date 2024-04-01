/**
 * @Author: hhx
 * @Date: 2024/4/2 20:23
 * @Description: TODO
 * @Version: 1.0
 */
public class code31_Reverse_Nodes_in_k_Group {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode hair=new ListNode(0);
        hair.next=head;
        ListNode pre=hair;
        while(head!=null){
            ListNode tail=pre;
            //查看剩余部分长度是否大于等于k
            for(int i=0;i<k;i++){
                tail=tail.next;
                if(tail==null){
                    return hair.next;
                }
            }
            ListNode next=tail.next;
            ListNode[] reverse=myReverse(head,tail);
            head=reverse[0];
            tail=reverse[1];
            //把子链表重新接回原链表
            pre.next=head;
            tail.next=next;
            pre=tail;
            head=tail.next;
        }
        return hair.next;
    }
    public ListNode[] myReverse(ListNode head,ListNode tail){
        ListNode prev=tail.next;
        ListNode p=head;
        while(prev!=tail){
            ListNode nex=p.next;
            p.next=prev;
            prev=p;
            p=nex;
        }
        return new ListNode[]{tail,head};
    }
    public class ListNode{
        int val;
        ListNode next;
        ListNode(){

        }
        ListNode(int x){
            val=x;
        }
        ListNode(int val,ListNode next){
            this.val=val;
            this.next=next;
        }
    }
}
