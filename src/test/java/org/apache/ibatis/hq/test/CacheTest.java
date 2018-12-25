package org.apache.ibatis.hq.test;

import org.apache.ibatis.hq.Dao.SysDept;
import org.apache.ibatis.hq.mapper.SysDeptMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author huangqiang
 * @Title: CacheTest
 * @Package org.apache.ibatis.hq.test
 * @Description:
 * @email 1308607536@qq.com
 * @date 2018/12/2513:33
 */
public class CacheTest {
    public static void main(String[] args) throws IOException, InterruptedException {
        String resource = "resources/config/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);

        new Thread(() -> {
            try (SqlSession session = sqlSessionFactory.openSession()){
                SysDeptMapper mapper = session.getMapper(SysDeptMapper.class);
                SysDept sysDept = mapper.get(4);
                System.out.println(sysDept);
                sysDept.setLevel("123456");
            }
        }).start();
        Thread.sleep(10000);
        new Thread(() -> {
            try (SqlSession session = sqlSessionFactory.openSession()){
                SysDeptMapper mapper = session.getMapper(SysDeptMapper.class);
                SysDept sysDept = mapper.get(4);
                System.out.println(sysDept);
            }
        }).start();

    }
}
