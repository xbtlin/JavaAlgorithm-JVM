import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by linxuan on 5/21/16.
 */
public class P1006 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t!=0){
            List<Integer> list = new LinkedList<Integer>();
            int n = sc.nextInt();
            int min = n;
            int m = sc.nextInt();
            while(n != 0){
                list.add(n);
                --n;
            }
            while(m!=0){
                Integer p = sc.nextInt();
                Integer q = sc.nextInt();
                if(p > q) {
                    --m;
                    continue;
                }
                if(p < q){
                    list.remove(q);
                    if (list.indexOf(p) == list.size() - 1){
                        list.add(q);
                    } else list.add(list.indexOf(p) + 1,q);
                }
                --m;
            }
            int sum = 0;
            n = list.size();
            for (int i = 0; i < n; i++) {
                if(min > list.get(i)){
                    min = list.get(i);
                }
                sum += min;
            }
            System.out.println(sum);
            --t;
        }
        sc.close();
    }
}
