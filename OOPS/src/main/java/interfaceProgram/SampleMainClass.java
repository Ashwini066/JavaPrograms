package interfaceProgram;

public interface SampleMainClass implements SampleInterface {
public void print()
{
	System.out.println("Abstract Method");
}
public void display()
{
	System.out.println("Non abstract Method");
}

public static void main(String args[])
{
	SampleInterface obj= new SampleMainClass();
	
}
}
