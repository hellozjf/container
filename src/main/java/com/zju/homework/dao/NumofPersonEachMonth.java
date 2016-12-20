package com.zju.homework.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.zju.homework.bean.DateofWork;
import com.zju.homework.utils.MysqlUtil;

public class NumofPersonEachMonth {

	
	public int getNumOfPersonByMonthOfYear(DateofWork date) {
		Connection conn =MysqlUtil.getConnection();
		PreparedStatement stmt=null;
		ResultSet rs=null;
		String sql = "select driver from container where year="+date.getYear()+" and month="+date.getMonth_year();
		int num = 0;
		try {
			stmt = conn.prepareStatement(sql);
			 rs = stmt.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getString(1));
				num +=1;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			MysqlUtil.close(conn, stmt,rs);
			
		}
		return num;
	}
	

}
