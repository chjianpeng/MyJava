package com.myCompany.thread;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 在单线程中可能会维持一个全局的数据库连接，并且在程序启动时会初始化这个连接对象，避免在调用每个方法时都要
 * 传递一个Connection对象。通过将JDBC的连接保存到ThreadLocal对象中，每个线程都会有属于自己的连接。
 *
 */
public class ThreadLocalDemo {

    private static ThreadLocal<Connection> connectionThreadLocal = new ThreadLocal<Connection>(){
        public Connection initValue() throws SQLException {
            return DriverManager.getConnection("");
        }
    };

    public static Connection getConnection(){
        return connectionThreadLocal.get();
    }

    public static void main(String[] args) {

        Connection connection = getConnection();
        System.out.println(connection);
    }
}
