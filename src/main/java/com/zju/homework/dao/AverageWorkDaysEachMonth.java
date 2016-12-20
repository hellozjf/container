package com.zju.homework.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.zju.homework.bean.DateofWork;
import com.zju.homework.utils.MysqlUtil;

public class AverageWorkDaysEachMonth {


	public double AverageWorkDays(DateofWork date) {
		
		Connection conn = MysqlUtil.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs =null;
		double average=0;
		
		String sql = "select AVG(workdays) from container where year="+date.getYear()+" and month="+date.getMonth_year();
		try {
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			while(rs.next()){
				average = rs.getDouble("AVG(workdays)");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			MysqlUtil.close(conn, stmt,rs);
		}
		
		return average;
	}

}
