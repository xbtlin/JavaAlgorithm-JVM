package com.sankuai.meishi.jvm.outofmemory;

/**
 * VM Args：-Xss128k
 * Error: Could not create the Java Virtual Machine.

 Error: A fatal exception has occurred. Program will exit.
 The stack size specified is too small, Specify at least 160k

 VM Args：-Xss256k
 * @author linxuan
 */
public class JavaVMStackSOF {

    private int stackLength = 1;

    public void stackLeak() {
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) throws Throwable {
        JavaVMStackSOF oom = new JavaVMStackSOF();
        try {
            oom.stackLeak();
        } catch (Throwable e) {
            System.out.println("stack length:" + oom.stackLength);
            throw e;
        }
    }
}
/*
Error: Could not create the Java Virtual Machine.
Error: A fatal exception has occurred. Program will exit.
The stack size specified is too small, Specify at least 160k
 */
/*

Exception in thread "main" java.lang.StackOverflowError
stack length:1868
	at com.sankuai.meishi.jvm.outofmemory.JavaVMStackSOF.stackLeak(JavaVMStackSOF.java:18)
	at com.sankuai.meishi.jvm.outofmemory.JavaVMStackSOF.stackLeak(JavaVMStackSOF.java:19)
 */
/*
result:
stack length:1868
Exception in thread "main" java.lang.StackOverflowError
/

/*
stack length:4847
512k
Exception in thread "main" java.lang.StackOverflowError
	at com.sankuai.meishi.jvm.outofmemory.JavaVMStackSOF.stackLeak(JavaVMStackSOF.java:18)
	at com.sankuai.meishi.jvm.outofmemory.JavaVMStackSOF.stackLeak(JavaVMStackSOF.java:19)
	at com.sankuai.meishi.jvm.outofmemory.JavaVMStackSOF.stackLeak(JavaVMStackSOF.java:19)
	at
 */
//stack length:10828
//	at com.sankuai.meishi.jvm.outofmemory.JavaVMStackSOF.stackLeak(JavaVMStackSOF.java:18)
//	at com.sankuai.meishi.jvm.outofmemory.JavaVMStackSOF.stackLeak(JavaVMStackSOF.java:19)
//	at com.sankuai.meishi.jvm.outofmemory.JavaVMStackSOF.stackLeak(JavaVMStackSOF.java:19)
//	at com.sankuai.meishi.jvm.outofmemory.JavaVMStackSOF.stackLeak(JavaVMStackSOF.java:19)
//	at com.sankuai.meishi.jvm.outofmemory.JavaVMStackSOF.stackLeak(JavaVMStackSOF.java:19)
//	at com.sankuai.meishi.jvm.outofmemory.JavaVMStackSOF.stackLeak(JavaVMStackSOF.java:19)
//	at com.sankuai.meishi.jvm.outofmemory.JavaVMStackSOF.stackLeak(JavaVMStackSOF.java:19)
//	at com.sankuai.meishi.jvm.outofmemory.JavaVMStackSOF.stackLeak(JavaVMStackSOF.java:19)
//	at com.sankuai.meishi.jvm.outofmemory.JavaVMStackSOF.stackLeak(JavaVMStackSOF.java:19)
//	at com.sankuai.meishi.jvm.outofmemory.JavaVMStackSOF.stackLeak(JavaVMStackSOF.java:19)
// */
