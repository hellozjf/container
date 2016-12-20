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

import com.zju.homework.bean.Person;
import com.zju.homework.dao.NativeOfPersonEachPlace;

@SuppressWarnings("serial")
public class NativeOfPersonServlet extends HttpServlet {
	
	 JsonBuilderFactory bf = Json.createBuilderFactory(null);
	 Person p =new Person();
	 NativeOfPersonEachPlace np = new NativeOfPersonEachPlace();
		
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req,resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/heml;chartset=utf-8");
		JsonArrayBuilder json = bf.createArrayBuilder();
		String[] array = {"�Ϻ�","�㽭","��ɳȺ��","����","̨��","����","���","����","����","����",
				"����","�㶫","����","����","�ӱ�","ɽ��","���","����","����","�ຣ","����","����","�½�",
				"����","���ɹ�","������","����","����","����","�Ĵ�","����","����","����","ɽ��","����"};
		for (String a :array)
		{
			p.setBirthPlace(a);
			json.add(np.Num_NativeOfPerson(p));
		}
		JsonArray json1 = json.build();
		PrintWriter out = resp.getWriter();
		out.println(json1);
		out.flush();
		out.close();
		
	}
}
