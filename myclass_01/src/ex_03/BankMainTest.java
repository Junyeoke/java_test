package ex_03;

public class BankMainTest {

	public static void main(String[] args) {
		
		Bank bank = new Bank();
		
		bank.deposit(50_000);
		bank.showInfo();
		bank.withdraw(5_000);
		bank.showInfo();
		bank.withdraw(50_000);
		bank.showInfo();
		

	}

}
