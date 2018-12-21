package com.bridgelab.week2;

import Utility.Util;

public class Monthlycalender {
	public static void main(String args[])
	{
		
		int m=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		
		String months[]= {"","january","february","march","april","may","june","july","august","september","octomber","november","december",};
	int days[]= {0,31,28,31,30,31,30,31,31,30,31,30,31};
	if(m==2 && Util.findLeapyear(y))days[m]=29;
	System.out.println("month is: "+months[m]+ " "+y);
	System.out.println("S MO TU WED TH FR SAT");
	int d=Util.calculateDay(m,1,y);
	
	
		for(int i=0;i<d;i++)
		{
			System.out.print("   ");
		}
		for(int i=1;i<=days[m];i++)
		{
			System.out.printf("%2d ",i);
	
		if(((i+d)%7==0 || (i==days[m])))
			System.out.println();
		}	
			
	}

}
