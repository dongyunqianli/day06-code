package exer2;

import java.util.ArrayList;
import java.util.List;

public class Code01_ReverseList {
    public static class Node{
        public int value;
        public Node next;
        public Node(int data){
            value=data;
        }
    }

    public static class DoubleNode{
        public int value;
        public DoubleNode last;
        public DoubleNode next;
        public DoubleNode(int data){
            value=data;
        }
    }

    public static Node reverseLinkedList(Node head){
        Node pre=null;
        Node next=null;
        while(head!=null){
            next=head.next;
            head.next=pre;
            pre=head;
            head=next;
        }
        return pre;
    }

    public static DoubleNode reverseDoubleList(DoubleNode head){
        DoubleNode pre=null;
        DoubleNode next=null;
        while(head!=null){
            next=head.next;
            head.next=pre;
            head.last=next;
            pre=head;
            head=next;
        }
        return pre;
    }
    public static Node testReverseLinkedList(Node head){
        if(head==null){
            return null;
        }
        ArrayList<Node> list = new ArrayList<>();
        while(head!=null){
            list.add(head);
            head=head.next;
        }
        list.get(0).next=null;
        int N=list.size();
        for (int i = 1; i < N; i++) {
            list.get(i).next=list.get(i-1);
        }
        return list.get(N-1);
    }
    public static DoubleNode testReverseDoubleList(DoubleNode head){
        if(head==null){
            return null;
        }
        ArrayList<DoubleNode> list = new ArrayList<>();
        while(head!=null){
            list.add(head);
            head=head.next;
        }
        list.get(0).next=null;
        DoubleNode pre=list.get(0);
        int N=list.size();
        for (int i = 1; i < N; i++) {
            DoubleNode cur=list.get(i);
            cur.last=null;
            cur.next=pre;
            pre.last=cur;
            pre=cur;
        }
        return list.get(N-1);
    }
    public static Node generateRandomLinkedList(int len,int value){
        int size=(int)(Math.random()*(len+1));
        if(size==0){
            return null;
        }
        size--;
        Node head=new Node((int)(Math.random()*(value+1)));
        Node pre=head;
        while(size!=0){
            Node cur=new Node((int)(Math.random()*(value+1)));
            pre.next=cur;
            pre=cur;
            size--;
        }
        return head;
    }
    public static DoubleNode generateRandomDoubleList(int len,int value){
        int size=(int)(Math.random()*(len+1));
        if(size==0){
            return null;
        }
        size--;
        DoubleNode head=new DoubleNode((int)(Math.random()*(value+1)));
        DoubleNode pre=head;
        while(size!=0){
            DoubleNode cur=new DoubleNode((int)(Math.random()*(value+1)));
            pre.next=cur;
            cur.last=pre;
            pre=cur;
            size--;
        }
        return head;
    }
    public static List<Integer> getLinkedListOriginOrder(Node head){
        List<Integer>ans=new ArrayList<>();
        while(head!=null){
            ans.add(head.value);
            head=head.next;
        }
        return ans;
    }
    public static boolean checkLinkedListReverse(List<Integer> origin,Node head){
        for(int i=origin.size()-1;i>=0;i--){
            if(!origin.get(i).equals(head.value)){
                return false;
            }
            head=head.next;
        }
        return true;
    }
    public static List<Integer> getDoubleListOriginOrder(DoubleNode head){
        List<Integer> ans=new ArrayList<>();
        while(head!=null){
            ans.add(head.value);
            head=head.next;
        }
        return ans;
    }
/*    public static boolean checkDoubleListReverse(List<Integer> origin, DoubleNode head){
        DoubleNode end=null;
        for (int i = origin.size()-1; i >=0 ; i++) {
            if(!origin.get(i).equals(head.value)){
                
            }

        }
    }*/
}























