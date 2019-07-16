package homework;

public class Bankaccount {
	public double interestRate=0,interestrate,Withdraw=0;
	public double Balance=0,deposit=0,balanceinterest;
	public String  accountName,accountNumber,transactions ="";
	
	//////////////////////////////////////////////
	public String getaccountNumber() {
		return accountNumber;
	}
	public void setaccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	///////////////////////////////////////////////
	public String getaccountName() {
		return accountName ;
	}
	public void setaccountName(String accountName) {
		this.accountName= accountName;
	}
	
	///////////////////////////////////////////////
	public void setdeposit(double Deposit) {
		this.deposit = Deposit;
		Balance = Balance + Deposit ;
		transactions = transactions + "D";
	}
	public double getdeposit() {
		return deposit;
	}
	///////////////////////////////////////////////
	public void setwithdraw(double withdraw) {
		this.Withdraw = withdraw;
		if(withdraw <= Balance) {
			Balance = Balance - withdraw;
			transactions =transactions +"W";
		}
	}
	public double getwithdraw() {
		return Withdraw;
	}
	//////////////////////////////////////////////
	public void setinterestRate(double inter) {
		this.interestRate = inter;
		interestRate = (Balance * (inter/100));
	}
	public double getinterestRate() {
		return interestRate;
	}
	///////////////////////////////////////////////
	public void setBalance(double balance) {
		this.Balance = balance;
		Balance = balance+deposit+interestRate-Withdraw;
	}
	public double getBalance() {
		return Balance;
	}
	/////////////////////////////////////////////
	
	public String getTransactions() {
		return transactions;
	}
	
	public String getterAcc() {
		return "[   AccountNumber:" + accountNumber +  
				"   AccountName:" + accountName + 
				"   InterestRate:" + interestRate + 
				"   deposit:+" + deposit + 
				"   Withdraw:-"+Withdraw+ 
				"   balance:" + Balance +"   ]" ;
	}

		
}
