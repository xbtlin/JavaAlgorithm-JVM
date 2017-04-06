package alogrithmsinjava;

import java.util.Stack;

/**
 * Created by linxuan on 13/01/2017.
 */
public class BinTraverseNoRec {

/*
1) Create an empty stack nodeStack and push root node to stack.
2) Do following while nodeStack is not empty.
….a) Pop an item from stack and print it.
….b) Push right child of popped item to stack
….c) Push left child of popped item to stack
 */
    public static void preTraverseNoRec(BinTreeNode root){
        Stack<BinTreeNode> stack = new Stack<BinTreeNode>();
        stack.push(root);
        while(stack.size()!=0) {
            BinTreeNode node = stack.pop();
            System.out.println(node.data);
            if(node.right != null) stack.push(node.right);
            if(node.left != null) stack.push(node.left);
        }
    }


    /*
    1) Create an empty stack S.
    2) Initialize current node as root
    3) Push the current node to S and set current = current->left until current is NULL
    4) If current is NULL and stack is not empty then
     a) Pop the top item from stack.
     b) Print the popped item, set current = popped_item->right
     c) Go to step 3.
    5) If current is NULL and stack is empty then we are done.
     */
    public static void inOrderTraverseNoRec(BinTreeNode root){
        Stack<BinTreeNode> stack = new Stack<BinTreeNode>();
        BinTreeNode current = root;
        while(current != null || !stack.empty()){
            if(current != null) {
                stack.push(current);
                current = current.left;
                continue;
            }
            if(current == null){
                BinTreeNode node = stack.pop();
                System.out.println(node.data);
                current = node.right;
            }
        }
    }

    public static void main(String[] args) {
        // TREE 1
        /* Construct the following tree
              26
             /   \
            10     3
           /    \     \
          4      6      3
           \
            30  */
        BinTreeNode root1;
        root1 = new BinTreeNode(26);
        root1.right = new BinTreeNode(3);
        root1.right.right = new BinTreeNode(3);
        root1.left = new BinTreeNode(10);
        root1.left.left = new BinTreeNode(4);
        root1.left.left.right = new BinTreeNode(30);
        root1.left.right = new BinTreeNode(6);

//        preTraverseNoRec(root1);
        inOrderTraverseNoRec(root1);
    }
}
