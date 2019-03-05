package com.xbtlin.jvm.outofmemory;

import java.util.ArrayList;
import java.util.List;

/**
 * VM Args：-Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 * @author linxuan
 */
public class HeapOOM {

    static class OOMObject {
    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<OOMObject>();

        while (true) {
            list.add(new OOMObject());
        }
    }
}
//        java.lang.OutOfMemoryError: Java heap space
//        Dumping heap to java_pid3232.hprof ...
//        Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
//        Heap dump file created [27709358 bytes in 0.175 secs]
//        at java.util.Arrays.copyOf(Arrays.java:2245)
//        at java.util.Arrays.copyOf(Arrays.java:2219)
//        at java.util.ArrayList.grow(ArrayList.java:242)
//        at java.util.ArrayList.ensureExplicitCapacity(ArrayList.java:216)
//        at java.util.ArrayList.ensureCapacityInternal(ArrayList.java:208)
//        at java.util.ArrayList.add(ArrayList.java:440)
//        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
//        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)
//        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
//        at java.lang.reflect.Method.invoke(Method.java:606)
//        at com.intellij.rt.execution.application.AppMain.main(AppMain.java:144)
//
//        Process finished with exit code 1
//
//        ➜  study-group git:(master) ✗ ls
//        java_pid3232.hprof jvm                out                pom.xml            study-group.iml
//        ➜  study-group git:(master) ✗
//
//        java_pid3232.hprof