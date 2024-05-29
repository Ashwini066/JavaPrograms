package polymorphsim;

public class Personal extends Employee {
	String address;
	int age,houseno;
	public void display(int age,int houseno,String address)
	{
		super.display(101, 10000, "Ashwini");
		System.out.println("Age is :"+age);
		System.out.println("Houseno is :"+houseno);
		System.out.println("Address is :"+address);
	}

	public static void main(String[] args) {
	Employee e=new Personal ();
	e.display(30,33,"chennai");
		
		
		

	}

}
