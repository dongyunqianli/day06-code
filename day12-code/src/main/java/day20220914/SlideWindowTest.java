package day20220914;

import algorithmLearning.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.*;

public class SlideWindowTest {
   /* String SEP=",", NULL="#";
    TreeNode deserialize(String data){
        LinkedList<String> nodes=new LinkedList<>();
        for(String s:data.split(SEP)){
            nodes.addLast(s);
        }
        return deserialize(nodes);
    }
    TreeNode deserialize(LinkedList<String> nodes){
        if(nodes.isEmpty()){return null;}
        String first=nodes.removeFirst();
        if(first.equals(NULL)){
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(first));
        root.left=deserialize(nodes);
        root.right=deserialize(nodes);
        return root;
    }
    void traverse(TreeNode root, int depth, int nums){
        if(root==null){
            System.out.println("null");
            return ;
        }
        System.out.println(root.val);
        depth++;
        nums++;
        traverse(root.left, depth, nums);
        traverse(root.right, depth,nums);
        depth--;
    }
    @Test
    public void test2(){
        String sb="1,2,#,4,#,#,3,#,#,";
        TreeNode result = deserialize(sb);
        traverse(result,1,1);

    }
    @Test
    public void test1(){
        List list = new ArrayList<>(10);
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6,7);
        System.out.println(list);
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }



//        Arrays.stream(list);
    }*/
}
/*
class Solution1{
    public String minWindow(String s, String t){

        Map<Character, Integer> hs=new HashMap<>();
        Map<Character, Integer> ht=new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            ht.put(t.charAt(i),ht.getOrDefault(t.charAt(i),0)+1);
        }
        String ans="";
        int len=Integer.MAX_VALUE,cnt=0;
        for(int left=0, right=0; )


    }
}*/
