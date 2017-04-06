//package com.sankuai.meishi.jvm.outofmemory;
//
//import org.springframework.cglib.proxy.Enhancer;
//import org.springframework.cglib.proxy.MethodInterceptor;
//import org.springframework.cglib.proxy.MethodProxy;
//
//import java.lang.reflect.Method;
//
///**
// * VM Args： -XX:PermSize=10M -XX:MaxPermSize=10M
// * @author linxuan
// */
//public class JavaMethodAreaOOM {
//
//    public static void main(String[] args) {
//        while (true) {
//            Enhancer enhancer = new Enhancer();
//            enhancer.setSuperclass(OOMObject.class);
//            enhancer.setUseCache(false);
//            enhancer.setCallback(new MethodInterceptor() {
//                public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
//                    return proxy.invokeSuper(obj, args);
//                }
//            });
//            enhancer.create();
//        }
//    }
//
//    static class OOMObject {
//
//    }
//}
///*
// * result:
// Exception in thread "main"
// Exception: java.lang.OutOfMemoryError thrown from the UncaughtExceptionHandler in thread "main"
//*/