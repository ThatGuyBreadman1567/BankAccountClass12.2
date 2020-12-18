
public class SavingsAccount extends BankAccount
{
	//FIELDS
	private double intRate = 0.001;
	
	//CONSSTRUCTORS
	public SavingsAccount(double b)
	{
		super(b); 
	}
	
	//METHODS
	public void addInterest()
	{
		deposit(getBalance() * intRate);
	}
}
