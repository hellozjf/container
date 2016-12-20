package com.zju.homework.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.zju.homework.bean.DateofWork;
import com.zju.homework.utils.MysqlUtil;

public class NumberOfChangeEachMonth  {

	public int rateOfPersonChange(DateofWork date) {
		Connection conn = MysqlUtil.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs =null;
		int num = 0;
		String sql = "select count(driver) from container where year="+date.getYear()+" and month="+date.getMonth_year()
						+" and changework=1";
		
		try {
			stmt = conn.prepareStatement(sql);
			rs=stmt.executeQuery();
			while(rs.next())
			{
				num = rs.getInt("count(driver)");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			MysqlUtil.close(conn, stmt, rs);
		}
		return num;
	}

}
