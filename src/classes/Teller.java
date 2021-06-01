package classes;

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
