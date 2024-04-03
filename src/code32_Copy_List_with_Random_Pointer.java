import org.w3c.dom.Node;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: hhx
 * @Date: 2024/4/3 14:48
 * @Description: TODO
 * @Version: 1.0
 */
public class code32_Copy_List_with_Random_Pointer {
    public Node copyRandomList(Node head) {
        if(head==null) return null;
        Node cur=head;
        Map<Node,Node> map=new HashMap();
        //3.复制个节点，并建立"原节点->新节点"的Map映射
        while(cur!=null){
            map.put(cur,new Node(cur.val));
            cur=cur.next;
        }
        cur=head;
        //4.构建新链表的next和random指向
        while(cur!=null){
            map.get(cur).next=map.get(cur.next);
            map.get(cur).random=map.get(cur.random);
            cur=cur.next;
        }
        //5.返回新链表的头节点
        return map.get(head);
    }
    class Node{
        int val;
        Node next;
        Node random;
        public Node(int val){
            this.val=val;
            this.next=null;
            this.random=null;
        }
    }
}
