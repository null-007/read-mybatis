package org.apache.ibatis.hq.jdkproxy;

/**
 * @author huangqiang
 * @Title: RealSubject
 * @Package org.apache.ibatis.hq.jdkproxy
 * @Description:
 * @email 1308607536@qq.com
 * @date 2018/12/1018:38
 */
public class RealSubject implements Subject{
    /**
     * 你好
     *
     * @param name
     * @return
     */
    public String SayHello(String name)
    {
        return "hello " + name;
    }

    /**
     * 再见
     *
     * @return
     */
    public String SayGoodBye()
    {
        return " good bye ";
    }
}
