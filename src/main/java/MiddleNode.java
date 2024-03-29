import java.util.HashMap;

public class MiddleNode {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.containsKey("s");
    }

    public static ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        if(fast.next != null){
            slow = slow.next;
        }
        return slow;
    }
}
