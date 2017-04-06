package GetOffer;

/**
 * Created by linxuan on 22/02/2017.
 */
public class P18TreeSub {

    static class TreeNode{
        int data;
        TreeNode l;
        TreeNode r;

        public TreeNode(int data) {
            this.data = data;
            this.l = null;
            this.r = null;
        }
    }

    public static boolean matchSub(TreeNode r1, TreeNode r2){
        if(r2 == null) return true;
        if(r1 == null) return false;

        if(isSub(r1,r2)) return true;

        return isSub(r1.l, r2) || isSub(r1.r, r2);
    }

    private static boolean isSub(TreeNode r1, TreeNode r2) {
        if(r2 == null) return true;
        if(r1 == null || r2 == null) return false;

        return (r1.data == r2.data) && isSub(r1.l,r2.l) && isSub(r1.r, r2.r);
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

        TreeNode root1 = new TreeNode(10);
        root1.r = new TreeNode(3);
        root1.r.r = new TreeNode(3);
        root1.l = new TreeNode(10);
        root1.l.l = new TreeNode(4);
        root1.l.l.r = new TreeNode(30);
        root1.l.r = new TreeNode(6);

        // TREE 2
        /* Construct the following tree
           10
         /    \
         4      6
          \
          30  */

        TreeNode root2 = new TreeNode(10);
        root2.r = new TreeNode(6);
        root2.l = new TreeNode(4);
//        root2.l.r = new TreeNode(30);

        if(matchSub(root1,root2)){
            System.out.println("Tree2 is SubTree of Tree1");
        } else {
            System.out.println("Not SubTree");
        }
    }
}
