package Exceptions;

public class UncheckedException {
	
//	void abc(){
//		int a=10;
//		int b=0;
//		try {
//			System.out.println(a/b);
//		}catch (Exception e){
//			System.out.println(e.getMessage());
//			System.out.println(e.toString());
//			e.printStackTrace();
//			System.out.println("Arithmatic Exception error occured here");
//			System.out.println("Programme Execute Properly");
//			e.getCause();
//		}
//		finally {
//			System.out.println("Programme Execute Properly");
//		}
		
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="JAVAAUTOMATION";
		System.out.println(a.length());
		try {
		System.out.println(a.charAt(56));
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println(e.toString());
		}
		
	}

}
