package com.pluralsight;

import java.time.LocalDate;

public class CheckingAccount extends Account{
    private long routingNo;
    private double interestOwed;
    private double minimumBalance;

    public CheckingAccount(String owner, String accountName, int accountNumber,
                           double initialDeposit, LocalDate dateOpened,
                           long routingNo, double interestOwed,
                           double minimumBalance){
        super(owner, accountName, accountNumber, initialDeposit, dateOpened);
        this.routingNo=routingNo;
        this.interestOwed=interestOwed;
        this.minimumBalance=minimumBalance;
    }

    public long getRoutingNo() {
        return routingNo;
    }

    public void setRoutingNo(long routingNo) {
        this.routingNo = routingNo;
    }

    public double getInterestOwed() {
        return interestOwed;
    }

    public void setInterestOwed(double interestOwed) {
        this.interestOwed = interestOwed;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }
}
