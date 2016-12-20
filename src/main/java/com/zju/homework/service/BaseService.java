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
	
		public static int NUM = 3098;/*所有从业人员数量*/

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
		
		
		
		public int numofPersonMonthOfYear()/*计算当月的在职人数*/
		{
			return num;
		}
		
		public double getRateofChange()/*计算当月的变动人数占比*/
		{
			nc = new NumberOfChangeEachMonth();
			double rc = nc.rateOfPersonChange(date)/num;
			return rc;
		}
		
		public double getRateOfWork()/*计算当月的工作天数占比*/
		{
			nw = new NumOfWorkEachMonth();
			double ro = nw.rateOfWorkPerson(date)/num;
			return  ro;
		}
	
		public double averageWorkday()/*计算当月的平均天数占比*/
		{
			aw = new AverageWorkDaysEachMonth();
			return aw.AverageWorkDays(date);
			
		}

	
		public int nativePerson()/*计算人员籍贯的数量*/
		{
			nop= new NativeOfPersonEachPlace();
			return nop.Num_NativeOfPerson(person);
		}
		
		public double nativePersonScale()/*计算人员籍贯的比例*/
		{
			nop = new NativeOfPersonEachPlace();
			return nop.Num_NativeOfPerson(person)/NUM;
		}
	
}
