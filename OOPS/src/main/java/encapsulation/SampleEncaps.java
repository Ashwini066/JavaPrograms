package encapsulation;

public class SampleEncaps {
	private long  accountnum;
	private String name;
	private String branch;
	public void setter( long  accountnum,String name,String branch)
	{
		this.accountnum=accountnum;
		this.name=name;
		this.branch=branch;
	}
	public void getter()
	{
		System.out.println("Account number  is : "+accountnum);
		System.out.println("Name is : "+name);
		System.out.println("Branch location  is : "+branch);
	}


}
