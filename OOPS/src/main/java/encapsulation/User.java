package encapsulation;
import java.util.*;
public class User {

	public static void main(String[] args) {
		Bank b= new Bank();
		b.setpin(1234);
		b.getpin();
		b.checkpin();


	}

}
