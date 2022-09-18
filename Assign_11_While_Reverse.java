package Assignments;

public class Assign_11_While_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Reverse the given number		
		
		/*
		 * int units,tens,hundreds,num1,num2,num3,num4; units = num%10; num1 = num/10;
		 * 
		 * tens = num1%10; num2 = num1/10;
		 * 
		 * hundreds = num2%10; num3 = num2/10;
		 * 
		 * System.out.print(units); System.out.print(tens); System.out.print(hundreds);
		 */
		
		int num = 571;
		int Result1;
		while(num != 0) {
			Result1 = num%10;
			num-=Result1;
			num/=10;
			System.out.print(Result1);
		}

	}

}
