package yourworkhere;

public abstract class Account {

	protected String accountID;
	protected double balance;
	protected String accountType;
	protected String firstName;
	protected String lastName;
	
	//create getters
	protected String getAccountID() {
		return this.accountID;
	}
	
	protected double getBalance() {
		return this.balance;
	}
	
	protected String getAccountType() {
		return this.accountType;
	}
	
	protected String getFirstName() {
		return this.firstName;
	}
	
	protected String getLastName() {
		return this.lastName;
	}
	
	//create setters
	protected void setAccountID(String accountID) {
		this.accountID = accountID;
	}

	protected void setbalance(double balance) {
		this.balance = balance;
	}
	
	protected void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	protected void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	protected void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
