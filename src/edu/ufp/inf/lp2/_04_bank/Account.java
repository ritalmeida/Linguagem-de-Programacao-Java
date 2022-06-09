package edu.ufp.inf.lp2._04_bank;

import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class Account implements AccountMoneyI, AccountOwnershipI {

    private final String accountNumber; //Generate ONLY getAccountNumber()
    private double balance;             //Generate getBalance()/setBalance(b) OR
    //protected double balance;         //use protected field instead
    private Client owner;               //Use methods from AccountRelationshipsI

    public static void main(String args[]){

        //Account a1 = new Account("1111", 200.0); //Compile error: cannot instantiate abstract class
        Account a1 = new AccountUnsafe("1111", 200.0);
        //a1.withdraw(200.0);
    }
    /**
     * @param accountNumber - number of the account
     * @param balance - balance of the account
     * @param owner - owner of the account
     */
    public Account(String accountNumber, double balance, Client owner) {

        this.accountNumber=accountNumber;
        this.balance=balance;
        this.owner=owner;
        if (owner != null) {
            owner.addAccount(this);
        }
    }

    /**
     * @param accountNumber - number of the account
     * @param balance - balance of the account
     */
    public Account(String accountNumber, double balance) {

        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = null;
    }

    /**
     * @return the accountNumber
     */
    public String getAccountNumber() {

        return accountNumber;
    }

    /**
     * @return the owner
     */
    protected Client getOwner() {

        return owner;
    }

    /**
     * @param owner the owner to set
     */
    protected void setOwner(Client owner) {

        this.owner = owner;
    }

    /**
     * @return the balance
     */
    protected double getBalance() {

        return balance;
    }

    /**
     * @param balance the balance to set
     */
    protected void setBalance(double balance) {

        this.balance = balance;
    }

    public Client getAccountOwner() throws AccountOwnerNotDefinedException{

        if (this.owner != null){

            return this.getOwner();
        }

        Logger.getLogger(this.getClass().getName()).log(Level.INFO, "Owner not defined yet!!");
        return null;
    }

    public void setAccountOwner(Client owner){

        if (this.owner == null){

            this.setOwner(owner);
            owner.addAccount(this);
        }

    }
}