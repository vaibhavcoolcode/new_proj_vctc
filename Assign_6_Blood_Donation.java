package Assignments;

public class Assign_6_Blood_Donation {

	//Assignment 6: Verify whether the person is eligible to donate blood, first condition is    	his/her age should be at least 18 and weight should be above 55kg.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 18, weight = 56;
		System.out.println("Age = "+age+", Weight ="+weight);
		if( age>=18 && weight>=55 ) {
			System.out.println("Person is Eligible for blood donation.");
		} else {
			System.out.println("Person is Not Eligible for blood donation.");
		}
	}

}
