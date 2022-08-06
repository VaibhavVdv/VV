package oopsConcepts;

public class ChildB extends ParentA {
	
	void abcd() {
		super.abcd("vv",10);
		super.abcd(10);
		System.out.println("Child class constructor 1");
	}
	void xyz() {
		this.abcd();
		System.out.println("Child class constructor 2");
	}
	void lmn() {
		System.out.println("Child class constructor 3");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildB vv=new ChildB();
		vv.xyz();
	}

}
