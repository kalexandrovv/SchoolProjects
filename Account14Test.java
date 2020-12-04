package temi12do14;

public class Account14Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Account14 ac = new Account14(1122, 20000);
			ac.withdraw(2500);
			ac.deposit(3000);
			System.out.println(ac.getBalance());
			System.out.println(ac.getMonthlyInterestRate());
			System.out.println(ac.getDateCreated());
			
		}
	}
