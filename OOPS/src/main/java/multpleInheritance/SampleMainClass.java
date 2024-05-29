package multpleInheritance;

class SampleMainClass implements Interface1,Interface2{
	
	public void display()
	{
		System.out.println("Displaying method in Interface1 is "+name);
	}
public void print()
{
	System.out.println("Displaying method in Interface2 is "+name2);
}
	public static void main(String[] args) {
		SampleMainClass obj= new SampleMainClass();
		obj.display();
		obj.print();

	}

}
