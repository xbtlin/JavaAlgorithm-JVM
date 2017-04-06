package com.sankuai.meishi.jvm.outofmemory;

/**
 * Created by linxuan on 2/26/16.
 */
public class StringConstantPool {
    public static void main(String[] args) {

        String one = "abc";
        String two = "abc";


        String str1 = new StringBuilder("中国").append("钓鱼岛").toString();
        System.out.println(str1.intern() == str1);

        String str2 = new String("倚天不屠龙");
        System.out.println(str2.intern() == str2);
    }
}
/*
true
false
 */