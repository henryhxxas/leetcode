/**
 * @Author: hhx
 * @Date: 2024/3/26 10:01
 * @Description: TODO
 * @Version: 1.0
 */
public class code27_Merge_Two_Sorted_Lists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode p=list1;
        ListNode q=list2;
        ListNode prehead=new ListNode(-1);
        ListNode newlist=prehead;
        while(p!=null&&q!=null){
            if(p.val<q.val){
                prehead.next=p;
                p=p.next;
            }else{
                prehead.next=q;
                q=q.next;
            }
            prehead=prehead.next;
        }
        prehead.next= p==null?q:p;
        return newlist.next;
    }
    public class ListNode{
        int val;
        ListNode next;
        ListNode(){

        }
        ListNode(int x){
            val=x;
        }
        ListNode(int x,ListNode next){
            this.val=x;
            this.next=next;
        }
    }
}
