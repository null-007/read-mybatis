package org.apache.ibatis.hq.jdkproxytest;

/**
 * @author huangqiang
 * @Title: RealSubject
 * @Package org.apache.ibatis.hq.jdkproxytest
 * @Description:
 * @email 1308607536@qq.com
 * @date 2018/12/2121:22
 */
public class RealSubject implements Subject {

    @Override
    public void rent() {
        System.out.println("I want to rent my house");
    }

    @Override
    public void hello(String str) {
        System.out.println("hello:" + str);
    }
}
