package src;

public class DemoMethod {

	float a=0.55f;
	static void xyz (){
		int a=2,b=3,c=4;
		
		System.out.println(a+b*c);
	}
	void abc (){
		int a=2,b=3,c=4;
		
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoMethod d=new DemoMethod ();
		d.abc();
		xyz();
		System.out.println(d.a);
		

		xyz();

	}

}
