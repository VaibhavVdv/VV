package PracticeSet;


public class gettersetter {
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gettersetter vaibhav=new gettersetter();
		
		vaibhav.setId(25);
		System.out.println(vaibhav.getId());
		vaibhav.setName("VV");
		System.out.println(vaibhav.getName());

	}

}
