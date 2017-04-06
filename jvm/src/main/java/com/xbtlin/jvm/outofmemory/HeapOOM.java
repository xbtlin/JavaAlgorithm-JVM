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
///Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/bin/java -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError -Didea.launcher.port=7533 "-Didea.launcher.bin.path=/Applications/IntelliJ IDEA 15.app/Contents/bin" -Dfile.encoding=UTF-8 -classpath "/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/lib/ant-javafx.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/lib/dt.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/lib/javafx-doclet.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/lib/javafx-mx.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/lib/jconsole.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/lib/sa-jdi.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/lib/tools.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/deploy.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/htmlconverter.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/javaws.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jfxrt.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/management-agent.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/plugin.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/ext/dnsns.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/ext/localedata.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/ext/sunec.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/ext/sunjce_provider.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/ext/sunpkcs11.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/ext/zipfs.jar:/Users/linxuan/git/study-group/jvm/target/classes:/Users/linxuan/.m2/repository/org/springframework/spring-core/4.2.2.RELEASE/spring-core-4.2.2.RELEASE.jar:/Users/linxuan/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/Applications/IntelliJ IDEA 15.app/Contents/lib/idea_rt.jar" com.intellij.rt.execution.application.AppMain com.sankuai.meishi.jvm.outofmemory.HeapOOM
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
//        at com.sankuai.meishi.jvm.outofmemory.HeapOOM.main(HeapOOM.java:19)
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