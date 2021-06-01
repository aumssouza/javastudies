package classes;
/*
 * Client class
 * Only holds client's name and cpf so far, used for creating accounts
 * Private attributes to make it so they don't get to be altered
 */
public class Client implements Authenticatable{
	private String name;
	private String cpf;
	private String passw;
	
	public Client(String name, String cpf) {
		this.name = name;
		this.cpf = cpf;
	}

	public String getName() {
		return name;
	}

	public String getCpf() {
		return cpf;
	}
	//overrides
	@Override
	public void setPassw(String passw) {
		this.passw=passw;
		
	}

	@Override
	public boolean checkPassw(String passw) {
		if(this.passw==passw) {
			return true;
		}else return false;
	}
	
}
