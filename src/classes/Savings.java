package classes;
/*
 * Savings account class, doesn't start with credit enabled
 * Credit cannot be disabled currently, and there are no operations that use it
 * Savings account have monthly earnings of 2% of their balance
 * If enabled, credit is 50% of the account's balance at the time
 */
public class Savings extends Account{
	
	public Savings(Client owner, int number, double balance) {
		super(owner, number, balance);
		this.hasCredit=false;
		setCredit();
		savingsCreated();
	}
	//enabling credit
	public void enableCredit(){
		this.hasCredit=true;
	}
	//overrides
	@Override
	public double earnings() {
		return this.balance*0.02;
	}

	@Override
	public void setCredit() {
		if(this.hasCredit) { 
			this.credit=this.balance*0.5;
		} else this.credit=0.0;
	}

}
