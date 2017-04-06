package com.sankuai.meishi.jvm.outofmemory;

public class RuntimeConstantPoolOOM2 {

    public static void main(String[] args) {
        String str1 = new StringBuilder("中国").append("钓鱼岛").toString(); // in heap

        String str4 = new String("中国钓鱼岛"); // in heap
        String str5 = "中国钓鱼岛"; // in String constant pool

        String str3 = new StringBuilder("中国").append("钓鱼岛").toString();
        System.out.println(str3.intern() == str3);

        String str2 = new StringBuilder("ja").append("va").toString();
        System.out.println(str2.intern() == str2);
    }
}
