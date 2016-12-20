package com.zju.homework.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.zju.homework.bean.DateofWork;
import com.zju.homework.utils.MysqlUtil;

public class NumOfWorkEachMonth{

	
	public int rateOfWorkPerson(DateofWork date) {
		Connection conn = MysqlUtil.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		int num = 0;
		String sql="";
		
		if(date.getMinWorkdays()<0 && date.getMaxWorkdays()>31)
		{
			return 0;
		}else
		{
			sql = "select COUNT(driver) from container where year="+date.getYear()+" and month="+date.getMonth_year()+
					" and "+date.getMinWorkdays()+"<=workdays and workdays<="+date.getMaxWorkdays();
		}
		try {
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			while(rs.next())
			{
				num = rs.getInt("COUNT(driver)");
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
