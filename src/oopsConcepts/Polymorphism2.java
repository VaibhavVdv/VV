package oopsConcepts;

public class Polymorphism2 extends Polymorphism1 {
	
	void abcd() {
		System.out.println("Child class constructor 1");
	}
	void abcd(int i) {
		System.out.println("Child class constructor 2");
	}
	
	void abcd(String h,int i) {
		System.out.println("Child class constructor 3");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphism1 jj=new Polymorphism1();
		Polymorphism2 nn=new Polymorphism2();
		nn.abcd();
		jj.abcd(0);
	} 

}
