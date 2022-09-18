package Assignments;

public class Assign_1_Grading {
	
	/*
	 * Assignment 1: Print grades (A, B, C) based on the percentage obtained by a
	 * student. If the percentage is above 90, assign grade A; if the percentage is
	 * above 75, assign grade B; if the percentage is above 65, assign grade C
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int stud = 95;
		
		
		if( stud >= 90 && stud <=100 ) {
			System.out.println("Grade A for "+stud+"%");
		}
		else if( stud >= 75 && stud < 90 ) {
			System.out.println("Grade B for "+stud+"%");
		}
		else if( stud >= 65 ){
			System.out.println("Grade c for "+stud+"%");
		}
	}

}
