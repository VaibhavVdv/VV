package oopsConcepts;

public class Polymorphism1 {
	
	void abcd(int i) {
		System.out.println("Parent class constructor 1");
	}
	void abcd(int i, String h) {
		System.out.println("Parent class constructor 2");
	}
	void abcd(String h,int i) {
		System.out.println("Parent class constructor 3");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphism1 ff=new Polymorphism1();
		

	}

}
