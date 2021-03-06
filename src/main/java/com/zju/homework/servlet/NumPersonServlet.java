package com.zju.homework.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonBuilderFactory;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zju.homework.bean.DateofWork;
import com.zju.homework.dao.NumofPersonEachMonth;

@SuppressWarnings("serial")
public class NumPersonServlet extends HttpServlet
{
	 JsonBuilderFactory bf = Json.createBuilderFactory(null);
	NumofPersonEachMonth num = new NumofPersonEachMonth();
	DateofWork date = new DateofWork();
	@Override
	public void init(ServletConfig config) throws ServletException {
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req,resp);
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/heml;chartset=utf-8");
		String year = req.getParameter("year");
		int year1 = Integer.parseInt(year);
		String month = req.getParameter("month");
		int month1=Integer.parseInt(month);
		
		
		
		PrintWriter out=resp.getWriter();
		
		JsonArrayBuilder json = bf.createArrayBuilder();
	
		if(month1-12 <= 0)
		{
			
			for(int i =month1+1; i<13;i++)
			{
				date.setYear(year1-1);
				date.setMonth_year(i);
				json.add(num.getNumOfPersonByMonthOfYear(date));
			}
			for(int i =1;i<=month1;i++)
			{
				date.setYear(year1);
				date.setMonth_year(i);
				json.add(num.getNumOfPersonByMonthOfYear(date));
			}
		}
		
		
		
		JsonArray json3 = json.build();
		
		out.println(json3);
//		out.println("year is:"+year1);
//		out.println("month is:"+month2);
		out.flush();
		out.close();
	}
	
	
	
	
}
