package GetOffer;

/**
 * Created by linxuan on 11/02/2017.
 */
public class P06RebuildBinTree {

    class Node{
        Node left;
        Node right;
        int data;

        public Node(int item, Node l, Node r){
            data = item;
            left = l;
            right = r;
        }
    }


    public Node rebuild(int[] pre, int s1, int e1, int[] mid, int s2, int e2){
        if(pre.length < 1 || mid.length < 1) return null;
        if(s1 > e1){
            return null;
        }
        if(s1 == e1){
            return new Node(pre[s1],null,null);
        }
        int pos = -1;
        for (int i = s2; i <= e2; i++) {
            if(pre[s1] == mid[i]){
                pos = i;
                break;
            }
        }
        int leftlen = pos - s2;
        int rightlen = e2 - pos;
        return new Node(pre[s1],rebuild(pre,s1+1,s1+leftlen,mid,s2,pos-1),
                rebuild(pre,s1+leftlen+1,e1,mid,pos+1,e2));
    }

    public static void main(String[] args) {
//        int[] pre = new int[]{1,2,4,7,3,5,6,8};
//        int[] mid = new int[]{4,7,2,1,5,3,8,6};
        //如果元素重复怎么办?
        int[] pre = new int[]{};
        int[] mid = new int[]{};

        Node root = new P06RebuildBinTree().rebuild(pre,0,pre.length-1,mid,0,mid.length - 1);
        System.out.println("hh");
    }
}
