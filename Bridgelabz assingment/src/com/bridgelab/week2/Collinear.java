package com.bridgelab.week2;

public class Collinear {
	public static void main(String args[])
	{
		int x1=Integer.parseInt(args[0]);
		int y1=Integer.parseInt(args[1]);
		int x2=Integer.parseInt(args[2]);
		int y2=Integer.parseInt(args[3]);
		int x3=Integer.parseInt(args[4]);
		int y3=Integer.parseInt(args[5]);
		MathFunction.checkCollinear(x1, y1, x2, y2, x3, y3);
	}

}
