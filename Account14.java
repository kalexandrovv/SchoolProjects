package temi12do14;

import java.util.Date;

public class Account14 {
	private int id=0;
	private double balance=0;
	public static double yearInterestRate=4.5;
	private Date dateCreated=new Date();
	Account14(){
		//default values
	}
	Account14(int newId, double newBalance){
		this.setID(newId);
		this.setBalance(newBalance);

		
	}

	public Date getDateCreated() {
	return dateCreated;
}
	void setID(int newID) {
		id=newID;
	}
	void setBalance(double newBalance) {
		balance=newBalance;
	}
	static void setYearInterestRate(int newYearInterstRate) {
		yearInterestRate=newYearInterstRate;
	}
	int getID() {
		return id;
	}
	double getBalance() {
		return this.balance;
	}
	public static double getYearInterestRate() {
		return yearInterestRate;
	}
	public static double getMonthlyInterestRate() {
		return yearInterestRate/12;
	}
	public double getMontlyInterest() {
		return (yearInterestRate/12/100)*balance;
	}
	void withdraw(int a) {
		balance-=a;
	}
	void deposit(int a) {
		balance+=a;
	}
}
