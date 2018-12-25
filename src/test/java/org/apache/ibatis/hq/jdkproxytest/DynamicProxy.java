package org.apache.ibatis.hq.jdkproxytest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.net.SocketTimeoutException;

/**
 * @author huangqiang
 * @Title: DynamicProxy
 * @Package org.apache.ibatis.hq.jdkproxytest
 * @Description:
 * @email 1308607536@qq.com
 * @date 2018/12/2121:23
 */
public class DynamicProxy implements InvocationHandler {

    private Object subject;
    public DynamicProxy(Object subject) {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before rent house");
        System.out.println("Method:" + method);
        method.invoke(subject, args);
        System.out.println("after rent house");
        return null;
    }
}
