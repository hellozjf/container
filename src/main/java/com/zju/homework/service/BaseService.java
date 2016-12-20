package com.zju.homework.service;

import java.util.HashMap;

import com.zju.homework.bean.DateofWork;
import com.zju.homework.bean.Person;
import com.zju.homework.dao.AverageWorkDaysEachMonth;
import com.zju.homework.dao.NativeOfPersonEachPlace;
import com.zju.homework.dao.NumOfWorkEachMonth;
import com.zju.homework.dao.NumberOfChangeEachMonth;
import com.zju.homework.dao.NumofPersonEachMonth;

public class BaseService {
	
		public static int NUM = 3098;/*���д�ҵ��Ա����*/

		DateofWork date;
		Person person;
		NativeOfPersonEachPlace nop;
		NumberOfChangeEachMonth nc;
		NumOfWorkEachMonth nw;
		AverageWorkDaysEachMonth aw;
		
		public BaseService()
		{
			
		}
		public BaseService(DateofWork date)
		{
			this.date = date;
		}
		
		public BaseService(Person p)
		{
			this.person=p;
		}
		
		HashMap<Integer,Object> map = new HashMap<Integer,Object> ();
		
		NumofPersonEachMonth np=new NumofPersonEachMonth();
		int num =np.getNumOfPersonByMonthOfYear(date);
		
		
		
		public int numofPersonMonthOfYear()/*���㵱�µ���ְ����*/
		{
			return num;
		}
		
		public double getRateofChange()/*���㵱�µı䶯����ռ��*/
		{
			nc = new NumberOfChangeEachMonth();
			double rc = nc.rateOfPersonChange(date)/num;
			return rc;
		}
		
		public double getRateOfWork()/*���㵱�µĹ�������ռ��*/
		{
			nw = new NumOfWorkEachMonth();
			double ro = nw.rateOfWorkPerson(date)/num;
			return  ro;
		}
	
		public double averageWorkday()/*���㵱�µ�ƽ������ռ��*/
		{
			aw = new AverageWorkDaysEachMonth();
			return aw.AverageWorkDays(date);
			
		}

	
		public int nativePerson()/*������Ա���������*/
		{
			nop= new NativeOfPersonEachPlace();
			return nop.Num_NativeOfPerson(person);
		}
		
		public double nativePersonScale()/*������Ա����ı���*/
		{
			nop = new NativeOfPersonEachPlace();
			return nop.Num_NativeOfPerson(person)/NUM;
		}
	
}
