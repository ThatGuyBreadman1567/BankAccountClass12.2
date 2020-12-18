public class BankAccount 
{
	//FIELDS
	private double balance;
	
	//CONSTRUCTORS
//	public BankAccount()
//	{
//		balance = 0;
//	}
	
	public BankAccount(double b)
	{
		balance = b;
	}
	
	//METHODS
	public void deposit(double set)
	{
		balance += set;
	}
	
	public double getBalance()
	{
		return balance;
	}
}
