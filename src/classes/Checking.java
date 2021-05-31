package classes;
/*
 * Checking account class, starts with credit enabled and has no montly earnings
 * Credit is 70% of the account's current balance
 * While credit cannot be disabled currently, the setCredit method still can make the
 * account's credit be 0 if hasCredit happens to be false
 */
public class Checking extends Account{

	public Checking(Client owner, int number, double balance) {
		super(owner, number, balance);
		this.hasCredit=true;
		setCredit();
		checkingCreated();
	}

	@Override
	public double earnings() {
		return 0;
	}

	@Override
	public void setCredit() {
		if(this.hasCredit) { 
			this.credit=this.balance*0.7;
		} else this.credit=0.0;
	}

}
