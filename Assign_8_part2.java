package Assignments;

public class Assign_8_part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("<=======>Pattern 13<======>");
		
		int i,j,k;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{System.out.print(" ");}
			for(k=i;k<=5;k++)
			{System.out.print("*");}
			System.out.println(	);
		}
		for(i=2;i<=5;i++)
		{
			for(k=i;k<=5;k++)
			{System.out.print(" ");}
			for(j=1;j<=i;j++)
			{System.out.print("*");}
			System.out.println(	);
		}
		
		System.out.println("<=======>Pattern 13<======>");
			k = 1;
			for(i=1;i<=9;i++)
			{
				for(j=k;j<=9;j++)
				{
					if(j%2!=0)
					{System.out.print("*");}
					else 
					{
						System.out.print(" ");
					}
				}k++;
				System.out.println();
			}
	}

}
