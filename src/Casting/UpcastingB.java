package Casting;

public class UpcastingB extends UpcastingA {
	public void abc (){
		System.out.println("This is Upcasting B for abc");
	}
	
	public static void xyz() {
		System.out.println("This is Upcasting B for xyz ");
	}
	
	private void pqr() {
		System.out.println("This is upcasting B for pqr");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UpcastingA v=new UpcastingB();
		v.abc();
		v.xyz(); // Static method cant override & private methods also cant override
		v.lmn();
		
		
	}

}
