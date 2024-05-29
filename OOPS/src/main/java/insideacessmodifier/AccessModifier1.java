package insideacessmodifier;

public class AccessModifier1 {

	protected  String name="Ashwini";
	protected void display()
	{
		System.out.println("Name is "+name);
	}
	
	public static void main(String[] args) {
		AccessModifier1 am1=new AccessModifier1();
		am1.display();

	}

}
