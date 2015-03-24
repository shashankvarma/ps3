package ps3;

public class Test extends Account {
	public static void main(String[] args) {

		Account test = new Account(1122, 10000, 4.5);

		test.deposit(2000);
		System.out.println("Your balance is $" + test.getbalance()
				+ " after deposit");
		try {
			test.withdraw(2500);
			System.out.println("Balance after drawing $500: "
					+ test.getbalance());

			System.out.println(" you want to withdraw $10000");
			test.withdraw(10000);
		} catch (InsufficientFundsException error) {
			System.out.println("You have to pull $" + error.getAmount()
					+ " over balance");
			error.printStackTrace();
		}
	}

}