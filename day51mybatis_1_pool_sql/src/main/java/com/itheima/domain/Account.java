package com.itheima.domain;

public class Account {
    private int accountId;
    private int uid;
    private double money;
    private User user;

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public double getmoney() {
        return money;
    }

    public void setMoeny(double moeny) {
        this.money = moeny;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", uid=" + uid +
                ", moeny=" + money +
                ", user=" + user +
                '}';
    }
}
