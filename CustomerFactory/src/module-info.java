module CustomerFactory {
	public static Customer createCustomer(String customer_type){
		 if(customer_type.equals("customer"))
		 return new Customer();
		 else if(customer_type.equals("GuestCustomer"))
		 return new GuestCustomer();
		 else if(customer_type.equals("VipCustomer"))
	     return new ViptCustomer();
		 else if(customer_type.equals("superVip"))
	     return new superVip();
		}
	
}