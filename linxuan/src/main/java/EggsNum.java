/**
 * Created by linxuan on 09/02/2017.
 */
public class EggsNum {
    public static void main(String[] args) {
        int num = 0;
        int sum = 0;
        while(true){
            ++num;
            ++sum;
            if(sum % 10000 == 0) System.out.println("sum is "+sum);
            if(num % 2 == 1 && num % 3==0 && num%4==1 && num%5==4 && num%6==3 && num %7==0 && num %8==1 && num %9==0){
                System.out.println(num);
                continue;
            } else {
                continue;
            }
        }
    }
}
