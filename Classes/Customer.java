public class Customer 

{

	private int cardNumber;

	private int PIN;

	private Order order; // Customer order

	
 	public Customer(int cN, int pin, Order o) {

  		this.cardNumber = cN;

 		this.PIN = pin;
  
 		this.order = o;

 	}
 
	  // Getters and setters for order
	 public Order getOrder() {
	  return this.order;
	 }

	 public void setOrder(Order order) {
	  this.order = order;
	 }


	// If customer is ready to pay bill
	public Boolean payBill(String isReady) {
		// will return whether or not customer is ready
		boolean ready = false;
		if(isReady.equalsIgnoreCase("Yes"))
		{
			ready = true;
		}
		else if(isReady.equalsIgnoreCase("No"))
		{
			ready = false;
		}
		return ready;
	}

	

	// Customer order choice

	public boolean paymentOption(String choice) {

		// will return card or cash for Server

		// Check the type of payment

		boolean payment = true;

		if(choice.equalsIgnoreCase("cash"))

		{

			payment = true;

		}

		else if(choice.equalsIgnoreCase("card"))

		{

			payment = false;

		}

	return payment;

	}

}