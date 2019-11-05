package day09.problem07.bean;

import day09.problem07.service.Money;

public class Company implements Money {
    private double fund;

    public double getFund() {
        return fund;
    }

    public void setFund(double fund) {
        this.fund = fund;
    }

    @Override
    public void paySalary(Employee emp) {
        fund -= emp.getSalary();
        System.out.println("给"+emp.getName()+"发工资 "+emp.getSalary()+" 元，公司剩余："+fund+" 元");
    }
}
