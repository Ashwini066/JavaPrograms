package interfaceProgram;

public class SampleMain implements SampleInterface{
	public void print()
	{
		System.out.println("Abstract Method");
	}
	public void display()
	{
		System.out.println("Non abstract Method");
	}

	public static void main(String[] args) {
		SampleInterface s1=new SampleMain();
		s1.print();
		s1.display();
	}

}
