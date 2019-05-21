package com.ioc.factory;

import org.springframework.beans.factory.FactoryBean;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @ClassName ConnectionFactory
 * @Description
 * @Author Wangyw
 */
public class ConnectionFactory implements FactoryBean<Connection> {
    private String driver;
    private String url;
    private String username;
    private String password;

    //返回工厂产生的产品（Connection）
    @Override
    public Connection getObject() throws Exception {
        getClass().forName(driver);
        return DriverManager.getConnection(url,username,password);
    }

    //返回产品类型
    @Override
    public Class<?> getObjectType() {
        return Connection.class;
    }

    //产品是否单例
    @Override
    public boolean isSingleton() {
        return false;
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
