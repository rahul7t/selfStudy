package binaryTrees;

import java.util.ArrayList;
import java.util.List;

public class Traversals {

    //List<Integer> ans = new ArrayList<>();
    public static void main(String[] args) {

        Traversals obj  = new Traversals();
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        obj.inorder(root);

    }

    public void inorder(TreeNode root){
        if (root == null)
             return;
        inorder(root.left);
        System.out.println(": " + root.val);
        inorder(root.right);
    }

}
