package tests;
import classes.*;

public class CreatingAccountsTest {
	public static void main(String[] args) {
		System.out.println("This test will feature three clients - Adalberto, Rosana and Kleber");
		
		Client adalb = new Client("Adalberto","1234563212");
		Client rosana = new Client("Rosana", "54212123543");
		Client kleber = new Client("Kleber", "35162162512");
		
		System.out.println("Adalberto will have both savings and checking accounts, Rosana will have only savings");
		System.out.println("and Kleber will have only checking.");
		System.out.println("Their balance will be respectively: R$2500, R$700, R$5000 and R$1250");
		
		Savings adalbS = new Savings(adalb,1244,2500.0);
		Checking adalbC = new Checking(adalb,1245,700.0);
		
		Savings rosanaS = new Savings(rosana,4321,5000.0);
		
		Checking kleberC = new Checking(kleber,6537,1250.0);
		
		
		
		System.out.println("============ \n");
		System.out.println("Checking for credit in their accounts");
		System.out.println("------");
		System.out.println("Adalberto");
		System.out.println("Savings: R$"+ adalbS.getCredit());
		System.out.println("Checking: R$" + adalbC.getCredit());
		System.out.println("------");
		
		rosanaS.enableCredit();
		System.out.println("Rosana");
		System.out.println("Savings: R$" + rosanaS.getCredit());
		System.out.println("------");
		
		System.out.println("Kleber");
		System.out.println("Checking: R$" + kleberC.getCredit());
		System.out.println("============ \n");
		
		System.out.println("The following operations will happen");
		System.out.println("------");
		System.out.println("Adalberto transfers R$200.0 from his checking to his savings");
		System.out.println("Rosana deposits R$670.50 to her savings");
		System.out.println("Kleber withdraws R$133.7 from his checking");
		System.out.println("Monthly earnings are added to savings");
		System.out.println("Adalberto transfers R$500 from his savings to Kleber");
		System.out.println("Everyone's current earnings and balance are displayed");
		System.out.println("------");
		
		adalbC.transfer(200.0, adalbS);
		rosanaS.deposit(670.5);
		kleberC.withdraw(133.7);
		
		adalbS.addEarnings(); 
		adalbC.addEarnings();
		rosanaS.addEarnings();
		kleberC.addEarnings();
		
		adalbS.transfer(500, kleberC);
		
		System.out.println("Adalberto");
		System.out.println("  Savings:\n   • Balance: R$" + adalbS.getBalance() +
											"\n   • Earnings: R$"+ adalbS.earnings());
		System.out.println("  Checkings:\n   • Balance: R$"+ adalbC.getBalance()+
											"\n   • Earnings: R$"+ adalbC.earnings());
		
		System.out.println("\nRosana");
		System.out.println("  Savings:\n   • Balance: R$" + rosanaS.getBalance() +
											"\n   • Earnings: R$"+ rosanaS.earnings());
		System.out.println("\nKleber");
		System.out.println("  Checkings:\n   • Balance: R$"+ kleberC.getBalance()+
											"\n   • Earnings: R$"+ kleberC.earnings());
	}
}
