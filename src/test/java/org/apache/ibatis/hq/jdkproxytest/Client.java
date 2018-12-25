package org.apache.ibatis.hq.jdkproxytest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author huangqiang
 * @Title: Client
 * @Package org.apache.ibatis.hq.jdkproxytest
 * @Description:
 * @email 1308607536@qq.com
 * @date 2018/12/2121:25
 */
public class Client {
    public static void main(String[] args) {
    Subject realSubject = new RealSubject();
        InvocationHandler handler = new DynamicProxy(realSubject);
        Subject subject = (Subject) Proxy.newProxyInstance(handler.getClass().getClassLoader(),
                realSubject.getClass().getInterfaces(), handler);
        System.out.println(subject.getClass().getName());
        subject.rent();
        subject.hello("world");
    }
}
