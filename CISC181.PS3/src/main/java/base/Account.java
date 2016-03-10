package base;

import java.util.Date;
/**
 * 
 * @author Russell
 *
 */
public class Account {

	//Variables
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = new Date();
	
	//Constructors
	public Account(){
		
	}
	
	public Account(int id, double balance){
		this.id = id;
		this.balance = balance;
	}

	//Setters and getters for everything
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	//Returns the monthly interest rate
	public double getMonthlyInterestRate(){
		return annualInterestRate / 12;
	}
	
	//Withdraw and Deposit methods, with 
	//Exception for withdrawing
	/**
	 * 
	 * @param amount
	 * @throws InsufficientFundsException
	 */
	public void withdraw(double amount) throws InsufficientFundsException{
		if (amount > balance){
			System.out.println("Your withdrawal has exceeded your balance.");
			throw new InsufficientFundsException(amount);
		}else
		balance -= amount;
	}
	
	public void deposit(double amount){
		balance += amount;
	}
	
}
