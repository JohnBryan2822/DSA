import java.util.PriorityQueue;

public class FindKthLargest {
    public static void main(String[] args) {

    }

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        for(int num:nums){
            pq.add(num);
        }
        for(int i=0;i<k-1;i++){
            pq.poll();
        }
        return pq.peek();
    }
}
