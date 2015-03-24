package ps3;

import java.util.Date;

public class Account {

	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = new Date();

	public Account() {
	}

	public Account(int id, double balance, double InterestRate) {
		this.id = id;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getbalance() {
		return balance;
	}

	public void setbalance(double balance) {
		this.balance = balance;
	}

	public double getannualInterestRate() {
		return annualInterestRate;
	}

	public void setannualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	double getMonthlyInterestRate() {
		return balance * ((annualInterestRate / 100) / 12);
	}

	public void withdraw(double Amount) throws InsufficientFundsException {
		if (Amount <= balance) {
			balance -= Amount;
		} else {
			double needs = Amount - balance;
			throw new InsufficientFundsException(needs);
		}
	}

	public void deposit(double Amount) {
		balance += Amount;
	}

}