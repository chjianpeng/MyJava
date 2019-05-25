package com.myCompany.jdbc;

import org.junit.Test;

import java.sql.*;
import java.util.Hashtable;

public class JDBCTest {

    public void login(String userName, String password){
        try {
            //1、注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2、获取链接
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb",
                    "root", "123456");
            //3、创建执行sql的对象
            Statement statement = connection.createStatement();
            //4、写sql语句
            String sql= "select * from user_info where name = '"+userName+"'"+"and password = '"+password+"'";
            //5、执行sql语句
            ResultSet resultSet = statement.executeQuery(sql);

            if (resultSet.next()){
                System.out.println("登录成功！");
            }else {
                System.out.println("账号或密码错误。");
            }
            //6、关闭资源
            if (resultSet != null) resultSet.close();
            if (statement != null) statement.close();
            if (connection != null) connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 预处理对象，防止sql注入攻击
     * @param userName
     * @param password
     */
    public void loginNew(String userName, String password){
        try {
            //1、注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2、获取链接
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb",
                    "root", "123456");
            //3、写sql语句
            String sql= "select * from user_info where name = ? and password = ?";
            //4、创建执行sql的对象
            PreparedStatement statement = connection.prepareStatement(sql);
            //5、设置参数（给占位符）
            statement.setString(1, userName);
            statement.setString(2, password);
            //6、执行sql语句
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()){
                System.out.println("登录成功！");
            }else {
                System.out.println("账号或密码错误。");
            }
            //6、关闭资源
            if (resultSet != null) resultSet.close();
            if (statement != null) statement.close();
            if (connection != null) connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void testLogin(){
        Hashtable hashtable = new Hashtable();

        login("张三","123");
        login("张三 'or' 张三","123");
        loginNew("张三","123");
        loginNew("张三 'or' 张三","123");
    }
}
