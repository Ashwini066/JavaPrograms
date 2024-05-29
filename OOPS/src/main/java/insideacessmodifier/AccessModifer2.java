package insideacessmodifier;

public class AccessModifer2 extends AccessModifier1{
	public int age=10;
	public void displayage()
	{
		System.out.println("Age is "+age);
	}

	public static void main(String[] args) {
		AccessModifer2 am2= new AccessModifer2();
		am2.displayage();
		AccessModifier1 am1=new AccessModifier1();
		am1.display();
		
		

	}

}
