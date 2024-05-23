package singleinheritance;

class CarSpeed extends Vehicle{
	int carspeed= 150;
	public void carspeed()
	{
		System.out.println("Car speed is "+carspeed);
	}
	public static void main(String[] args) {
		CarSpeed obj1 = new CarSpeed();
		obj1.showspeed();
		obj1.carspeed();		

	}

}
