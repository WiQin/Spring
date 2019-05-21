package com.ioc.staticFactory;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @ClassName ConnectionFactory
 * @Description
 * @Author Wangyw
 */
public class ConnectionFactory {
    private static String driver = "oracle.jdbc.driver.OracleDriver";
    private static String url = "jdbc:oracle:thin:127.0.0.1:ORCL";
    private static String username = "wangyw";
    private static String password = "wangyw";

    public static Connection getConnection() throws Exception{
        Class.forName(driver);
        return DriverManager.getConnection(url,username,password);
    }

}
