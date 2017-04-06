import java.util.Calendar;

/**
 * Created by linxuan on 11/01/2017.
 */
public class TimeRec {

    static Calendar c = Calendar.getInstance();

    public void testTime(){
        long test0  = System.currentTimeMillis();
        Long i = 10000000000L;
        while(i > 0){
            --i;
        }
        long test1 = System.currentTimeMillis();
        double span = Double.valueOf(test1 - test0)/1000;
        System.out.println("time spent: " + (test1 - test0) + "  "+span);

    }

    public static void main(String[] args) {
        new TimeRec().testTime();
    }
}
