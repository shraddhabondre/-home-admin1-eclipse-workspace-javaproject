package com.bridgelab.week1;
import java.util.*;

import Utility.Util;
public class Repeatno {
public static void main(String args[])
{
	
int i,size;
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of array ");
size=Integer.parseInt(args[0]);
int[]arr=new int[size];
System.out.println("enter the array elements ");

for(i = 0; i < size; i++) 
{
	arr[i]=sc.nextInt();
}


Util.findRepeatNo(arr, size);
}
}