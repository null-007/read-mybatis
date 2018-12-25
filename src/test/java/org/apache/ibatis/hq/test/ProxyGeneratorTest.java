package org.apache.ibatis.hq.test;

import org.apache.ibatis.hq.mapper.SysDeptMapper;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author huangqiang
 * @Title: ProxyGeneratorTest
 * @Package org.apache.ibatis.hq.test
 * @Description:
 * @email 1308607536@qq.com
 * @date 2018/12/2512:49
 */
public class ProxyGeneratorTest {

    public static void main(String[] args) {
        byte[] proxyClassFile = ProxyGenerator.generateProxyClass(
                "$MapperJDKProxy", SysDeptMapper.class.getInterfaces());
        FileOutputStream out = null;

        try {
            out = new FileOutputStream(".");
            out.write(proxyClassFile);
            out.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
