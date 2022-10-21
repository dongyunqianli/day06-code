package algorithmLearning;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    TreeNode(){}
    public TreeNode(int val){
        this.val=val;
    }
    TreeNode(int val,TreeNode left,TreeNode right){
        this.val=val;
        this.left=left;
        this.right=right;
    }
}
class Solution1{
    List<List<Integer>> res=new ArrayList<>();
    List<List<Integer>> levelTraverse(TreeNode root){
        if(root==null){
            return res;
        }
        traverse(root,0);
        return res;
    }
    void traverse(TreeNode root, int depth){
        if(root==null){
            return;
        }
        if(res.size()<=depth){
            res.add(new LinkedList<>());
        }
        res.get(depth).add(root.val);
        traverse(root.left,depth+1);
        traverse(root.right,depth+1);
    }
}

class Solution2{
    List<List<Integer>> res=new LinkedList<>();
    List<List<Integer>> levelTraverse(TreeNode root){
        if(root==null){
            return res;
        }
        List<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);
        traverse(nodes);
        return res;

    }
    void traverse(List<TreeNode> curLevelNodes){
        if(curLevelNodes.isEmpty()){
            return;
        }
        List<Integer> nodeValues=new LinkedList<>();
        List<TreeNode> nextLevelNodes=new LinkedList<>();
        for(TreeNode node:curLevelNodes){
            nodeValues.add(node.val);
            if(node.left!=null){
                nextLevelNodes.add(node.left);
            }
            if(node.right!=null){
                nextLevelNodes.add(node.right);
            }
        }
        res.add(nodeValues);
        traverse(nextLevelNodes);


    }

}

















