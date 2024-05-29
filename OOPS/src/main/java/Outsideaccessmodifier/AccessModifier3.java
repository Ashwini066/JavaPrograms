package Outsideaccessmodifier;

import insideacessmodifier.AccessModifer2;
import insideacessmodifier.AccessModifier1;

class AccessModifier3 {

	
		String place="chennai";
		public void displayplace()
		{
			System.out.println("Place is"+place);
		}

	
	public static void main(String[] args) {
		AccessModifer2 am2= new AccessModifer2();
		am2.displayage();
		/*AccessModifier1 am1=new AccessModifier1();
		am1.display();*/
	}		

}
