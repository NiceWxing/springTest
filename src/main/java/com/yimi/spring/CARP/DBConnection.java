package com.yimi.spring.CARP;


/**
 * 合成复用原则
 * 尽量使用对象组合/聚合，而不是继承关系达到软件复用的目的
 */
public class DBConnection {

    public String getConnection(){
        return "My Sql数据库连接";
    }
}
