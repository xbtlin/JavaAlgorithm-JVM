package com.xbtlin.jvm.outofmemory;

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

