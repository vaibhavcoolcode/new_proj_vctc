package Assignments;

public class Assign_5_Leap_Year {
	
	//Assignment5: Check whether the given year is a leap year or not. leap year is divisible by 4    and 	400. But, not by 100.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 1900;
		if(  year%100 != 0  ) {
			if(  year%4 == 0  ||  year%400 ==0  ) {
				System.out.println(year+" is a Leap year.");
			} else {
				System.out.println(year+" is not a Leap Year.");
			}
		} else {
			System.out.println(year+" is not a Leap Year.");
		}	
	}

}
