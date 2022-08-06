package PracticeSet;
import java.util.Scanner;

public class PracticeSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=25,b=25,c=25;
		
		int sum = a+b+c;
		
		System.out.println(sum);
		
//		question 2
		float subject=45;
		float subject2=95;
		float subject3=65;
		float cgpa=(subject+subject2+subject3)/30;
		
		System.out.println(cgpa);
		
//		Question 3
		System.out.println("What is your name");
//		Question 4
		float kilometers=45;
		double miles= 0.621371;
		double conversion= kilometers*miles;
		
		System.out.println(conversion);
		
//		Question 5
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter Physics Marks:");
		int Physics = scan.nextInt();
		
		System.out.println("Enter English Marks:");
		int English = scan.nextInt();
		
		System.out.println("Enter Chemistry Marks:");
		int Chemistry = scan.nextInt();
		
		System.out.println("Enter Bio Marks:");
		int Bio = scan.nextInt();
		
		System.out.println("Enter Mathematics Marks:");
		int Mathematics = scan.nextInt();
		
		float Percentage = (Physics + English + Chemistry + Bio + Mathematics)/500.f*100;
		
		System.out.println("Percentage:");
		System.out.println(Percentage);
		
		
		
		
		
		
	}

}
