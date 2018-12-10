package org.apache.ibatis.hq.jdkproxy;

/**
 * @author huangqiang
 * @Title: Subject
 * @Package org.apache.ibatis.hq.jdkproxy
 * @Description:
 * @email 1308607536@qq.com
 * @date 2018/12/1018:37
 */
public interface Subject {
    /**
     * 你好
     *
     * @param name
     * @return
     */
     String SayHello(String name);

    /**
     * 再见
     *
     * @return
     */
     String SayGoodBye();
}
