package com.bridgelab.week2;

import java.util.Scanner;

public class MathFunction {
	
	// to return harmonic number
	public static int tocheckHarmonic(int num)
	{ 
		
	double result = 0.0;
	while(num > 0){
		result = result + (double) 1 / num;
		num--;
	}
	System.out.println("Output of Harmonic Series is "+result);
return num;
}
	
        //to return sine of angle
public static int tocalculateSinDegree(int degree)
{

    Scanner sc=new Scanner(System.in);
    System.out.println("enter the degree");
   
  
    double radians = Math.toRadians(degree); 

    // sin() method to get the sine value 
    double sinValue = Math.sin(radians); 

    // prints the sine value 
    System.out.println("sin(" + degree + ") = " + sinValue);

return degree;
}

    // to return cosine angle
public static int calculateCosineDegree(int degree)
{

    System.out.println("enter the degree");
    
  
    double radians = Math.toRadians(degree); 

    // sin() method to get the cos value 
    double cosvalue= Math.cos(radians); 

    // prints the cos value 
    System.out.println("cos(" + degree + ") = " + cosvalue);
    return degree;
}

     // to return binary numbers
public static int toreturnBinaryNo(int num)

{
	System.out.println(Integer.toBinaryString(num));
	return num;
}


      //to calculate factorials
       /* num=input for factorial number */

	public static int tocalculateFactorials(int num)
	{
		
		int fact=1;
		System.out.println("Enter the number: ");
		for(int i=1;i<=num;i++)
		{
		fact=fact * i;
		}
		System.out.println("factorial is:"+fact);
		return num;
		
	}


      // to return max and min number in array
	

public static void findMaxandMin()
{  int i, j, x;
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of array ");
  int n=sc.nextInt();
  int a[] = new int[n];
  System.out.println("enter the array elements: "); 
	 for (i = 0; i < n; i++)
     {
  	   a[i] = sc.nextInt();
     }
  
       for (i = 0; i < n; i++)
  {

  for (j = i + 1; j < n; j++)
  {
      if (a[i] < a[j])
      {
          x = a[i];
          a[i] = a[j];
          a[j] = x;
      }}}
      System.out.println("max num is "+a[0]);
      System.out.println("min num is "+a[n-1]);
      
}
 

// to calculate prime numbers
public static int calculatePrimenos(int n) {
	int p;
	
	System.out.println("Enter number :");
	
	for(int i=2;i<n;i++)
	{
	p=0;
	for(int j=2;j<i;j++)
	{
	if(i%j==0)
	p=1;
	}
	if(p==0){
	System.out.println(i);
	}
	}
	return n;
}
   //to calculate present value
public static double calculatePresentAmount(double c,double r,int t)
{
	double p;
	p=c/Math.pow((1+r), t);
	System.out.println("present amount is "+p);
	return p;
	
}

  // to calculate future value
public static double calculateFutureAmount(double c,double r,int t)
{
	double p;
	p=c * Math.pow((1+r), t);
	System.out.println("Future value is: "+p);
	return p;
}

  /// to calculate square root
public static double getSquare(double c)
{

double epsilon = 1e-15;    // relative error tolerance
double t = c;              // estimate of the square root of c


while (Math.abs(t - c/t) > epsilon*t) {
    t = (c/t + t) / 2.0;
}

// print out the estimate of the square root of c
System.out.println("estimated of the square root :"+t);
return t;
}


               //square root by overloding
public static double getSquare(double x,double epsilon)
{
		
  //  double epsilon = 1e-15;    // relative error tolerance
    double t = epsilon;              // estimate of the square root of c
    while (Math.abs(t - x/t) > epsilon*t) 
    {
        t = (x/t + t) / 2.0;
    }
    System.out.println("square root :"+t);
return x;
}

 // calculate day for date
public static int calculateDay(int d,int m,int y)
{ int x;
	Scanner sc= new Scanner(System.in);

		System.out.println("Enter the number: ");
		if(d<0 || m<0 || y<0)
		{
		 d=sc.nextInt();
	     m=sc.nextInt();
	     y=sc.nextInt();
	    calculateDay(d,m,y);
		}
		y = y-(14- m) / 12;
	     x = y + y/4-y/100 + y/400;
	    m = m + 12 * ((14-m) / 12)-2;
	  d =(d+x+31*m/12)%7;
	  return d;
}

   // to calculate month calender
public static int calculatemonth(int m,int y)
{
	System.out.println("enter the month and year: ");
	
           y = y-(14- m) / 12;
           m = m + 12 * ((14-m) / 12)-2;
           return m;


}
            // to calculate collinear slopes
public static void checkCollinear(int x1,int y1,int x2,int y2,int x3,int y3)
{
	int z=(y2-y1)/(x2-x1);
	int z1=(y3-y2)/(x3-x2);
	int z2=(y3-y1)/(x3-x1);
	if(z==z1 && z==z2 && z1==z2)
	{
		System.out.println("lines are collinear");
	}
	else
	{
		System.out.println("lines are non collinear");
	}

}

              //to claculate area of triangle by determinanat method
public static void calculateDeterminant(int x1,int y1,int x2,int y2,int x3,int y3)
{ 
	int a=x1*(y2-y3)+
	          x2*(y3-y1)+
	          x3*(y2-y3);
	    if(a==0)
	    {
	        System.out.println("Tree point are Collinear");
	    }
	    else if(a!=0)
	    {
	        System.out.println("Tree point are Collinear");
	    }
	    }    
	
}



































