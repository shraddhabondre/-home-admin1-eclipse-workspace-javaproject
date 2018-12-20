package Utility;
import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;
	public class Util{
		 static Scanner input= new Scanner(System.in);
		private static double[] args;
			public static String inputstring()
			{
				return input.nextLine();
			}
			public static Integer inputint()
			{
			return input.nextInt();
			}  
			
			//to reverse the string//
			
	public static String revname()

	{
		 System.out.println("Enter the string");
	
	 String str=input.nextLine();
	 String[] str1=str.split(" ");
	 
		for (int i = str1.length - 1 ; i >= 0 ; i--)
		{  
			System.out.print(str1[i]);
			i--;
			System.out.print(str1[i]);
			i--;
			System.out.print(str1[i]);
			
		}
		return revname();
		
	}
               //to draw th pattern
	public static void pattern()
	{
		int i,j,k;
		int count=6;
		for(i=0;i<=11;i++)
		{
		
			for(j=0;j<2;j++)
			{
				System.out.printf("*");
		}
			for(k=0;k<=6;k++)
			{
				if(k==count)
				{
			
				System.out.printf("***");
			}
				else
				{
					System.out.printf("  ");
				}
			}
			if(i<=5)	
			{
			count--;
			}
			else if(i<=11)
			{
				count++;
			}
			System.out.printf("\n");
	}}
	
	
	public static void Dpattern()
	
	{
		int i,j,k;
		for(i=0;i<=9;i++)
		{
			for(j=0;j<2;j++)
			{
				if(j == 1 || ((i == 0 || i ==8) && 
			               (j > 1 && j < 6)) || (j == 6&& 
			                i != 0 && i !=8))
			
						System.out.print("*");
				else
				{
					System.out.print(" ");
				}
				System.out.println();
			              
			}}}
	             //to calculate intoperator
			public static void findIntopt()
			{
			
				long opt1,opt2,opt3,opt4;
				Scanner sc=new Scanner(System.in);
				System.out.println("enter the value of a");
		           int a=sc.nextInt();
		           System.out.println("enter the value of b");
		           int b= sc.nextInt();
		           System.out.println("enter the value of c");
		           int c= sc.nextInt();
				opt1=a+b*c;
				{
				
			System.out.println("value of opt1 is "+opt1);
				}
				
			opt2=1*b+c;
				{
					System.out.println("value of opt2 is "+opt2);
				}
				opt3=c+a/b;
				{
					System.out.println("value of opt3 is "+opt3);
				}
				
				opt4=a%b+c;
				{
					System.out.println("value of opt4 is "+opt4);
			}
			
			}
			       //to calculate doubleoperator
	public static void doubleopt()
	{
			double opt1,opt2,opt3,opt4;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the value of a");
	           double a=sc.nextDouble();
	           System.out.println("enter the value of b");
	           double b= sc.nextDouble();
	           System.out.println("enter the value of c");
	           double c= sc.nextDouble();
			opt1=a+b*c;
			{
			
		System.out.println("value of opt1 is "+opt1);
			}
			
		opt2=1*b+c;
			{
				System.out.println("value of opt2 is "+opt2);
			}
			opt3=c+a/b;
			{
				System.out.println("value of opt3 is "+opt3);
			}
			
			opt4=a%b+c;
			{
				System.out.println("value of opt4 is "+opt4);
		}
		
		}

               //to find leap year
	
	public static boolean findLeapyear(int year)
	{
		year = 1582;
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the year");
        int year1=sc.nextInt();
        
            if(year1%400==0||year1%4==0 && year1%100!=0)
            {
                
               return true;
                }
                else
                {
                	
                   return false;
                }
          
            
            }
	            //to find spring month
	public static void findSpring()
	{
	
		Scanner sc=new Scanner(System.in);
		System.out.printf("m is ");	
		int m=sc.nextInt();
		System.out.printf("d is ");	
	
		int d=sc.nextInt();
		
			if(m<=6&&d==20)
			{
			System.out.println("true");
		}
			else {
				System.out.println("false");
			}
	}
	           //to find quadratic roots
		
	public static void findQuadratic()
	{
		double root1,root2;
		Scanner sc=new Scanner(System.in);
		System.out.println("value of a is");
		int a= sc.nextInt();
		System.out.println("value of b is");
		int b= sc.nextInt();
		System.out.println("value of c is");
		int c= sc.nextInt();
		//System.out.println("value of x1 is");
		//int x1= sc.nextInt();
		//System.out.println("value of x2 is");
		//int x2= sc.nextInt();
		//System.out.println("value of root1 is");
		//double root1= sc.nextDouble();
		//System.out.println("value of root2 is");
		//double root2= sc.nextDouble();
		
		int delta = b * b - 4 * a * c;
		if(delta > 0) {
            root1 = (-b + Math.sqrt(delta)) / (2 * a);
            root2 = (-b - Math.sqrt(delta)) / (2 * a);
            {
            System.out.printf("root1 and root2 are ",+root1,+root2);
         
		}}
		else 
		{
           System.out.println("roots are not real");
		
		}
	}
	              //to find distance from origin
public static void findDistance()
{
int distance;
System.out.println("Argument is "+args[0]);
System.out.println("Argument is "+args[1]);
	  System.out.println(Math.pow(args[0],2)); 
	  System.out.println(Math.pow(args[1], 2));
	 double value=(Math.pow(args[0],2)*Math.pow(args[1], 2));
	  System.out.println(Math.sqrt(value));
}
	            //to find random number and avg
	public static void findRandom()
	{
		float sum=0;
		float avg;
		double x,max = 0,min=0;
		System.out.println("Random numbers between 0.0 and 1.0 are,");
	    for(int i=0; i < 5 ; i++)
	      System.out.println("Random Number ["+ (i+1) + "] : " + Math.random());
	    x=Math.random();
	     sum=(float) (sum + Math.random());
	     System.out.println("sum is "+sum);
	     avg=sum/5;
	     System.out.println("avg is "+avg);
	     max=Math.max(x, max);
	   System.out.println("max is "+max);
	   min=Math.min(x, min);
	   System.out.println("min is "+min);
	     
	}
	
                    //to findt temp
	public static void findTemp(double t,double v,double w)
	{
		
		System.out.printf("enter the temp"+t);
		System.out.printf("wind is"+v);
		w=35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v, 0.16);
		System.out.println("w is "+w);
	}
	
	   // to conversion of temprature
	public static void convertTemp() {

	   
	    
	        Scanner in = new Scanner(System.in);
	     
	        System.out.println("Enter temperature in Fahrenheit");
	       float temperature = in.nextInt();
	     
	        temperature = ((temperature - 32)*5)/9;
	     
	        System.out.println("temperature in Celsius = " + temperature);
	      System.out.println("enter the temp in celsius ");
   
	 
     float C = in.nextFloat();
     
    
     float F = C * (9f / 5) + 32;
   
     System.out.println("temperature in fahrenheite"+F);
    
 }

	          //to calculate car loan
	public static void calculateCarloan(double P,double Y,double R)
	{
		double n=12 * Y;
		double r=R/(12*100);
		double k=Math.pow(1+r, -n);
		double payment= P*r/1-k;
		System.out.println("payment is"+payment);
	}
	
              //to calculate trigonometric functions
	public static void calculateTrigonometric()
	{
		
		  
	        Scanner sc=new Scanner(System.in);
	        System.out.println("enter the degree");
	        double degree=sc.nextDouble();
	      
	        double radians = Math.toRadians(degree); 
	  
	        // sin() method to get the sine value 
	        double sinValue = Math.sin(radians); 
	  
	        // prints the sine value 
	        System.out.println("sin(" + degree + ") = " + sinValue); 
	        double cosValue = Math.cos(radians); 
	        System.out.println("cos(" + degree + ") = " + cosValue); 
	}
	
	           // to calculate power of 2
	
	public static void findPowerOfTwo(int n)
	{
		   
	        int i = 0;            
	        int powerOfTwo = 1;       

	  
	        while (i <= n) {
	            System.out.println(i + " " + powerOfTwo);   // print out the power of two
	            powerOfTwo = 2 * powerOfTwo;                // double to get the next one
	            i = i + 1;
	        }

	    }
	              // to calculate hamonic number
	public static void calculateHarmonic(int num)
	{
	
		double result = 0.0;
		while(num > 0){
			result = result + (double) 1 / num;
			num--;
		}
		System.out.println("Output of Harmonic Series is "+result);
	}

		 //to calculate prime numbers
	public static void calculatePrimenos() {
		int n,p;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number :");
		n=s.nextInt();
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
	}
	
	//to convert decimal to binary
