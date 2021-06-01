package tests;
import classes.*;
import java.util.Scanner;

public class CreatingEmployeesTest {
	public static void main(String[] args) {
		boolean logged=false; //used for login sequences
		Scanner in= new Scanner(System.in); //used to get user input
		String input=""; //used to store user input
			
		System.out.println("This test will feature two Employees - Manager Kleber and Teller Carlos");
		Manager kleber = new Manager("Kleber Farias","11223344556");
		kleber.setPassw("batata");
		Teller carlos= new Teller("Carlos Adalberto","10998877665");
		carlos.setPassw("churrasqueira");
		
		System.out.println("Both have default starting salaries for their roles, Carlos will have 2 raises and Kleber will be fired");
		System.out.println("For printing, we will use an Employee object");
		Employee pointer=null;
		
		System.out.println("===============\n");
		System.out.println("We will now have you log in as Kleber, his password is batata");
		while(logged==false) {
			System.out.print("Type in Kleber's password: ");
			input=in.next();
			if(kleber.checkPassw(input)) {
				System.out.println("Login successfull!");
				System.out.println("-----");
				logged=true;
				pointer=kleber;
			}else {
				System.out.println("Wrong password, it's batata.\nTry again");
			}
		}
		System.out.println("The Employee object now points to Kleber:");
		System.out.println("Manager object that points to Kleber:" + kleber);
		System.out.println("The employee object pointing to Kleber:"+ pointer);
		System.out.println("-----");
		
		System.out.println("\nPrinting Kleber's information with pointer object:");
		System.out.println("Full name: "+pointer.getName());
		System.out.println("CPF: "+pointer.getCpf());
		System.out.println("Current salary: R$"+pointer.getSalary());
		System.out.println("-----");
		
		System.out.println("Kleber will now raise Carlos' salary once after checking it");
		System.out.println("-----");
		System.out.println("We will leave the pointer on Carlos for now");
		System.out.println("Employee pointing to Kleber: "+pointer);
		pointer=carlos;
		System.out.println("Employee now pointing to Carlos: "+pointer);
		System.out.println("-----");
		System.out.println("Carlos' current salary: R$"+pointer.getSalary());
		kleber.raise(pointer, 4);
		System.out.println("Carlos' salary after 4% raise: R$"+pointer.getSalary());
		System.out.print("Now raise Carlos' salary yourself by an integer amount of your choice");
		
		int raise=in.nextInt();
		if(kleber.raise(carlos, raise)) {
			System.out.println("The "+raise+"% raise was applied, Carlos' salary is now: R$"+ pointer.getSalary());
		}
		
		System.out.println("-----");
		System.out.println("Due to Kleber doing an extra raise, he was fired");
		kleber.fire(kleber);
		System.out.println(kleber.getSalary());
		System.out.println("And now he can't log back into the system.");
		System.out.println("You can try, to log back, remember that his password is still batata");
		
		while(logged==true) {
			System.out.println(logged);
			System.out.print("Your input: ");
			input=in.next();
			if(input.equals("batata")) {
				System.out.println("Correct password!");
				logged=kleber.checkPassw(input);
				System.out.println("But you can't login, because the login controller returns "+logged);
				System.out.println("-----");
			}else {
				System.out.println("Wrong password, it's batata.");
			} 
		}
		
		System.out.println("Now sign in as Carlos, his password is churrasqueira");
		while(logged==false) {
			System.out.print("Type in Carlos' password: ");
			input=in.next();
			if(carlos.checkPassw(input)) {
				System.out.println("Login successfull!");
				System.out.println("-----");
				logged=true;
				pointer=carlos;
			}else {
				System.out.println("Wrong password, it's churrasqueira.\nTry again");
			}
		}
		
		System.out.println("\nPrinting Carlos' information with pointer object:");
		System.out.println("Full name: "+pointer.getName());
		System.out.println("CPF: "+pointer.getCpf());
		System.out.println("Current salary: R$"+pointer.getSalary());
		System.out.println("-----");
		
		
		System.out.println("Ending test for now");
	}
}
