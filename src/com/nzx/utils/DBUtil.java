package com.nzx.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtil {

	//数据库连接参数
	private static String driver;
	private static String url;
	private static String username;
	private static String password;
	
	static{
		try {
			//1、通过反射获取类加载器
			ClassLoader loader = DBUtil.class.getClassLoader();
			//2、获取输入流对象
			InputStream is = loader.getResourceAsStream("jdbc.properties");
			//3、创建Properties对象
			Properties p = new Properties();
			//4、将输入流放入对象
			p.load(is);
			//5、赋值
			driver = p.getProperty("driver");
			url = p.getProperty("url");
			username = p.getProperty("username");
			password = p.getProperty("password");
		} catch (IOException e) {
			System.out.println("读取配置文件出错。。。。。");
			e.printStackTrace();
		}
	}
	
	/** 
	 * 获取Connection对象
	 * */
	public static Connection getConnection(){
		Connection conn = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	/**
	 * 关闭资源
	 * */
	public static void close(Connection conn,PreparedStatement pst,ResultSet rs){
		if(rs != null){
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(pst != null){
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(conn != null){
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
