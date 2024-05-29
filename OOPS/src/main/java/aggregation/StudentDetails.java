package aggregation;

class StudentDetails {
	String name;
	int rollno;
	AddressDetails ad;
	public StudentDetails(String name,int rollno,AddressDetails ad)
	{
		this.name=name;
		this.rollno=rollno;
		this.ad=ad;
	}
	public void printdetails()
	{
		System.out.println("Name is "+name);
		System.out.println("Roll no is "+rollno);
		System.out.println("House Number is "+ad.hno);
		System.out.println("Street name  is "+ad.streetname);
		System.out.println("City Name  is "+ad.cityname);
		System.out.println("Pincode is "+ad.pincode);
	
	}
	
	public static void main(String args[])
	{
		AddressDetails add1=new AddressDetails(12,"Bethel Street","Chennai",603002);
		StudentDetails sd=new StudentDetails("Ashwini",12,add1) ;
		sd.printdetails();
	}

}
