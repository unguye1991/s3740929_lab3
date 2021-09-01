import java.util.ArrayList;
import java.util.Scanner;

public class Runner {
	
	public static void main (String[] args) {
		ArrayList list = new ArrayList();
		Scanner myScanner = new Scanner(System.in);
		String option = myScanner.next();
		Customer e1 = CustomerFactory.createCustomer(option);
		list.add(e1);
		
		option = myScanner.next();
		Customer e2 = CustomerFactory.createCustomer(option);
		list.add(e2);
		

		option = myScanner.next();
		Customer e3 = CustomerFactory.createCustomer(option);
		list.add(e3);
		
	}

}
