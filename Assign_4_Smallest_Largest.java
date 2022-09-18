package Assignments;

public class Assign_4_Smallest_Largest {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int a = 11;
//		int b = 2;
//		int c = 8;
//		if( a>b && a>c ) {
//			System.out.println("A is the Greatest number");
//			//System.out.println((b<c)? "B is the Smallest number":"c is the Smallest number");
//			if( b<c ) {
//				System.out.println("B is the Smallest number");
//				}
//			else {
//				System.out.println("c is the Smallest number");
//			}
//				
//		} else if( b>a && b>c ) {
//			System.out.println("B is the Greatest number");
//			//System.out.println((a<c)? "A is the Smallest number":"c is the Smallest number");
//			if( a<c ) {
//				System.out.println("A is the Smallest number");
//				}
//			else {
//				System.out.println("c is the Smallest number");
//			}
//		} else {
//			System.out.println("C is the Greatest number");
//			//System.out.println((a<b)? "A is the Smallest number":"B is the Smallest number");
//			if( a<b ) {
//				System.out.println("A is the Smallest number");
//				}
//			else {
//				System.out.println("B is the Smallest number");
//			}
//		}
//	}
	public static void main(String[] args) {
		int a=12, b=21, c=31, d=41, e=5;
		System.out.println("Numbers are A = "+a+", B = "+b+", C = "+c+", D = "+d+", E = "+e);
		if( a>b && a>c && a>d && a>e ) { 
			System.out.println("A is Greatest");
			if( b<c && b<d && b<e) {
				System.out.println("B is Smallest");
			} else if( c<d && c<e ) {
				System.out.println("C is Smallest");
			} else if(d<e){
				System.out.println("D is Smallest");
			} else {
				System.out.println("E is Smallest");
			}
		} else if(b>a && b>c && b>d && b>e) {
			System.out.println("B is Greatest");
			if( a<c && a<d && a<e) {
				System.out.println("A is Smallest");
			} else if( c<d && c<e ) {
				System.out.println("C is Smallest");
			} else if(d<e){
				System.out.println("D is Smallest");
			} else {
				System.out.println("E is Smallest");
			}
		} else if(c>a && c>b && c>d && c>e) {
			System.out.println("C is Greatest");
			if( a<b && a<d && a<e) {
				System.out.println("A is Smallest");
			} else if( b<d && b<e ) {
				System.out.println("B is Smallest");
			} else if(d<e){
				System.out.println("D is Smallest");
			} else {
				System.out.println("E is Smallest");
			}
		} else if(d>a && d>b && d>c && d>e){
			System.out.println("D is Greatest");
			if( a<b && a<c && a<e) {
				System.out.println("A is Smallest");
			} else if( b<c && b<e ) {
				System.out.println("B is Smallest");
			} else if(c<e){
				System.out.println("C is Smallest");
			} else {
				System.out.println("E is Smallest");
			}
		} else {
			System.out.println("E is Greatest");
			if( a<b && a<c && a<d) {
				System.out.println("A is Smallest");
			} else if( b<c && b<d ) {
				System.out.println("B is Smallest");
			} else if(c<d){
				System.out.println("C is Smallest");
			} else {
				System.out.println("D is Smallest");
			}
		}
		
	}

}
