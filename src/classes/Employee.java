package classes;
/*
 * Employee class
 * Holds all the generic information any employee would have in the system
 * Salary only has a raise method so far, but it can be used to reduce an employee's money
 * if the raise value in raiseSalary is negative
 */
public abstract class Employee{
	String name;
	String cpf;
	protected double salary;
	
	
	
	public Employee(String name, String cpf, double salary) {
		this.name = name;
		this.cpf = cpf;
		this.salary = salary;
	}
	protected void raiseSalary(double raise) {
		this.salary+=raise;
	}
	public String getName() {
		return name;
	}
	public String getCpf() {
		return cpf;
	}
	public double getSalary() {
		return salary;
	}
	
}
