package com.ioc.instanceFactory;

import org.springframework.beans.factory.FactoryBean;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @ClassName ConnectionFactory
 * @Description
 * @Author Wangyw
 */
public class ConnectionFactory {
    private String driver;
    private String url;
    private String username;
    private String password;

    public Connection getConnection() throws Exception{
        getClass().forName(driver);
        return DriverManager.getConnection(url,username,password);
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
