package org.apache.ibatis.hq.Dao;

import java.io.Serializable;
import java.util.Date;

/**
 * @author huangqiang
 * @Title: SysDept
 * @Package org.apache.ibatis.hq.mapper
 * @Description:
 * @email 1308607536@qq.com
 * @date 2018/12/1014:43
 */
public class SysDept implements Serializable{

    private Integer id;
    private String name;
    private Integer parent_id;
    private String level;
    private Integer seq;
    private String remark;
    private String operator;
    private Date operate_time;
    private String operate_ip;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParent_id() {
        return parent_id;
    }

    public void setParent_id(Integer parent_id) {
        this.parent_id = parent_id;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Date getOperate_time() {
        return operate_time;
    }

    public void setOperate_time(Date operate_time) {
        this.operate_time = operate_time;
    }

    public String getOperate_ip() {
        return operate_ip;
    }

    public void setOperate_ip(String operate_ip) {
        this.operate_ip = operate_ip;
    }

    @Override
    public String toString() {
        return "SysDept{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", parent_id=" + parent_id +
                ", level='" + level + '\'' +
                ", seq=" + seq +
                ", remark='" + remark + '\'' +
                ", operator='" + operator + '\'' +
                ", operate_time=" + operate_time +
                ", operate_ip='" + operate_ip + '\'' +
                '}';
    }
}
