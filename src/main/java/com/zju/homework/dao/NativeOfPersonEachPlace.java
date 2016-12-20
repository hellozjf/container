package com.zju.homework.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.zju.homework.bean.Person;
import com.zju.homework.utils.MysqlUtil;

public class NativeOfPersonEachPlace {

	public int Num_NativeOfPerson(Person person) {
		Connection conn = MysqlUtil.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs =null;
		int num=0;
		
		String sql = "select count(DISTINCT driver) from container where birthplace LIKE '"+person.getBirthPlace()+"%'";
		
		try {
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			while(rs.next())
			{
				num=rs.getInt("COUNT(DISTINCT driver)");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			MysqlUtil.close(conn, stmt, rs);
		}
		
		return num;
	}

	
}
