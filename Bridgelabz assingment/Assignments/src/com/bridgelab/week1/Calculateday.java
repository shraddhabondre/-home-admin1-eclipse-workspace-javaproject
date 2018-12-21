package com.bridgelab.week1;

import Utility.Util;

public class Calculateday {
public static void main(String[] args)
{
	int m=Integer.parseInt(args[0]);
	int d=Integer.parseInt(args[1]);
	int y=Integer.parseInt(args[2]);
	
	String week[]= {"Sunday","Monday","Tuesday","Wednesday","thrusday","Friday","Saturday"};
	int out=Util.calculateDay(m, d, y);
	System.out.println("Day is "+week[out]);

}
}
