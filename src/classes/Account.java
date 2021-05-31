package classes;
/*
 * Account model used Savings and Checking
 * Has static fields to counts the numbers of accounts created, one for every type and
 * one for all of them
 * The abstract methods operate different ways in each type of account
 * Doesn't have setters because most attributes aren't going to change
 * Has a method for transfers to be used in testing
 */
public abstract class Account {
	private Client owner;
	private int number;
	protected double balance;
	protected boolean hasCredit;
	protected double credit;
	
	//static stuff
		static int registeredAccounts=0;
		static int registeredSavings=0;
		static int registeredCheckings=0;
		
		public static void accCreated() {
			registeredAccounts++;
		}
		public static void savingsCreated() {
			registeredSavings++;
		}
		public static void checkingCreated() {
			registeredCheckings++;
		}
	//constructor
		public Account(Client owner, int number, double balance) {
			this.owner = owner;
			this.number = number;
			this.balance = balance;
			accCreated();
		}

	//setters(?)
		public void deposit(double deposit){
			this.balance+=deposit;
		}
		public void addEarnings() {
			this.balance+=earnings();
		}
		public void withdraw(double withdraw){
			this.balance-=withdraw;
		}
		public boolean transfer(double ammount, Account receiver) {
			if(ammount<=this.balance) {
				this.balance-=ammount;
				receiver.balance+=ammount;
				return true;
			} else return false;
		}
	//getters
		public Client getOwner() {
			return owner;
		}
	
		public int getNumber() {
			return number;
		}
	
		public double getBalance() {
			return balance;
		}
	
		public double getCredit() {
			return credit;
		}
		
		public static int getRegisteredAccounts() {
			return registeredAccounts;
		}
	//abstract methods
		public abstract double earnings();
		public abstract void setCredit();
	
}
