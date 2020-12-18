public class BankMain 
{
	public static void main(String[] args) 
	{
		SavingsAccount ben = new SavingsAccount(500);
		System.out.println(ben.getBalance());
		ben.addInterest();
		System.out.println(ben.getBalance());
	}
}
