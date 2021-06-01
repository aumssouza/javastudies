package classes;
/*
 * Manager class
 * Employee that can interact with other Employees by changing their salaries and 
 * disabling login operations
 */
public class Manager extends Employee implements Authenticatable {
	private String passw;
	
	public Manager(String name, String cpf) {
		super(name, cpf, 5250.0);
		
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
				if(this.salary<1.0) {
					return false;
				}else return true;
			}else return false;
		}
		
	//salary operations
		
		public boolean fire(Employee fired) {
			if(fired.salary>0) {
				fired.raiseSalary(salary*(-1));
				return true;
			}else return false;
		}
	
	
		
		public boolean raise(Employee promoted,int percent) {
			if(promoted.salary<8000.0) {
				promoted.raiseSalary((promoted.salary*percent)/100);
				return true;
			}else return false;
		}
		
}
