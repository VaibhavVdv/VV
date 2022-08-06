package PracticeSet;
import java.util.Scanner;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name= "Vaibhav Varade";
		
		System.out.println(name.toLowerCase());
		name = name.replace(" ", "_");
		System.out.println(name);

		String letter = "Dear <|name|>, Thanks a lot!";
		letter = letter.replace("<|name|>", "Vaibhav");
		System.out.println(letter);
		
		String myString = "This string contains     double & triple spaces";
		System.out.println(myString.indexOf("  "));
		System.out.println(myString.indexOf("   "));
		
		String letter1 = "Dear Vaibhav, \n\t This Java Course is nice,\n\t Thanks!";
		System.out.println(letter1);
		
		Scanner v=new Scanner(System.in);
		System.out.println("Enter the value :");
		int h = v.nextInt();
		System.out.println();
		
		String j="My name is Anthony Gonsalvis";
		j= j.replace("name", "self");
		System.out.println(j.indexOf("M"));
		System.out.println(j.toLowerCase());
		System.out.println(j.toUpperCase());
		System.out.println(j);
		
		
				
		

	}

}
