package day09.problem07;

import day09.problem07.bean.Coder;
import day09.problem07.bean.Company;
import day09.problem07.bean.Manager;

public class Test7 {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.setName("张小强");
        m.setSalary(9000.0);
        Coder c = new Coder();
        c.setName("李小亮");
        c.setSalary(5000.0);
        Company company = new Company();
        company.setFund(1000000.0);
        company.paySalary(m);
        company.paySalary(c);
    }
}
