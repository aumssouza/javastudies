package tests;
import classes.*;
import java.util.Scanner;
public class PasswordLoginTest {
	
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in); //will be used for reading user input
		String input=""; //will store said input for password tests
		String exitCheck=""; //used to end the run
		
		System.out.println("This test will feature a Manager and a Teller - Kleber and Carlo");
		System.out.println("You will be able to login as one of them to check your current salary");
		System.out.println("And, if you're Kleber, you will be able to raise it or fire either Carlos or yourself");
		System.out.println("If you're fired, you won't be able to login anymore");
		System.out.println("===============");
		
		System.out.println("Kleber's password is batata");
		System.out.println("Carlo's password is churrasqueira");
		
		Manager kleber = new Manager("Kleber","12344567789");
		kleber.setPassw("batata");
		
		Teller carlo= new Teller("Carlo","99887766554");
		carlo.setPassw("churrasqueira");
		System.out.println("===================");
		
		Employee pointer;
		int chosen;
		
		while(!exitCheck.equals("exit")) {
			System.out.println("Do you wish to login as Kleber or Carlo?(Type K or C)");
			input=in.nextLine();
			if(input.equals("K") || input.equals("k")) {
				pointer=kleber;
				chosen=1;
			} else if(input.equals("C") || input.equals("c")) {
				pointer=carlo;
				chosen=2;
			}else {
				System.out.println("Not a valid choice, try again\n");
				pointer=null;
				chosen=0;
			}
			
			if(pointer!=null) {
				boolean logged=false;
				System.out.print("Type in "+pointer.getName()+"'s password: ");
				input=in.nextLine();
				if(chosen==1)logged=kleber.checkPassw(input);
				if(chosen==2)logged=carlo.checkPassw(exitCheck);
				while(logged) {
					System.out.println("Hello!");
					System.out.println("-----");
					System.out.println("You're logged in as "+pointer.getName());
					System.out.println("CPF: "+pointer.getCpf());
					System.out.println("Salary: R$"+pointer.getSalary());
					System.out.println("--");
					System.out.println("Operations");
					System.out.println("--");
					if(chosen==1) {
						System.out.println("R - Give an employee a raise");
						System.out.println("F - Fire an employee");
					}
					System.out.println("E - Exit");
					input=in.nextLine();
					if(input.equals("E") || input.equals("e"))logged=false;
					else if((input.equals("R") || input.equals("r")) && chosen==1) {
						System.out.println("Deseja aumentar o salário ");
					} else if((input.equals("F") || input.equals("F")) && chosen==1){
						
					} else {
						System.out.println("Opção inválida\n\n\n");
					}
				}
				
			}
		}
		System.out.println("===================");
	}
	
	
}
