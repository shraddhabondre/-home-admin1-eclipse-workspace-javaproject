package methods;
import java.util.*;
public class Sortarray {
	

	public static void main(String args[])
	{
		int count = 0;
//		Scanner sc=new Scanner (System.in);
	System.out.println("enter the string:");
	String[] str= {"abvcxd","bhcj","egrfu"};

		for(int i=0;i<str.length;i++)
		   {
		      
		       for(int j=0;j<=str.length;j++)
		       {
		    	   if(str[j] >= str[j+1])
		    	   {
		               String temp=str[j+1];
		                   str[j+1]=str[j];
		                   str[j]=temp;

                  }
		     }
	    }
	}
}
