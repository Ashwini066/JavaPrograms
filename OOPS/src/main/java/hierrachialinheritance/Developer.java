package hierrachialinheritance;

class Developer extends Employee {
String name="Anu";
int salary=10000;
public void developerdetails()
{
	System.out.println("Developer name is "+name);
	System.out.println("Developer salary is"+salary);
}
	
	public static void main(String[] args) {
		Developer d= new Developer();
		Tester t= new Tester();
		d.display();
		d.developerdetails();
		t.testerdetails();
	
		
		

	}

}
