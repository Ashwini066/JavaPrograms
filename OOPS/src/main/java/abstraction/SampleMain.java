package abstraction;

class SampleMain extends Sample {
	public void print()
	{
		System.out.println("Dsplaying the abstract method");
	}
	public void show()
	{
		System.out.println("Displaying non abstract method in the child class");
	}
	public static void main(String[] args) {
		SampleMain sm= new SampleMain();
		sm.print();
		sm.display();
		sm.show();
		

	}

}
