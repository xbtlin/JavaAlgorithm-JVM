package alogrithmsinjava;

/**
 * Created by linxuan on 13/01/2017.
 */
public class BinTreeNode {
    int data;
    BinTreeNode left, right, nextRight;

    BinTreeNode(int item)
    {
        data = item;
        left = right = nextRight = null;
    }
}