public static void convertDecimalToBinary( )
{
	int a[] = null;
	int i;
	Scanner sc=new Scanner(System.in);

	System.out.println("Enter the number to convert: " ) ;    
	int n=sc.nextInt();
	
	for(i=0;i>0;i++)    
	{    

	a[i]=n%2;    
	n=n/2;    
	}
	System.out.println("\nBinary of Given Number is=");    
	for(i=i-1;i>=0;i--)    
	{    
	System.out.println("no is"+a[i]);
	}
	}
       //to find sqrt by newton's method
	
public static void sqrtNewton(double c) {
	
        double epsilon = 1e-15;    // relative error tolerance
        double t = c;             // estimate of the square root of c
        // repeatedly apply Newton update step until desired precision is achieved
        while (Math.abs(t - c/t) > epsilon*t) {     
			t = (c/t + t) / 2.0;
        }
        System.out.println(t);
    }

	 // to find the second largest and second smallest element in array
	public static void findMaxMin()
	{
		    int A[], i, j, x;
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
         
    System.out.println("Second largest number is "+a[1]);
    System.out.println("Second smallest number is "+a[n-2]);
	}
	
	 // to find repeatednumber in array
	public static void findRepeatNo(int arr[],int size)
  	{  
        
		int i, j; 
		System.out.println(" Repeating elements are "); 
		  for(i = 0; i < size; i++) 
		  {
		    for(j = i+1; j < size; j++)
		    {
		      if(arr[i] == arr[j]) 
		        System.out.println("elements are "+arr[i]);
		    }
  	}
  	}
	          //to roll dice
	public static void findRollDice()
	
	{  int abs_value;
		Scanner sc=new Scanner(System.in);
		        int SIDES = 6; 
		  
				int roll=sc.nextInt(SIDES);
		        int roll1 = (roll *SIDES)+1;
		        System.out.println("rolling result "+roll1);
		        System.out.println("repeated value of random  numbers");
	
				System.out.println(abs_value=Math.abs(roll1));
				
				

		    }
		
	 // to find primefactors
	public static void findPrimeFactors(int n)
	{
		 
	        while (n%2==0) 
	        { 
	            System.out.print(2 + " "); 
	            n /= 2; 
	        } 
	        for (int i = 3; i <= Math.sqrt(n); i+= 2) 
	        { 
	            while (n%i == 0) 
	            { 
	                System.out.print(i + " "); 
	                n /= i; 
	            } 
	        } 
	  
	        // This condition is to handle the case when
	        // n is a prime number greater than 2 
	        if (n > 2) 
	            System.out.print(n); 
	    } 
	
	//to calculate Taylor series using sine and cosine
	
	
	public static	int factorial(int number)
		{
		    int result = 1;
		    for (int i = 1; i <= number; i++)
		    {
		      result = result * i;
		    }
		    return result;
		}
	public static	void calc (double x)
		{
	
		    double sinx=0,cosx=0;

		    int i,j = 0;
		 
		    int c;
		    for(i=1;i<10;i+=2)
		    {
		    
		      c=i;
		      sinx += Math.pow(-1,j++)*Math.pow(x,i) /factorial(i);
		      if(i>0)
		      cosx+=Math.pow(-1,j)*Math.pow(x,c-1)/factorial(c-1);
		    }
		    sinx=Math.round( sinx * 1000.0 ) / 1000.0;

		    cosx=-cosx;
		    cosx=Math.round( cosx * 1000.0 ) / 1000.0;
		    System.out.println(sinx+" \n"+(cosx));
		  }
	
	// to calculate gamling 

  public static int getGambler(int stake,int goal,int trials)
    {

     int bets = 0;        // total number of bets made
     int wins = 0;        // total number of games won

     // repeat trials times
     for (int t = 0; t < trials; t++) 
     {

         // do one gambler's ruin simulation
         int cash = stake;
         while (cash > 0 && cash < goal) 
         {
             bets++;
             if (Math.random() < 0.5) cash++;     // win $1
             else                     cash--;     // lose $1
         }
         if (cash == goal) wins++;                // did gambler go achieve desired goal?
     }

     // print results
     System.out.println(wins + " wins of " + trials);
     System.out.println("Percent of games won = " + 100.0 * wins / trials);
     System.out.println("Avg bets  = " + 1.0 * bets / trials);
	return wins;
    }

	//to check the strings are anagram
	public static void checkAnagram() {

		System.out.println("Enter the 2 strings to check Anagram : ");
		Scanner scanner = new Scanner(System.in);
		String sentence1 = scanner.nextLine();// Getting input sentence 1
		String sentence2 = scanner.nextLine();// Getting input sentence 2

		if (sentence1.replaceAll(" ", "").length() == sentence1.replaceAll(" ", "").length()) {
			char[] characterArray1 = sentence1.toLowerCase().toCharArray(); // Converting string to character array
			char[] characterArray2 = sentence2.toLowerCase().toCharArray();// Converting string to character array

			Arrays.sort(characterArray1);// Sorting array
			Arrays.sort(characterArray2);// Sorting array

			if (Arrays.equals(characterArray1, characterArray2)) {
				System.out.println("The input strings are Anagram");
			} else {
				System.out.println("The input strings are not Anagram");
			}

		} else {
			System.out.println("The input strings are not Anagram");
		}
	}
	// to check given string is palindrome 
	public static void checkPalindrome()
	{
		String str,rev="";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string: ");
		str=sc.nextLine();
		int length=str.length();
		for(int i=length-1;i>=0;i--)
		{
			 rev = rev + str.charAt(i);
		}
		if (str.equals(rev))
		{
	         System.out.println(str+" is a palindrome");
		}
	      else
	      {
	         System.out.println(str+" is not a palindrome");
	      }
	   }
	 // to calculate day
	public static int calculateDay(int m,int d,int y)
	{ int x;
		Scanner sc= new Scanner(System.in);
	
			
			if(d<0 || m<0 || y<0)
			{
				System.out.println("Enter the number: ");
			 m=sc.nextInt();
		     d=sc.nextInt();
		     y=sc.nextInt();
		    calculateDay(m,d,y);
			}
			y = y-(14- m) / 12;
		     x = y + y/4-y/100 + y/400;
		    m = m + 12 * ((14-m) / 12)-2;
		  d =(d+x+31*m/12)%7;
		  return d;
	
	}
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
