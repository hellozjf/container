package com.zju.homework.bean;

public class DateofWork {
	
	private int year;
	private int month_year;
	private int maxWorkdays;
	private int minWorkdays;
	
	
	public DateofWork() {
		super();
	}
	
	

	public DateofWork(int year, int month_year, int minWorkdays, int maxWorkdays) {
		super();
		this.year = year;
		this.month_year = month_year;
		this.maxWorkdays = maxWorkdays;
		this.minWorkdays = minWorkdays;
	}



	public DateofWork(int year, int month_year)
	{
		this.year = year;
		this.month_year = month_year;
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth_year() {
		return month_year;
	}
	public void setMonth_year(int month_year) {
		this.month_year = month_year;
	}



	public int getMaxWorkdays() {
		return maxWorkdays;
	}



	public void setMaxWorkdays(int maxWorkdays) {
		this.maxWorkdays = maxWorkdays;
	}



	public int getMinWorkdays() {
		return minWorkdays;
	}



	public void setMinWorkdays(int minWorkdays) {
		this.minWorkdays = minWorkdays;
	}



	

	
	
	
}
