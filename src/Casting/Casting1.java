package Casting;

public class Casting1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=12;//lower variable
		long b=a;// higher variable
		System.out.println("This is widening casting");
		System.out.println(b); 
		
		double c=100; //higher variable
		float d=(float) c;// lower variable
		System.out.println("This is narrow casting");
		System.out.println(d);

	}

}
