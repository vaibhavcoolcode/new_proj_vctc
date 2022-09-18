package Assignments;

/*
 
 Print the following pattern
     *
    **
   ***
  ****
 *****
      
 Try this also
 *****
 **** 
 ***  
 **
 *
 
 This one also
 *****
  ****
   ***
    **
     *
   
*/

public class Assignment_7_For_Loop_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("<-------> PATTERN 1 <-------->");
		int i,j,k,l=5;
		
		for(  i=1 ; i<=5 ; i++  ) 
		{

			for(  k=l ; k>1 ; k-- ) 
			{
					System.out.print(" ");					
			}
				
			l--;
				
			for(  j=1 ; j<=i ; j++  ) 
			{
					System.out.print("*");
			}
				
			System.out.println("");
		
		}
		
		System.out.println("<--------> PATTERN 2 <------->");
		
		for( i=5 ; i>0 ; i-- ) 
		{
			for(j=1; j<=i ; j++ ) 
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("<-------> PATTERN 3 <-------->");
		
		int m = 5,p=1;
		for(i=1;i<=5;i++)
		{
			for(j=2;j<=p;j++)
			{
				System.out.print(" ");
			}
			p++;
			for(  k=m ; k>=1 ; k-- ) 
			{
				System.out.print("*");					
			}				
			m--;
			
			System.out.println("");
		}
		
		System.out.println("<-------> PATTERN 4 <-------->");
		for(  i=1 ; i<=5 ; i++  ) 
		{
				
			for(  j=1 ; j<=i ; j++  ) 
			{
					System.out.print("*");
			}
				
			System.out.println("");
		
		}
	}

}
