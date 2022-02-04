package com.softka.domain;

/**
 * represents a bank account and his elementary parameters.
 *
 * @author Juan Camilo Cantillo
 */
public class BankAccount {
    /**
     * represents the account number variable.
     */
    private int accountNumber;
    /**
     * represents the account activated variable.
     */
    protected boolean activated;
    /**
     * represents the account type variable.
     */
    private String accountype;

    /**
     * Create a BankAccount with the following parameters.
     * @param accountNumber The account Number.
     * @param activated The activated.
     * @param accountype The account type.
     */
    public BankAccount(int accountNumber, boolean activated, String accountype){
        this.accountNumber = accountNumber;
        this.activated = activated;
        this.accountype = accountype;
    }
    /**
     * returns the BankAccount activated.
     * @return boolean activated.
     */
    public boolean getActived() {
        return this.activated;
    }
    /**
     * is responsible for giving a value to attribute type.
     * @param activated the activated of the BankAccount.
     */
    public void setActivated(boolean activated){
        this.activated = activated;
    }
    /**
     * about write the method toString.
     * @return String for each of the variables.
     */
    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", activated=" + activated +
                ", accountype='" + accountype + '\'' +
                '}';
    }
}
