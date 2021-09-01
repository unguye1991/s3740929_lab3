
public class CustomerFactory {
	public static Customer createCustomer(String customer_type){
		 if(customer_type.equals("guestcustomer"))
		 return new GuestCustomer();
		 else if(customer_type.equals("vipcustomer"))
		 return new VipCustomer();
		 else if(customer_type.equals("superVip"))
		 return new superVip();
		 else return null;
		}
}
