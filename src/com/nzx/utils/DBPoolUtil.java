package com.nzx.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * 使用c3p0连接池操作数据库
 * */
public class DBPoolUtil {
	//声明数据源对象
	private static DataSource datasource = null;
	//加载配置
	static{
		datasource = new ComboPooledDataSource("mysql");
	}
	
	//获取连接
	public static Connection getConnection(){
		Connection conn = null;
		try {
			conn = datasource.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	//关闭连接
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
				pst.close();
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
