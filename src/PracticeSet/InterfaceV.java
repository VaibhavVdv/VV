package PracticeSet;

	interface Bicycle{
		int a=45;
	void applyBrake(int decrement);
	void speedUp (int increment);
	}

	class AvonCycle implements Bicycle{
	
	public void applyBrake(int decrement){
		System.out.println("Applying Brake");
		
	}
	public void speedUp (int increment){
		System.out.println("Speeding Up");
		
	}
}
public class InterfaceV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AvonCycle vaibhav=new AvonCycle();
		vaibhav.applyBrake(0);
		System.out.println(vaibhav.a);
	}

}
