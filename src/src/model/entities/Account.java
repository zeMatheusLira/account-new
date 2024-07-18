package model.entities;

import model.domainexception.DomainException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(){
    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount){
        this.balance = this.balance + amount;
    }

    public void withdrawLimit(Double amount) throws DomainException {
        if (amount > balance){
            throw new DomainException("Not enough balance");
        }
        if (withdrawLimit < amount){
            throw new DomainException("The amount exceeds withdraw limit");
        }
        this.balance = this.balance - amount;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Account ");
        sb.append("number= ").append(number);
        sb.append(", holder= ").append(holder);
        sb.append(", balance= ").append(balance);
        sb.append(", withdrawLimit= ").append(withdrawLimit);
        return sb.toString();
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }
}
