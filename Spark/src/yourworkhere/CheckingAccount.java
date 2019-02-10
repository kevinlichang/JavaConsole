package yourworkhere;

public class CheckingAccount extends Account {
	double overdraftFee;
	
	public CheckingAccount() {
		System.out.println("CheckingAccount Constructor ran");
	}
	
	public CheckingAccount(String accountID, String firstName, String lastName) {
		setAccountID(accountID);
		setFirstName(firstName);
		setLastName(lastName);	
		
	}
	
}
