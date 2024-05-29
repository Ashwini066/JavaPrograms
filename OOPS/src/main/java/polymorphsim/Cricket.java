package polymorphsim;

public class Cricket extends Sports{

	public void play()
	{
		System.out.println("Playing Cricket");
	}


public static void main(String args[])
{
	Sports s;
	s=new Cricket();
	s.play();
	s=new Football();
	s.play();
	s=new Sports();
	s.play();
	
	
}
}