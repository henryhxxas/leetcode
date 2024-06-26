/**
 * @Author: hhx
 * @Date: 2024/4/8 15:45
 * @Description: TODO
 * @Version: 1.0
 */
public class code34_Merge_k_Sorted_Lists {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode ans=null;
        for(int i=0;i<lists.length;i++){
            ans=mergeTwoLists(ans,lists[i]);
        }
        return ans;
    }
    public ListNode mergeTwoLists(ListNode a,ListNode b){
        if(a==null||b==null){
            return a!=null?a:b;
        }
        ListNode head=new ListNode(0);
        ListNode tail=head,aPtr=a,bPtr=b;
        while(aPtr!=null&&bPtr!=null){
            if(aPtr.val<bPtr.val){
                tail.next=aPtr;
                aPtr=aPtr.next;
            }else{
                tail.next=bPtr;
                bPtr=bPtr.next;
            }
            tail=tail.next;
        }
        tail.next=(aPtr!=null?aPtr:bPtr);
        return head.next;
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
