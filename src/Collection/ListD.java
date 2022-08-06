package Collection;
import java.util.ArrayList;
import java.util.List;


public class ListD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List list=new ArrayList();
		list.add(1);
		list.add("Vaibhav");
		list.add(1522);
		list.add("Java Dev");
		list.add(200.00);
		list.add("");
		
//		System.out.println(list);
//		for (Object obj:list) {
//			System.out.println(obj);}
//		System.out.println(list.contains(1523));
//		System.out.println(list.get(0));
//		System.out.println(list.remove(1));
//		System.out.println(list.isEmpty());
//		list.remove(0);
//		System.out.println(list);
		
		list.add(4,"VDV");
		System.out.println(list.get(4));
		System.out.println(list.get(5));
	
	}

}
