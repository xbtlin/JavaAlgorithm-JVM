package shoptags;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by linxuan on 14/12/2016.
 */
public class FeatureTagRmDup {




    public static void main(String[] args) {
        rmDup();
    }

    public static String encd(String s){
        if(s == null) return "input is null";
        String[] arr = s.split("\t");
        List<Character> clist = new ArrayList<Character>();
        for(String w: arr){
            if(w.equals("none")) {
                clist.add('0');
            } else {
                clist.add('1');
            }
        }
        return clist.toString();
    }

    public static int tagLen(String s){
        if(s == null) return 0;
        String[] arr = s.split("\t");
        for (int i = 1; i <arr.length; i++){
            if(!arr[i].equals("none")) return arr[i].length();
            else continue;
        }
        return 0;
    }

    public static boolean isSameTag(String s1, String s2){
        return encd(s1).equals(encd(s2));
    }

    private static void rmDup() {
        try {
            BufferedReader bf1 = new BufferedReader(new FileReader("/Users/linxuan/Downloads/feature_dup_.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/linxuan/Downloads/feature_result.txt"));
            String line,tmp = "0";
            while((line = bf1.readLine()) != null){
                if(line.split("\t")[0].equals("500349"))
                    System.out.println("hh");;
                if(tmp == "0" ||
                        !(tmp.split("\t")[0].equals(line.split("\t")[0]) &&
                            isSameTag(tmp,line))) {
                    System.out.println(tmp+'\n');
                    bw.write(tmp+'\n');
                    tmp = line;
                    continue;
                } else {
                    if(isSameTag(tmp,line)){
                        int l1=tagLen(tmp);
                        int l2=tagLen(line);
                        if(l2 <= 10 && l1 <=10){
                            tmp = l1 > l2 ? tmp : line;
                            continue;
                        } else if (l1 <= 10 && l2 >= 10){
                            continue;
                        } else if (l1 >= 10 && l2 <= 10){
                            tmp = line;
                            continue;
                        } else if(l1 > 10 && l2 > 10){
                            tmp = l1 < l2 ? tmp : line;
                        }
                    } else {
                        System.out.println(tmp+'\n');
                        bw.write(tmp+'\n');
                        continue;
                    }
                }
            }
            bf1.close();
            bw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
