package hybridinheritance;

class Daughter extends Father {
String name="Ria";
int age=29;
public void Daughterdetails(){
	System.out.println("Daughter name is "+name);
	System.out.println("Daughter age is "+age);
}
	public static void main(String[] args) {
		System.out.println("Family details");
		Daughter d=new Daughter();
		Son s= new Son();
		d.grandfatherdetails();
		d.fatherdetails();
		s.sondetails();
		d.Daughterdetails();
		
	

	}

}
