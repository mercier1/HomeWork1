package Modul03.HomeWork3_1.Home3_4;

public class User {
    private String name;
    private int balance;
    private int monthsOfEmpl;
    private String companyName;
    private int salary;
    private String currency;

    public User(String name, int balance, int monthsOfEmpl, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmpl = monthsOfEmpl;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    // public User(){}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMonthsOfEmpl() {
        return monthsOfEmpl;
    }

    public void setMonthsOfEmpl(int monthsOfEmpl) {
        this.monthsOfEmpl = monthsOfEmpl;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }


    public void paySalary() {
        salary += balance;
    }

    public void withdraw(int summ) {         //снимает деньги с баланса с комиссией 5%, если сумма < 1000 и комиссией 10% в других случаях
        if (balance < 1000) {
            summ -= balance * 0.05;
        } else {
            summ -= balance * 0.1;
        }
    }

    public void companyNameLenght() {   //вычисляет длину имя компании
        companyName = "name";
        int length = companyName.length();
    }

    public void monthIncreaser(int addMonth) {     //увеличивает monthsOfEmployment на addMonth
        monthsOfEmpl += addMonth;
    }


}
