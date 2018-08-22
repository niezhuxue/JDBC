package com.nzx.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.nzx.utils.DBPoolUtil;
import com.nzx.utils.DBUtil;

/**
 * 测试jdbc增删改查
 * 
 * */
public class Demo1 {

	public static void main(String[] args) {
		Demo1 d = new Demo1();
		//查询
		d.query();
		//新增
		//修改
		//删除
	}
	
	public void query(){
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		String sql = "select * from t_person where id = '1001'";
		try{
			//jdbc操作
			//conn = DBUtil.getConnection();
			//c3p0连接池操作
			  conn = DBPoolUtil.getConnection();
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			while(rs.next()){
				System.out.println("id="+rs.getString("id")+",userName="+rs.getString("username"));
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			//jdbc
			//DBUtil.close(conn, pst, rs);
			//c3p0
			DBPoolUtil.close(conn, pst, rs);
		}
	}
}
