package com.bridgelab.week1;

import Utility.Util;

public class Gamling {
	 public static void main(String[] args) {
			

		 int stake  = Integer.parseInt(args[0]);    // gambler's stating bankroll
	     int goal   = Integer.parseInt(args[1]);    // gambler's desired bankroll
	     int trials = Integer.parseInt(args[2]);    // number of trials to perform
	     Util.getGambler(stake, goal, trials);
	}
	

}
