package com.bridgelab.week1;
import java.util.*;

import Utility.Util;

public class Taylorseries {
	public static void main(String args[])

	{
		int n;
	  
        double x = 0;
	   Scanner sc= new Scanner(System.in);

	    n=sc.nextInt();

	    double a[]=new double[n];
	    for(int i=0;i<n;i++)
	    {
	      a[i]=sc.nextDouble();
	    }

	    for(int i=0;i<n;i++)
	    {
	  
        Util.calc(x);
	    }
	  }}

