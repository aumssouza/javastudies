package classes;
/*
 * Client class
 * Only holds client's name and cpf so far, used for creating accounts
 * Private attributes to make it so they don't get to be altered
 */
public class Client {
	private String name;
	private String cpf;
	
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
	
}
