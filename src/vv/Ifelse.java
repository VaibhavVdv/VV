package vv;

public class Ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       int marks=35;
		
		if (marks>=75) {
			System.out.println("Student having distinction");
		}
		else if(marks<=75 && marks>= 65) {
			System.out.println("Student having First class");
			
		}
		else if (marks<=64 && marks>=50) {
			System.out.println("student having second class");
		}
		else {
			System.out.println("Sory you are not promoted");
		}

	}

}
