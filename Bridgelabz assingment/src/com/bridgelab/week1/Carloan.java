package com.bridgelab.week1;

import Utility.Util;

public class Carloan {
public static void main(String args[])
{
	double P=Double.parseDouble(args[0]);
	double Y=Double.parseDouble(args[1]);
	double R=Double.parseDouble(args[2]);
	Util.calculateCarloan(P, Y, R);
	
}
}
