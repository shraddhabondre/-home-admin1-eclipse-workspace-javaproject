package com.bridgelab.week1;

import Utility.Util;

public class Windchill {
	public static void main(String args[])
	{
		int t=Integer.parseInt(args[0]);
		int v=Integer.parseInt(args[1]);
		int w=Integer.parseInt(args[2]);
		Util.findTemp(t, v, w);
	}

}
