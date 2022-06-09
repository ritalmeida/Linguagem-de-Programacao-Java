package edu.ufp.inf.lp2._04_bank;

public class AccountUnsafe extends Account {

    public AccountUnsafe(String accountNumber, double balance, Client owner) {

        super(accountNumber, balance, owner);
    }

    public AccountUnsafe(String accountNumber, double balance) {

        super(accountNumber, balance);
    }

    @Override
    public double withdraw(double amount) {      //levantar dinheiro

        super.setBalance(super.getBalance()-amount);
        return super.getBalance();
    }

    @Override
    public double deposit(double amount) {

        super.setBalance(super.getBalance()+amount);
        return super.getBalance();
    }

    @Override
    public double transfer(AccountMoneyI destination, double amount) {
        //depositar da conta corrente para a conta destino

        double b = this.withdraw(amount);
        ((AccountUnsafe)destination).deposit(amount);
        return b;
    }

    @Override
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
