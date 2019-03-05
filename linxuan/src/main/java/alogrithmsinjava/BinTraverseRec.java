package alogrithmsinjava;

import java.util.Stack;

/**
 * Created by linxuan on 13/01/2017.
 */
public class BinTraverseRec {

    public static void preTraverseRec(BinTreeNode root){
        if(root != null) {
            System.out.println(root.data);
            preTraverseRec(root.left);
            preTraverseRec(root.right);
        }
    }

    public static void inOrderTraverseRec(BinTreeNode root){
        if(root != null) {
            inOrderTraverseRec(root.left);
            System.out.println(root.data);
            inOrderTraverseRec(root.right);
        }
    }

    public static void postOrderTraverseRec(BinTreeNode root){
        if(root != null) {
            postOrderTraverseRec(root.left);
            postOrderTraverseRec(root.right);
            System.out.println(root.data);
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

//        preTraverseRec(root1);
//        inOrderTraverseRec(root1);
        postOrderTraverseRec(root1);
    }
}
