package com.zju.homework.dao;

import com.zju.homework.bean.DateofWork;
import com.zju.homework.bean.Person;
import com.zju.homework.service.BaseService;

public class Test {
 
	public static void main(String[] args)
	{
		Person p= new Person("���ɹ�");
		NativeOfPersonEachPlace np =new NativeOfPersonEachPlace();
		System.out.println(np.Num_NativeOfPerson(p));
//		DateofWork dateofWork = new DateofWork();
//		dateofWork.setYear(2016);
//		dateofWork.setMonth_year(1);
//		NumofPersonEachMonth eachMonth = new NumofPersonEachMonth();
//		int n = eachMonth.getNumOfPersonByMonthOfYear(dateofWork);
//		System.out.println(n);
		
//		 String[] array = {"�Ϻ�","�㽭","��ɳȺ��","����","̨��","����","���","����","����","����",
//					"����","�㶫","����","����","�ӱ�","ɽ��","���","����","����","�ຣ","����","����","�½�",
//					"����","���ɹ�","������","����","����","����","�Ĵ�","����","����","����","ɽ��","����"};
//			for (String a :array)
//			{
//				p.setBirthPlace(a);
//				
//				System.out.println(a+"�ط���"+np.Num_NativeOfPerson(p));
//				System.out.println(p.getBirthPlace());
//			}
		
	}
    
    
   
}