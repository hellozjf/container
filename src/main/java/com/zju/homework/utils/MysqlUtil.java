package com.zju.homework.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class MysqlUtil {
	private static String driver = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://127.0.0.1:3306/warehouse?useUnicode=true&characterEncoding=UTF-8";
	private static String user = "root";
	private static String pwd = "root";

	static{
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnection(){
		Connection conn=null;
		try {
			conn = DriverManager.getConnection(url,user,pwd);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
		
	}
	
	public static void close(Connection conn,PreparedStatement stat,ResultSet rs){
		try {
			if(rs!=null){
				rs.close();
				rs=null;
			}
			if(stat!=null){
				stat.close();
				stat=null;
			}
			if(conn!=null){
				conn.close();
				conn=null;
			}
		} catch (SQLException e) {
				e.printStackTrace();
		}
		
	}
	
	public static void close(Connection conn,PreparedStatement stat){
		try {
			if(stat!=null){
				stat.close();
				stat=null;
			}
			if(conn!=null){
				conn.close();
				conn=null;
			}
		} catch (SQLException e) {
				e.printStackTrace();
		}
		
	}

}
