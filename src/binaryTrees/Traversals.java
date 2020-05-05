package binaryTrees;

import java.util.Stack;

public class Traversals {

    //List<Integer> ans = new ArrayList<>();
    public static void main(String[] args) {

        Traversals obj  = new Traversals();
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        //obj.inorderRecursive(root);
        //obj.inorderIterative(root);
        obj.preOrderRecursive(root);
        //obj.preOrderIterative(root);
    }

    public void inorderRecursive(TreeNode root){
        if (root == null)
             return;
        inorderRecursive(root.left);
        System.out.println(": " + root.val);
        inorderRecursive(root.right);
    }

    public void inorderIterative(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        while (curr != null || !stack.isEmpty()) {

            while (curr!=null) {
                stack.push(curr);
                curr=curr.left;
            }
            curr = stack.pop();
            System.out.println(": "+curr.val);
            curr=curr.right;
        }
    }


    public void preOrderRecursive(TreeNode root){
        if (root==null){
            return;
        }
        System.out.println(":"+ root.val);
        preOrderRecursive(root.left);
        preOrderRecursive(root.right);
    }

    public void preOrderIterative(TreeNode root){
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            System.out.println(": "+node.val);
            if(node.right!=null){
                stack.push(node.right);
            }
            if(node.left!=null){
                stack.push(node.left);
            }
        }
        return;
    }



}
