package oopsConcepts;

public class Inheritance2 extends Inheritance {

    int c=11,b=15;
	
	void abcd() {
		
	System.out.println("Demo method 2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    Inheritance2 d=new Inheritance2();
		
		d.abc();
		System.out.println(Inheritance.a);
		d.abcd();
	}

}
