package oopsConcepts;

public class ThisKeyword {
	
//	 int c=11,b=15;
//		
//		void abc() {
//			
//		System.out.println("Demo method 1");
//		}
//		
//		void xyz() {
//		this.abc();
//		System.out.println("Demo method 2");
//			}
	 
	 ThisKeyword(){
		 System.out.println("No arg constructor");
	 }
	 ThisKeyword(int i){
		 this();
		 System.out.println("Parameterised constructor");
	 }
	 ThisKeyword(String h, int i){
		 this(10);
		 System.out.println("Parameterised constructor 2");
	 }
		


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyword dd=new ThisKeyword();
		
	
		

	}

}
