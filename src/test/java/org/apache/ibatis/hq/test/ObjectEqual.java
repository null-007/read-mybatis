package org.apache.ibatis.hq.test;

import org.apache.ibatis.hq.Dao.SysDept;
import org.apache.ibatis.hq.mapper.SysDeptMapper;

/**
 * @author huangqiang
 * @Title: ObjectEqual
 * @Package org.apache.ibatis.hq.test
 * @Description:
 * @email 1308607536@qq.com
 * @date 2018/12/2121:40
 */
public class ObjectEqual {

    public static void main(String[] args) {
        // false
        System.out.println(Object.class.equals(ObjectEqual.class));
        // false
        System.out.println(Object.class.equals(SysDeptMapper.class));
    }
}
