package hierrachialinheritance;

class Tester extends Employee{
	String testername="Abi";
	int salary=10000;
	public void testerdetails()
	{
		System.out.println("Tester name is "+testername);
		System.out.println("Tester salary is "+salary);
	}

	public static void main(String[] args) {
		Tester t= new Tester();
		t.display();
		t.testerdetails();

	}

}
