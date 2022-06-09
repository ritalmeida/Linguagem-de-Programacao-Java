package edu.ufp.inf.lp2._04_bank;

import java.util.logging.Level;
import java.util.logging.Logger;

public class AccountSafe extends Account {

	public AccountSafe(String accountNumber, double balance, Client owner) {

		super(accountNumber, balance, owner);
	}

	public AccountSafe(String accountNumber, double balance) {

		super(accountNumber, balance);
	}

	@Override
	public double withdraw(double amount) throws OverWithdrawException, IllicitDepositException {
		
		if(super.getBalance() > amount) {
			super.setBalance(getBalance() - amount);
			return super.getBalance();
		}
		Logger.getLogger(this.getClass().getName()).log(Level.INFO, "Not enough money to withdraw!!");
		return super.getBalance();
	}

	@Override
	public double deposit(double amount) throws IllicitDepositException {

		if(amount > 0.0){
			super.setBalance(super.getBalance() + amount);
			return super.getBalance();
		}
		Logger.getLogger(this.getClass().getName()).log(Level.INFO, "Cannot deposit negative amounts!!");
		return super.getBalance();
	}

	@Override
	public double transfer(AccountMoneyI destination, double amount) throws IllicitDepositException, OverWithdrawException {

		double prevBalance = this.balance();
		double b = this.withdraw(amount);

		if (prevBalance > b){

			destination.deposit(amount);
		}
		return super.getBalance();
	}
	
	public double balance() {
		
		return super.getBalance();
	}

	@Override
	public Client getAccountOwner() throws AccountOwnerNotDefinedException {

		return null;
	}

	@Override
	public void setAccountOwner(Client owner) {

	}
}
