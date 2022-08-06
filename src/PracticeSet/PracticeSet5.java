package PracticeSet;
import java.util.Scanner;
public class PracticeSet5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int maths,chemistry,physics;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter your Marks in Maths:");
//		maths = sc.nextInt();
//		System.out.println("Enter your Marks in Chemistry:");
//		chemistry = sc.nextInt();
//		System.out.println("Enter your Marks in Physics:");
//		physics = sc.nextInt();
//		float avg = (maths+chemistry+physics)/3.0f;
//		System.out.println("You overall percentage is " + avg + "%");
//		
//		if(avg>=40 && maths>=33 && chemistry>=33 && physics>=33) {
//			System.out.println("Congratulations! you are promoted");
//		}
//		else {
//			System.out.println("Sorry ! You are not Promoted");
//		}
//		Q3
//		Scanner sc=new Scanner(System.in);
//		float tax=0;
//		System.out.println("Enter your income lakhs per annum");
//		float income=sc.nextFloat();
//		
//		if(income<=250000.0f) {
//			tax=tax+0;
//		}
//		else if(income>250000.0f && income<=500000.0f) {
//			tax = tax + 0.05f * (income - 250000.0f);
//		}
//		
//		System.out.println("Total tax paid by the employee is: " + tax);

//		Q4
		int day = 2;
		switch(day) {
		case 1 : System.out.println("Sunday");
		break;
		case 2 : System.out.println("Monday");
		break;
		case 3 : System.out.println("Tuesday");
		break;
		case 4 : System.out.println("Wednesday");
		break;
		case 5 : System.out.println("Thursday");
		break;
		case 6 : System.out.println("Friday");
		break;
		case 7 : System.out.println("Saturday");
		break;
		
		default : System.out.println("Sorry");
		}
		
	
	}

}
