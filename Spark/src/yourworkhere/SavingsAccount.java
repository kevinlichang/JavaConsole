package yourworkhere;

public class SavingsAccount extends Account {
	double minBalance;
	int currentMonthlyWithdrawals;
	int maxMonthlyWithdrawals;
	
	public SavingsAccount(){
	   System.out.println("SavingsAccount Constructor ran");
	}

	public SavingsAccount(String accountID, String firstName, String lastName){
		setAccountID(accountID);
		setFirstName(firstName);
		setLastName(lastName);	
	}
}

