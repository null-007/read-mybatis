package org.apache.ibatis.hq;

import org.apache.ibatis.hq.Dao.SysDept;
import org.apache.ibatis.hq.mapper.SysDeptMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author huangqiang
 * @Title: Main
 * @Package org.apache.ibatis.hq
 * @Description:
 * @email 1308607536@qq.com
 * @date 2018/12/1014:57
 */
public class Main {

    public static void main(String[] args) throws IOException {
        String resource = "resources/config/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession session = sqlSessionFactory.openSession();
        try {
            SysDeptMapper mapper = session.getMapper(SysDeptMapper.class);
            SysDept sysDept = mapper.get(3);
            System.out.println(sysDept);
        } finally {
            session.close();
        }
    }
}
