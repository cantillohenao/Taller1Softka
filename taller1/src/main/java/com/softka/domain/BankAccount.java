package com.softka.domain;

public class BankAccount {
    private int accountNumber;
    protected boolean activated;

    public BankAccount(int accountNumber, boolean activated){
        this.accountNumber = accountNumber;
        this.activated = activated;
    }
    public boolean getActived() {
        return this.activated;
    }
    public void setActivated(boolean activated){
        this.activated = activated;
    }
}
