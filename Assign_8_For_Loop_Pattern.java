package Assignments;

public class Assign_8_For_Loop_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k,l,m,n,o;
		
		System.out.println("<---->Pattern 1<---->");
		/*Pattern 1		
		*
		**
		***
		****
		*****		
		*/	
		for(i=1;i<6;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		} 
		
		System.out.println("<---->Pattern 5<---->");
		/*  Pattern 5
		
		    *        4s and 1*
		   ***       3s and 3* 
		  *****      2s and 5*
		 *******     1s and 7*
		*********    0s and 9*
		
		*/
		k=1;m=1;
		for(i=1;i<=5;i++) 
		{			
			  for(j=4;j>= k && k<=4;j--) 
			  {				 
				 System.out.print(" "); 				
			  } k++;
		      for(l=1;l<=m && m<=9;l++) 
		      {
		    	  System.out.print("*");
		      }
		      m+=2;
			System.out.println();
		}
		
		System.out.println("<---->Pattern 6<---->");
		/*Pattern 6
		 *********
		  *******
		   *****
		    ***
		     * 
		  */
		n=1;o=5;
		for(i=1;i<=5;i++)
		{
			for(l=5;l>o;l--) 
			{
				System.out.print(" "); 
			}o-- ;
			for(j=9;j>= n && n<=9;j--) 
			  {				 
				 System.out.print("*"); 				
			  } n+=2;
			  System.out.println();
		}
		
		System.out.println("<---->Pattern 7<---->");
		/*Pattern 7
		     *        4s and 1*
		    ***       3s and 3* 
		   *****      2s and 5*
		  *******     1s and 7*
		 *********
		  *******
		   *****
		    ***
		     * 
		  */
		int i7,j7,k7,l7,m7,n7,o7;
		k7=1;m7=1;		
			
			for(i7=1;i7<=5;i7++) 
			{			
				  for(j7=4;j7>= k7 && k7<=4;j7--) 
				  {				 
					 System.out.print(" "); 				
				  } k7++;
			      for(l7=1;l7<=m7 && m7<=9;l7++) 
			      {
			    	  System.out.print("*");
			      }
			      m7+=2;
				System.out.println();
			}
			n7=1;o7=5;
			for(i7=1;i7<=4;i7++)
			{
				for(l7=5;l7>=o7;l7--) 
				{
					System.out.print(" "); 
				} o7--;
				for(j7=7;j7>= n7 && n7<=7;j7--) 
				  {				 
					 System.out.print("*"); 				
				  } n7+=2;
				  System.out.println();
			}
			
			
		System.out.println("<---->Pattern 8<---->");	
		/*Pattern 8
		  *
		  **
		  ***
		  ****
		  *****
		  ****
		  ***
		  **
		  *
		 */
		int i8,j8;
		
		for(  i8=1 ; i8<=5 ; i8++  )
		{
			for( j8=1 ; j8<=i8 ; j8++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(  i8=1 ; i8<5 ; i8++  )
		{
			for( j8=i8+1 ; j8<=5 ; j8++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("<---->Pattern 9	<---->");
				/*
				     *
				    **
				   *** 
				  ****
				 ***** 
				  **** 
				   *** 
				    ** 
				     *  
				   */
		
		int i9,j9,k9;
		
		for(i9=1;i9<=5;i9++)
		{
			for(k9=i9;k9<=4;k9++) 
			{
				System.out.print(" ");
			}
			
			for(j9=1;j9<=i9;j9++) 
			{
				System.out.print("*");				  
			} 
			System.out.println();
		}
		
		
		 for(i9=1;i9<5;i9++) 
		 {
			 for(k9=1;k9<=i9 && k9<=4;k9++)
			 {
				 System.out.print(" ");
			 }
			 for(j9=i9;j9<5;j9++)
			 {
				 System.out.print("*");
			 }
				 System.out.println(); 
		 }
		 
		 
		 System.out.println("<------>Pattern 10<------>");
		 /*
		      *****
		     *****
		    *****
		   *****
		  ***** 
		  */
		 int i10 ,j10 ,k10;
		 for(   i10=1  ;  i10<=5  ;  i10++  )
		 {
			 for(   j10=i10 ; j10<=5 ; j10++)
			 {System.out.print(" ");}
			 for(   k10=1 ; k10<=5 ; k10++  )
			 {System.out.print("*");}
			 System.out.println();
			 
		 }
		 
		 System.out.println("<------>Pattern 11<------>");
		 /*
		  ***** 
		   ***** 
		    ***** 
		     ***** 
		      ***** 
		   */
		 int i11,j11,k11;
		 for(  i11=1  ; i11<=5 ;i11++ )
		 {
			 for(j11=1;j11<=i11;j11++)
			 {
				 System.out.print(" ");
		     }
			 for(   k11=1 ; k11<=5 ; k11++  )
			 {
				 System.out.print("*");
			 }
			 System.out.println();		
		 }
		 
		 System.out.println("<------>Pattern 12<------>");
		 /*
		  *****
		  ****
		  ***
		  **
		  *
		  **
		  ***
		  ****
		  *****
		   */
		 int i12 ,j12;
		 for(i12=1;i12<=5;i12++)
		 {
			 for(j12=i12;j12<=5;j12++)
			 {System.out.print("*");}
			 System.out.println();
		 }
		 for(i12=2;i12<=5;i12++)
		 {
			 for(j12=1;j12<=i12;j12++)
			 {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
		
	}

}
