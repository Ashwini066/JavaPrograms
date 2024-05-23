package multilevelinheritance;

class BabyDog extends Dog {
	String name="Sky";
	public void babydogname()
	{
		System.out.println("Baby dogs's name is "+name);
	}

	public static void main(String[] args) {
		BabyDog bd= new BabyDog();
		bd.name();
		bd.dogname();
		bd.babydogname();

	}

}
