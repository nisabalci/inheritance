package inheritance;

public class Main {

	public static void main(String[] args) {

		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.customerNumber = "12345";
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.customerNumber = "67891";
		
		CustomerManager customerManager = new CustomerManager();
		Customer[] customers = {individualCustomer, corporateCustomer};
		customerManager.addMultiple(customers);


	}

}
