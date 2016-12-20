package com.zju.homework.dao;

import com.zju.homework.bean.DateofWork;
import com.zju.homework.bean.Person;
import com.zju.homework.service.BaseService;

public class Test {
 
	public static void main(String[] args)
	{
		Person p= new Person("内蒙古");
		NativeOfPersonEachPlace np =new NativeOfPersonEachPlace();
		System.out.println(np.Num_NativeOfPerson(p));
//		DateofWork dateofWork = new DateofWork();
//		dateofWork.setYear(2016);
//		dateofWork.setMonth_year(1);
//		NumofPersonEachMonth eachMonth = new NumofPersonEachMonth();
//		int n = eachMonth.getNumOfPersonByMonthOfYear(dateofWork);
//		System.out.println(n);
		
//		 String[] array = {"上海","浙江","西沙群岛","澳门","台湾","甘肃","香港","宁夏","陕西","安徽",
//					"湖北","广东","福建","北京","河北","山东","天津","江苏","海南","青海","吉林","西藏","新疆",
//					"河南","内蒙古","黑龙江","云南","广西","辽宁","四川","重庆","贵州","湖南","山西","江西"};
//			for (String a :array)
//			{
//				p.setBirthPlace(a);
//				
//				System.out.println(a+"地方："+np.Num_NativeOfPerson(p));
//				System.out.println(p.getBirthPlace());
//			}
		
	}
    
    
   
}