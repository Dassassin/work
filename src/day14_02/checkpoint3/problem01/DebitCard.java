package day14_02.checkpoint3.problem01;

import day14_02.checkpoint3.problem01.bean.NoMenoyException;

public class DebitCard {
    private String accountNumber;
    private int money;

    public DebitCard() {

    }

    public DebitCard(String accountNumber, int money) {
        this.setAccountNumber(accountNumber);
        this.setMoney(money);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        if (money<0){
            throw new NoMenoyException("余额不能为负数");
        }
        this.money = money;
    }
}
