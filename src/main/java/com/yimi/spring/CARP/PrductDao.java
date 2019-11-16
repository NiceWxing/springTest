package com.yimi.spring.CARP;

public class PrductDao {

    private DBConnection dbConnection;

    public void setDbConnection(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void addProduct(){
        String coon = dbConnection.getConnection();
        System.out.println("使用"+coon+"增加产品");
    }
}
