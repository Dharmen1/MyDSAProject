package tree;

import java.util.Stack;

public class BinaryTree {
    private TreeNode root;

    private class TreeNode {
        private int data;
        private TreeNode left;
        private TreeNode right;

       public TreeNode(int data){
           this.data = data;
           this.left = null;
           this.right = null;
       }
    }

    public void createBinaryTree() {
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
        TreeNode sixth = new TreeNode(6);
        TreeNode seventh = new TreeNode(7);

        root = first;
        root.left = second;
        root.right = third;
       second.left = fourth;
        second.right = fifth;
        third.left = sixth;
       third.right = seventh;

    }

    public void preOrderUsingRecursion(TreeNode root){
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preOrderUsingRecursion(root.left);
        preOrderUsingRecursion(root.right);
    }

    public void preOrderIterative(){
        if (root == null)
            return;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode temp = stack.pop();
            System.out.print(temp.data + " ");
            if (temp.right != null){
                stack.push(temp.right);
            }
            if (temp.left != null){
                stack.push(temp.left);
            }
        }
    }

    public void inOrderRecursion(TreeNode root){
        if (root == null)
            return;
        inOrderRecursion(root.left);
        System.out.print(root.data + " ");
        inOrderRecursion(root.right);
    }

    public void inOrderIterative(TreeNode root){
        if (root == null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode temp = stack.pop();
            System.out.print(temp.data + " ");
            if (temp.right != null){
                stack.push(temp.right);
            }
            if (temp.left != null){
                stack.push(temp.left);
            }
        }
    }

    public static void main(String[] args) {
        BinaryTree bn = new BinaryTree();
        bn.createBinaryTree();
    //    bn.inOrderRecursion(bn.root);
    //    bn.inOrderIterative(bn.root);
   //     bn.preOrderUsingRecursion(bn.root);
   //     System.out.println(" ");
        bn.preOrderIterative();
    }

}
