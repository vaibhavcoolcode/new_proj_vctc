package Assignments;

public class Assign_9_While_Loop_Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Print Fibonacci series
		int a=0,b,c,z;
		b=0;
		c=1;
		System.out.println(b);
		System.out.println(c);
		while(a<=6)
		{		
			z=b+c;
			System.out.println(z);
			b=c;
			c=z;
			a++;
		}
	}

}
