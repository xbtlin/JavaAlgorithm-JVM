package bizrefuse;

import org.apache.commons.lang.StringUtils;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by linxuan on 8/22/16.
 */
public class RemoveDupli {

    public static void removeDup() throws IOException {
        BufferedReader bf1 = new BufferedReader(new FileReader("/Users/linxuan/unprocess0822"));
        BufferedReader bf2 = new BufferedReader(new FileReader("/Users/linxuan/beforeDupli0822"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/linxuan/afterDupli0822"));
        Set<String> s = new HashSet();
        String line = null;
        while((line = bf1.readLine()) != null){
            s.add(line);
        }
        bf1.close();

        while((line = bf2.readLine()) != null){
            String[] arr = line.split("\\s");
            if(arr[0] == "25262458"){
                System.out.println("hh");
            }
            // 和未处理重复,则略过
            if(s.contains(arr[0])) continue;
            // 有NULL的,则略过
            int flag = 0;
            for(String str : arr){
                if (str == null || str == "NULL" || StringUtils.isBlank(str)) {
                    flag=1;
                }
            }
            if(flag > 0) continue;

            bw.write(line + "\n");
        }
        bf2.close();
        bw.close();
    }

    public static void removeNULL() throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("/Users/linxuan/bizref0918_old"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/linxuan/afterRmNull0918_old"));
        String line = null;

        while((line = bf.readLine()) != null){
            String[] arr = line.split("\\s");
            // 有NULL的,则略过
            int flag = 0;
            System.out.println(arr.length + "\t");
            for(String str : arr){
                if (str == null || str.equals("NULL") || StringUtils.isBlank(str)) {
                    flag=1;
                }
            }
            if(flag > 0) continue;

            bw.write(line + "\n");
        }
        bf.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
//        removeDup();
//        removeNULL();
        String test = new String("test");
        System.out.println(test);
        String test2 = new String("tset");
        System.out.println(test.hashCode());
        System.out.println(test2.hashCode());
        Object obj = new Object();

        HashMap<String, String> hm = new HashMap<String, String>();
        ConcurrentHashMap a = new ConcurrentHashMap();

        Stack<String> st = new Stack<String>();
    }
}
