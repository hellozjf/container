package com.zju.homework.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonBuilderFactory;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zju.homework.bean.DateofWork;
import com.zju.homework.dao.NumOfWorkEachMonth;

@SuppressWarnings("serial")
public class NumOfWorkServlet extends HttpServlet {
	JsonBuilderFactory bf = Json.createBuilderFactory(null);
	DateofWork date =new DateofWork();
	NumOfWorkEachMonth num = new NumOfWorkEachMonth();
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/heml;chartset=utf-8");
		String year = req.getParameter("year");
		int year1 = Integer.parseInt(year);
		String month = req.getParameter("month");
		int month1=Integer.parseInt(month);
		
		PrintWriter out = resp.getWriter();
		JsonArrayBuilder json = bf.createArrayBuilder();
		
		
		DateofWork date1 = new DateofWork(year1,month1,1,7);
		DateofWork date2 = new DateofWork(year1,month1,8,14);
		DateofWork date3 = new DateofWork(year1,month1,15,21);
		DateofWork date4 = new DateofWork(year1,month1,22,31);
		
		json.add(num.rateOfWorkPerson(date1)).add(num.rateOfWorkPerson(date2)).add(num.rateOfWorkPerson(date3)).add(num.rateOfWorkPerson(date4));
		JsonArray json1 = json.build();
		
		out.println(json1);
		out.flush();
		out.close();
	}
}
