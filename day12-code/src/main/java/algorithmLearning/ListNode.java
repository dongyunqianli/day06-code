package algorithmLearning;

import java.util.*;

public class ListNode {
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val){
        this.val=val;
    }
    ListNode(int val,ListNode next){
        this.val =val;
        this.next =next;
    }
}
class Solution{
    public static ListNode mergeKLists(ListNode[] lists){
        if(lists.length==0){
            return null;
        }
        ListNode dummy=new ListNode(-1);
        ListNode p=dummy;
        PriorityQueue<ListNode> pq =new PriorityQueue<>(lists.length, Comparator.comparingInt(a->a.val));
        for(ListNode head:lists){
            if(head!=null){
                pq.add(head);
            }
        }
        while(!pq.isEmpty()){
            ListNode node = pq.poll();
            p.next=node;
            if(node.next!=null){
                pq.add(node.next);
            }
            p=p.next;
        }
        return dummy.next;
    }
}
class Test{
/*    public static void main(String[] args) {
        HashSet hashSet =new HashSet();
        int[] nums=new int[5];
        String s="what a funny trick";
        System.out.println("s.length() = " + s.length());
        System.out.println("s.substring(1,9) = " + s.substring(1, 9));
    }*/

    @org.junit.jupiter.api.Test
    public void test1(){
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        System.out.println("list = " + list);
    }
    @org.junit.jupiter.api.Test
    public void test2(){
        List<List<Integer>> track=new LinkedList<>();
        LinkedList<List<Integer>> linkedList = new LinkedList<>(track);

    }
    @org.junit.jupiter.api.Test
    public void test3(){
        int[][] nums=new int[][]{{1,3},{1,2},{4,5},{3,7}};
        //方法一
        Arrays.sort(nums, (a, b) -> {
            if(a[1]==b[1]){
                return a[0]-b[0];
            }else{
                return a[1]-b[1];
            }
        });

        for (int[] num : nums) {
            System.out.println(Arrays.toString(num));
        }
        //方法二
        Arrays.sort(nums, Comparator.comparingInt(a -> a[1]));
        for (int[] num : nums) {
            System.out.println(Arrays.toString(num));
        }


    }
}



























