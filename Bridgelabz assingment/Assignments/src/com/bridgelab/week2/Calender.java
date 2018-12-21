//@purpose:to calculate present amount
//@author:shraddha bondre
//@since:18/12/2018
//@version=1.0


package com.bridgelab.week2;

import Utility.Util;

public class Calender {
	public static void main(String[] args)
	{
		int d=Integer.parseInt(args[0]);
		int m=Integer.parseInt(args[1]);
		int y=Integer.parseInt(args[2]);
		
		String week[]= {"Sunday","Monday","Tuesday","Wednesday","thrusday","Friday","Saturday"};
		int out=Util.calculateDay(d, m, y);
		System.out.println("Day is "+week[out]);

	}
	}


