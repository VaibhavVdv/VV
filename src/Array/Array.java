package Array;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arrayname[];
		arrayname=new int[10];
		arrayname[0]=10;
		arrayname[1]=20;
		arrayname[2]=30;
		arrayname[3]=40;
		arrayname[4]=50;
		arrayname[5]=60;
		arrayname[6]=70;
		arrayname[7]=80;
		arrayname[8]=90;
		
		
		System.out.println(arrayname[7]);
		System.out.println(arrayname.length);
		for(int i : arrayname) {
			System.out.println(i);
		}
		
	}

}
