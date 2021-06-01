package classes;
/*
 * Teller class
 * Used to diferentiate a second type of Employee that has less functions than the Manager
 * Will interact with Clients and Accounts in the future
 */

public class Teller extends Employee implements Authenticatable{
	
	private String passw;
	
	public Teller(String name, String cpf) {
		super(name, cpf, 2350.0);
	}

	//Overrides
		//password
			@Override
			public void setPassw(String passw) {
				this.passw=passw;
			}
		
			@Override
			public boolean checkPassw(String passw) {
				if(this.passw.equals(passw)) {
					if(this.salary>0) {
						return true;
					} return false;
				}else return false;
			}

}
