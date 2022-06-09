package edu.ufp.inf.lp2._04_bank;

/**
 *
 * @author rui
 */
public interface AccountMoneyI {

    public double withdraw(double amount) throws OverWithdrawException, IllicitDepositException;// throws OverWithdrawException;
    public double deposit(double amount) throws IllicitDepositException;// throws IllicitDepositException;
    public double transfer(AccountMoneyI destination, double amount) throws IllicitDepositException, OverWithdrawException;// throws OverWithdrawException, IllicitDepositException;
    public double balance();
}