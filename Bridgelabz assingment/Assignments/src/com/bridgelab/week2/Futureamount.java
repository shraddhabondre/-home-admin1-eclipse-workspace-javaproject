//@purpose:to calculate present amount
//@author:shraddha bondre
//@since:18/12/2018
//@version=1.0



package com.bridgelab.week2;

public class Futureamount {
	public static void main(String args[])
	{
		double c=Double.parseDouble(args[0]);
		double r=Double.parseDouble(args[1]);
		int t=Integer.parseInt(args[1]);
		MathFunction.calculateFutureAmount(c, r, t);
	}

}
