package Modul04;

public abstract class Bank {
    private long id;
    private String bankCountry;
    private Currency currency;
    private int numberOfEmployees;
    private double avrSalaryOfEmployee;
    private long rating;
    private long totalCapital;
    public static final int US_BANK_LIMIT_WITHDRAWAL_USD=1000;
    public static final int US_BANK_LIMIT_WITHDRAWAL_EUR=1200;
    public static final int US_BANK_LIMIT_FUNDING_EUR=10000;
    public static final int US_BANK_COMMISIN_LESS_EUR=1000;

    public static final int EUR_BANK_LIMIT_WITHDRAWAL_USD=2000;
    public static final int EUR_BANK_LIMIT_WITHDRAWAL_EUR=2200;
    public static final int EUR_BANK_LIMIT_FUNDING_USD=20000;
    public static final int EUR_BANK_LIMIT_FUNDING_UER=10000;
    public static final int EUR_BANK_COMMISIN_LESS_USD=1000;
    public static final int EUR_BANK_COMMISIN_MORE_USD=1000;
    public static final int EUR_BANK_COMMISIN_LESS_EUR=1000;
    public static final int EUR_BANK_COMMISIN_MORE_EUR=1000;

    public static final int CHINA_BANK_LIMIT_WITHDRAWAL_USD=100;
    public static final int CHINA_BANK_LIMIT_WITHDRAWAL_EUR=150;
    public static final int CHINA_BANK_LIMIT_FUNDING_EUR=5000;
    public static final int CHINA_BANK_LIMIT_FUNDING_USD=10000;
    public static final int CHINA_BANK_COMMISIN_LESS_USD=1000;
    public static final int CHINA_BANK_COMMISIN_MORE_USD=1000;
    public static final int CHINA_BANK_COMMISIN_MORE_EUR=1000;
    public static final int CHINA_BANK_COMMISIN_LESS_EUR=1000;

    public Bank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        this.id = id;
        this.bankCountry = bankCountry;
        this.currency = currency;
        this.numberOfEmployees = numberOfEmployees;
        this.avrSalaryOfEmployee = avrSalaryOfEmployee;
        this.rating = rating;
        this.totalCapital = totalCapital;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBankCountry() {
        return bankCountry;
    }

    public void setBankCountry(String bankCountry) {
        this.bankCountry = bankCountry;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public double getAvrSalaryOfEmployee() {
        return avrSalaryOfEmployee;
    }

    public void setAvrSalaryOfEmployee(double avrSalaryOfEmployee) {
        this.avrSalaryOfEmployee = avrSalaryOfEmployee;
    }

    public long getRating() {
        return rating;
    }

    public void setRating(long rating) {
        this.rating = rating;
    }

    public long getTotalCapital() {
        return totalCapital;
    }

    public void setTotalCapital(long totalCapital) {
        this.totalCapital = totalCapital;
    }

    abstract int getLimitOfWithdrawal();

    abstract int getLimitOfFunding();

    abstract int getMonthlyRate();

    abstract int getCommission(int summ);

    double moneyPaidMonthlyForSalary() {
        return moneyPaidMonthlyForSalary();
    }


}
