public class CardPayment extends Payment
{

	public String name, number;
	public double amount;

	CardPayment(double amount, Table tableNum, String name, String number) 
	{
		super(amount, tableNum);
		this.amount = amount;
		this.number = number;
		this.name = name;
	}

	public void CardPaymentDetails() 
	{
		System.out.println("--------------------------------------------" + 
						   "\nThe payment of $" + this.amount + 
						   "\n through the card " + this.number + 
						   "\n Customer: " + this.name + "." +
		                   "\n--------------------------------------------");
	}
}

