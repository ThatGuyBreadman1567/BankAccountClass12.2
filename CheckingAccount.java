
public class CheckingAccount extends BankAccount
{
	private double transactionCount = 0;
	private int maxTrans;
	
	public CheckingAccount(int m, double b)
	{
		super(b);
		maxTrans = m;
	}
	
	public void deposit(double amt)
	{
		super.deposit(amt);
		transactionCount++;
	}
}