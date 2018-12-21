package methods;

public class Removespace {

	
	
	 public static int trim()
	 {
		 
		 
		
		char str1[]=null;
	
	    // To keep track of non-space character count 
	    int count = 0; 
	  
	    // Traverse the given string. If current character 
	    // is not space, then place it at index 'count++' 
	    for (int i = 0;i<= str1[i]; i++) 
	    {
	        if (str1[i] != ' ') 
	            str1[count++] = str1[i]; // here count is 
	                                   // incremented 
	    str1[count] = '\0'; 
	}
	    return count;
	 }
public static void main(String args[])
{
	System.out.println("enter the string: ");
	trim();
	


}
}









