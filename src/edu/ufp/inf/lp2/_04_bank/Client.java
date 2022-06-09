package edu.ufp.inf.lp2._04_bank;

import edu.ufp.inf.lp2._01_intro.pl.Person;
import edu.ufp.inf.lp2._01_intro.pl.Date;

import java.util.ArrayList;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Client extends Person implements ClientRelacionshipsI {

    private final String vatNumber; //numero de contribuinte
    private final ArrayList<Account> accounts = new ArrayList<>();

    /**
     * @param id - client's id
     * @param name - client's name
     * @param address - client's address
     * @param birth - client's birth
     * @param vatnumber - client's vatNumber
     */
    public Client(String id, String name, String address, Date birth, String vatnumber) {

        super(id, name, address, birth);
        this.vatNumber=vatnumber;
    }

    /**
     * @param id - client's id
     * @param name - client's name
     * @param address - client's address
     * @param birth - client's birth
     * @param vatnumber - client's vatNumber
     * @param account - client's account
     */
    public Client(String id, String name, String address, Date birth, String vatnumber, Account account) {

        this(id, name, address, birth, vatnumber);
        this.addAccount(account);
    }


    /**
     * @param id - client's id
     * @param name - client's name
     * @param address - client's address
     * @param birth - client's birth
     * @param account- client's account
     */
    public Client(String id, String name, String address, Date birth, Account account) {

        this(id, name, address, birth, "");
        this.addAccount(account);
    }

    /**
     * @param newAccount - a brand new account
     */
    public final void addAccount(Account newAccount) {

        for (Account a : this.accounts){

            if (a.getAccountNumber().compareTo(newAccount.getAccountNumber()) == 0){

                Logger.getLogger(this.getClass().getName()).log(Level.INFO, "Account not defined yet!!");
                return;
            }
        }

        this.accounts.add(newAccount);
        newAccount.setOwner(this);
    }

    /**
     * @return the vatNumber
     */
    public String getVatNumber() {

        return vatNumber;
    }

    public void listAccounts() {

        for (Account ac : accounts) {
            System.out.println("Client - list(): client " + this.getName() + " balance = " + ((AccountMoneyI) ac).balance());
        }
    }

    public Account getAccount(int index) {

        if (index > 0 && index < this.accounts.size()){

            return this.accounts.get(index);
        }
        return null;
        //return (index < this.accounts.size() ? this.accounts.get(index) : null);
    }

    @Override
    public String toString() {
        return "Client{" + super.toString() +
                "vatNumber='" + vatNumber + '\'' +
                ", accounts=" + accounts +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client=(Client) o;
        return super.equals(o) && Objects.equals(vatNumber, client.vatNumber) &&
                Objects.equals(accounts, client.accounts);
    }

    @Override
    public int hashCode() {

        return Objects.hash(vatNumber, accounts);
    }
}