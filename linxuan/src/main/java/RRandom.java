import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by linxuan on 9/6/16.
 */
public class RRandom {
    public static void main(String[] args) {
        String list = "张璇,曹建航,徐文强,程俊霞,陈真";
        List<String> users = new ArrayList<String>(Arrays.asList(list.split(",")));

        // 指定种子,顺序就会确定,所以开关就是种子.
        Random random = new Random(100);
        while(users.size()>0){
            int pos = random.nextInt(users.size());
            System.out.println(users.remove(pos));
        }
    }
}
